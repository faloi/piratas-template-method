package domain

import static org.junit.Assert.*
import org.junit.Test

class testXXX {
	@Test
	void "no se puede cumplir una mision si la tripulacion es < a 90% de la capacidad"() {
		def unBarcoPirata = new BarcoPirata(capacidad: 10)
		assert false == new Mision().puedeSerCumplidaPor(unBarcoPirata)
	}
	
	@Test
	void "se puede cumplir convertirse en leyenda si la tripulacion es >= a 90% de la capacidad y los piratas tienen al menos 10 items"() {
		def guybrushThreepwood = new Pirata(
			items: ["brujula", "mapa", "catalejo", "boxer", "axeSeduction", "gorro", "cartaAElaine", "mono", "revistaDePiratas", "espada"]
		)
		
		def unBarcoPirata = new BarcoPirata(capacidad: 1, tripulacion: [guybrushThreepwood])
		
		assert Mision.CONVERTIRSE_EN_LEYENDA().puedeSerCumplidaPor(unBarcoPirata)
	}
	
	@Test
	void "no se puede cumplir convertirse en leyenda si todos los piratas no tienen al menos 10 items"() {
		def elaineMarley = new Pirata(items: ["perfume"])
		def guybrushThreepwood = new Pirata(
			items: ["brujula", "mapa", "catalejo", "boxer", "axeSeduction", "gorro", "cartaAElaine", "mono", "revistaDePiratas", "espada"]
		)
		
		def unBarcoPirata = new BarcoPirata(capacidad: 2, tripulacion: [elaineMarley, guybrushThreepwood])
		
		assert false == Mision.CONVERTIRSE_EN_LEYENDA().puedeSerCumplidaPor(unBarcoPirata)
	}
	
	@Test
	void "se puede cumplir busqueda del tesoro si todos los piratas tienen un elemento clave y como maximo 5 monedas"() {
		def haggisMcMutton = new Pirata(items: ["afeitadora", "tijeras", "botellaDeGrogXD"], monedas: 4)
		def reneRottingham = new Pirata(items: ["peluca", "mapa"], monedas: 2)
		
		def unBarcoPirata = new BarcoPirata(capacidad: 2, tripulacion: [haggisMcMutton, reneRottingham])
		
		assert Mision.BUSQUEDA_DEL_TESORO().puedeSerCumplidaPor(unBarcoPirata)
	}

	@Test
	void "no se puede cumplir busqueda del tesoro si algun pirata tiene mas de 5 monedas"() {
		def largoLaGrande = new Pirata(items: ["brujula", "pala"], monedas: 10000)
		def unBarcoPirata = new BarcoPirata(capacidad: 1, tripulacion: [largoLaGrande])
		
		assert false == Mision.BUSQUEDA_DEL_TESORO().puedeSerCumplidaPor(unBarcoPirata)
	}
	
}

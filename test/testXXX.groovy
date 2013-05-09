import static org.junit.Assert.*;

import domain.*
import org.junit.Test

class testXXX {
	@Test
	void "no se puede cumplir una mision si la tripulacion es < a 90% de la capacidad"() {
		def unBarcoPirata = new BarcoPirata(capacidad: 10)
		assert false == new ConvertirseEnLeyenda().puedeSerCumplidaPor(unBarcoPirata)
	}
	
	@Test
	void "se puede cumplir convertirse en leyenda si la tripulacion es >= a 90% de la capacidad y los piratas tienen al menos 10 items"() {
		def guybrushThreepwood = new Pirata(
			items: ["brujula", "mapa", "catalejo", "boxer", "axeSeduction", "gorro", "cartaAElaine", "mono", "revistaDePiratas", "espada"]
		)
		
		def unBarcoPirata = new BarcoPirata(capacidad: 1, tripulacion: [guybrushThreepwood])
		
		assert new ConvertirseEnLeyenda().puedeSerCumplidaPor(unBarcoPirata)
	}
	
	@Test
	void "no se puede cumplir convertirse en leyenda si todos los piratas no tienen al menos 10 items"() {
		def elaineMarley = new Pirata(items: ["perfume"])
		def guybrushThreepwood = new Pirata(
			items: ["brujula", "mapa", "catalejo", "boxer", "axeSeduction", "gorro", "cartaAElaine", "mono", "revistaDePiratas", "espada"]
		)
		
		def unBarcoPirata = new BarcoPirata(capacidad: 2, tripulacion: [elaineMarley, guybrushThreepwood])
		
		assert false == new ConvertirseEnLeyenda().puedeSerCumplidaPor(unBarcoPirata)
	}

}

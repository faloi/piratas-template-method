import static org.junit.Assert.*;

import domain.*
import org.junit.Test

class testXXX {
	@Test
	void "no se puede cumplir una mision si la tripulacion es < a 90% de la capacidad"() {
		def unBarcoPirata = new BarcoPirata(capacidad: 10)
		assert false == new BusquedaDelTesoro().puedeSerCumplidaPor(unBarcoPirata)
	}
}

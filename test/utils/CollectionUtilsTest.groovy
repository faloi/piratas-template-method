package utils

import static org.junit.Assert.*;
import org.junit.Test

class CollectionUtilsTest {

	static { CollectionUtils }
	
	@Test
	void "containsAny retorna true si la coleccion contiene algun elemento de la segunda coleccion"() {
		assert [1, 2, 3].containsAny([2, 5])
	}
	
	@Test
	void "containsAny retorna false si la coleccion no contiene ningun elemento de la segunda coleccion"() {
		assert false == ["Fede", "Pablo", "Solange"].containsAny(["Juan", "Fernando"])
	}
	
}

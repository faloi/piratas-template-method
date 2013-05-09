package domain;

class Mision {
	def condicionAdicional
	
	def puedeSerCumplidaPor(unBarcoPirata) {
		unBarcoPirata.tieneSuficienteTripulacion()
	}
}

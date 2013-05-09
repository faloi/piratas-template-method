package domain;

class ConvertirseEnLeyenda {
	def puedeSerCumplidaPor(unBarcoPirata) {
		unBarcoPirata.tieneSuficienteTripulacion() && unBarcoPirata.tripulacion.every { it.items.size >= 10 }
	}
}

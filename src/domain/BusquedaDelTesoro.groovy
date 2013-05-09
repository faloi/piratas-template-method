package domain;

class BusquedaDelTesoro {
	def elementosNecesarios = ["brujula", "mapa", "botellaDeGrogXD"]
	
	def puedeSerCumplidaPor(unBarcoPirata) {
		def condicion = { it.items.any { elementosNecesarios.contains(it) } && it.monedas <= 5 }
		unBarcoPirata.tieneSuficienteTripulacion() && unBarcoPirata.tripulacion.every(condicion) 
	}
}

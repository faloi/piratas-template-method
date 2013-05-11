package domain;

class Mision {
	def condicionAdicional
	
	static busquedaDelTesoro() {
		def elementosRequeridos = ["brujula", "mapa", "botellaDeGrogXD"]
		new Mision(condicionAdicional: { unPirata -> unPirata.items.any { elementosRequeridos.contains(it) } && unPirata.monedas <= 5 })
	}
	
	static convertirseEnLeyenda() {
		new Mision(condicionAdicional: { unPirata -> unPirata.items.size >= 10 })
	}
	
	static saqueo(victima) {
		def maximoMonedasPermitido = 100
		new Mision(condicionAdicional: { unPirata -> unPirata.monedas < maximoMonedasPermitido })
	}
	
	def puedeSerCumplidaPor(unBarcoPirata) {
		unBarcoPirata.tieneSuficienteTripulacion() && unBarcoPirata.tripulacion.every(condicionAdicional)
	}
}

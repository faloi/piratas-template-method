package domain;

class Mision {
	def condicionAdicional = { true }
	
	static BUSQUEDA_DEL_TESORO() {
		def elementosRequeridos = ["brujula", "mapa", "botellaDeGrogXD"]
		new Mision(condicionAdicional: { it.items.any { elementosRequeridos.contains(it) } && it.monedas <= 5 })
	}
	
	static CONVERTIRSE_EN_LEYENDA() {
		new Mision(condicionAdicional: { it.items.size >= 10 })
	}
	
	static SAQUEO(victima) {
		def maximoMonedasPermitido = 100
		new Mision(condicionAdicional: { it.monedas < maximoMonedasPermitido })
	}
	
	def puedeSerCumplidaPor(unBarcoPirata) {
		unBarcoPirata.tieneSuficienteTripulacion() && unBarcoPirata.tripulacion.every(condicionAdicional)
	}
}

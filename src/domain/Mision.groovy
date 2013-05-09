package domain;

class Mision {
	def condicionAdicional = { true }
	
	static BUSQUEDA_DEL_TESORO() {
		new Mision(condicionAdicional: { it.items.any { ["brujula", "mapa", "botellaDeGrogXD"].contains(it) } && it.monedas <= 5 })
	}
	
	static CONVERTIRSE_EN_LEYENDA() {
		new Mision(condicionAdicional: { it.items.size >= 10 })
	}
	
	def puedeSerCumplidaPor(unBarcoPirata) {
		unBarcoPirata.tieneSuficienteTripulacion() && unBarcoPirata.tripulacion.every(condicionAdicional)
	}
}

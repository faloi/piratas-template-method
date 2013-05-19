package domain;

class Mision {
	def criterioAceptacionPirata
	
	static busquedaDelTesoro() {
		def itemsRequeridos = ["brujula", "mapa", "botellaDeGrogXD"]
		new Mision(criterioAceptacionPirata: { Pirata unPirata -> unPirata.contieneAlgunItem(itemsRequeridos) && unPirata.getMonedas() <= 5 })
	}
	
	static convertirseEnLeyenda() {
		new Mision(criterioAceptacionPirata: { Pirata unPirata -> unPirata.getCantidadItems() >= 10 })
	}
	
	static saqueo(victima) {
		def maximoMonedasPermitido = 100
		new Mision(criterioAceptacionPirata: { Pirata unPirata -> unPirata.getMonedas() < maximoMonedasPermitido })
	}
	
	def puedeSerCumplidaPor(unBarcoPirata) {
		unBarcoPirata.tieneSuficienteTripulacion() && unBarcoPirata.getTripulacion().every(criterioAceptacionPirata)
	}
}

package domain;

class Mision {
	def criterioAceptacionPirata

	def aceptaPirata(unPirata) {
		this.criterioAceptacionPirata(unPirata)
	}
		
	// Constructores
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
}

package domain;

class BarcoPirata {
	def capacidad, tripulacion = []
	
	def tieneSuficienteTripulacion() {
		tripulacion.size / capacidad >= 0.9
	} 
	
	def puedeCumplir(unaMision) {
		this.tieneSuficienteTripulacion() && this.getTripulacion().every { unaMision.aceptaPirata(it) }
	}
}

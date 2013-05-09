package domain;

class BarcoPirata {
	def capacidad, tripulacion = []
	
	def tieneSuficienteTripulacion() {
		tripulacion.size / capacidad >= 0.9
	} 
}

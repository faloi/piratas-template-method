package domain;

class BarcoPirata {
	def capacidad, tripulacion = []
	
	Boolean tieneSuficienteTripulacion() {
		tripulacion.size / capacidad >= 0.9
	} 
}

package domain;

class BarcoPirata {
	def capacidad, cantidadTripulantes = 0
	
	Boolean tieneSuficienteTripulacion() {
		cantidadTripulantes / capacidad >= 0.9
	} 
}

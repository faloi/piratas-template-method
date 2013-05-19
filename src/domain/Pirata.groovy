package domain

import utils.*

class Pirata {
	
	static { CollectionUtils }
	
	def items, monedas = 0
	
	def getCantidadItems() {
		this.getItems().size
	}
	
	def contieneAlgunItem(algunosItems) {
		this.getItems().containsAny(algunosItems)
	}
}

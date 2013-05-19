package utils

class CollectionUtils {
	static {
		Collection.metaClass {
			containsAny =  { anotherCollection ->
				anotherCollection.any { delegate.contains(it) }
			}
		}
	}
}
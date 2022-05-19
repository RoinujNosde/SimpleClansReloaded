package me.roinujnosde.simpleclans

object SCServices {

    private val services: MutableSet<Any> = HashSet()

    @JvmStatic fun <T> getService(type: Class<T>) : T? {
        for (service in services) {
            if (type.isInstance(service)) {
                @Suppress("UNCHECKED_CAST")
                return service as T
            }
        }
        return null
    }

    @JvmStatic fun registerService(service: Any) {
        services.add(service)
    }
}
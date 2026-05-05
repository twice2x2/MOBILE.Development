enum class OrderStatus(val description: String) {
    NEW("новый"),
    PROCESSING("в обработке"),
    SHIPPED("отправлен"),
    DELIVERED("доставлен"),
    CANCELLED("отменен");

    //Функция, которая возвращает завершенные значения
    fun isFinished(): Boolean {
        return when (this){
            DELIVERED, CANCELLED -> true
            else -> false
        }
    }
}

fun main(){

    //Вывод всех значений
    for(status in OrderStatus.values()){
        println("${status.name} - ${status.description}")
    }

    //Завершенные статусы
    val finish = OrderStatus.values().filter { it.isFinished() }.joinToString { it.name }
    println(finish)
}


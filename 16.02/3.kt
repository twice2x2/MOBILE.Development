fun printPersonInfo(name: String, age: Int = 18, city: String = "Неизвестно"){
    println("Имя: $name, Возраст: $age, Город: $city")
}

fun main(){
    printPersonInfo("Евгений", 19, "Чита")
    printPersonInfo("Евгений", 19)
    printPersonInfo("Евгений")
}

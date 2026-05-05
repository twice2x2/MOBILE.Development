//Класс
class Student(
    val name: String,
    val surname: String,
    val group: String
){
    //Свойство, которое вычисляется в блоке init
    val fullName: String
    //Блок, который выводит сообщение о созданном студенте
    init {
        fullName = "$name $surname"
        println("Создан студент: $fullName, группа: $group")
    }
}

fun main(){
    //Объекты (студенты)
    val student_1 = Student("Игорь", "Шеломенцев", "24/2")
    val student_2 = Student("Андрей", "Булгаков" , "25/2")

    //Вывод полных имен
    println(student_1.fullName)
    println(student_2.fullName)
}
class BankAccount(initialBalance: Int) {
    //Свойство с геттерами и сеттерами
    var balance: Int = initialBalance
        //Геттер
        get(){
            return field
        }
    //Сеттер
    set(value) {
        //Условие: проверка баланса
        if (value < 0){
            println("Ошибка: недостаточно средств!")
        }
        else {
            field = value;
        }
    }
}

fun main(){
    //Объект и присваивание 2000 к балансу
    val account_1 = BankAccount(1000)

    //Вывод баланса
    println(account_1.balance)

    //Вывод с ошибкой: отрицательный баланс
    account_1.balance = -500

    //Присваивание 2000 к балансу
    account_1.balance = 2000

    //Вывод баланса
    println(account_1.balance)
}
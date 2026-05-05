//Класс
class Book(
    val title: String,
    val author: String,
    var year: Int,
    var price: Int
)

fun main(){
    //Объекты (книги)
    val book_1 = Book("Война и Мир", "Толстой", 1969, 890)
    val book_2 = Book("Наказание и преступление", "Достоевский", 1866, 672)
    val book_3 = Book("Мастер и Маргарита", "Булгаков", 1966, 520)

    //Смена цены второй книги
    book_2.price = 6767

    println("Информация о книгах")
    println("1.Книга: ${book_1.title}, автор: ${book_1.author}, год издания: ${book_1.year}, цена: ${book_1.price}")
    println("2.Книга: ${book_2.title}, автор: ${book_2.author}, год издания: ${book_2.year}, цена: ${book_2.price}")
    println("3.Книга: ${book_3.title}, автор: ${book_3.author}, год издания: ${book_3.year}, цена: ${book_3.price}")
}
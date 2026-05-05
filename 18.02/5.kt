//Дата класс
data class Product(
    val id: Int,
    val name: String,
    val price: Double,
    val inStock: Boolean
)

object ProductCatalog {
    //Приватное поле
    private val _products = mutableListOf<Product>()

    //Публичное свойство
    val products: List<Product>
        get() = _products.toList()

    //Функция добавления продукта в каталог
    fun addProduct(product: Product) {
        _products.add(product)
    }

    //Функция для поиска товара по id
    fun findById(id: Int): Product? {
        return _products.find { it.id == id }
    }
}

fun main(){
    //Объекты с одинаковыми значениями
    val product_1 = Product(1, "Product1", 1000.0, true)
    val product_2 = Product(1, "Product1", 1000.0, true)
    //Вывод сравнения товаров
    println("Сравнение одинаковых товаров: ${product_1 == product_2}")

    val product_3 = product_1.copy(price = 500.0)


    println("Оригинал:   $product_1")
    println("Копия: ${product_3}")
    println("Сравнение после copy: ${product_1 == product_3}")
    println("\n")

    //Добавление товаров
    ProductCatalog.addProduct(Product(1001, "Хлеб", 30.0, true))
    ProductCatalog.addProduct(Product(1005, "Батон", 50.0, false))

    //Вывод каталога
    println("Товары в каталоге ${ProductCatalog.products.size}")
    ProductCatalog.products.forEach { product -> val stock = if (product.inStock) "в наличии" else "нет в наличии"
        println("${product.id} ${product.name.padEnd(1)} ${product.price} $stock")
    }

    //Поиск по id
    println("\nПоиск товара:")
    val found = ProductCatalog.findById(1005)
    if (found != null) {
        println("Найден: $found по id = 1005")
    } else {
        println("Товар с id 1005 не найден")
    }
}


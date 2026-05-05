fun calculateArea(radius: Double): Double {
    return Math.PI * radius * radius
}

fun calculateArea(width: Double, height: Double): Double {
    return width * height
}

fun calculateArea(base: Double, height: Double, isTriangle: Boolean = true): Double {
    return 0.5 * base * height
}

fun main(){
    println(calculateArea(2.0))
    println(calculateArea(2.0, 2.0))
    println(calculateArea(3.0, 3.0))
}
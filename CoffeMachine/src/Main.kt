fun main() {
    print("Enter your name, for your cofee: ")
    var name: String = readln()
    print("How manys spoons of sugar do you want? ")
    var sugar = readln().toInt()

    makeCoffee(sugar, name)
}

fun makeCoffee(sugarCount: Int, name: String) {
    if (sugarCount == 1) {
        println("A coffee with $sugarCount spoon of sugar for $name")
    } else if (sugarCount <= 0) {
        println("A coffee with no sugar for $name")
    } else println("A coffee with $sugarCount spoons of sugar for $name")
}
fun main() {

    print("Masukkan suhu dalam Celsius: ")

    val celsius = readln().toDouble()

    val fahrenheit = (celsius * 9 / 5) + 32
    val kelvin = celsius + 273.15

    println("Fahrenheit = $fahrenheit")
    println("Kelvin     = $kelvin")

}
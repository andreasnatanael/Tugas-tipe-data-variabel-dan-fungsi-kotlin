fun main() {

    print("Masukkan bilangan desimal: ")

    val input = readln()

    val nilaiDouble = input.toDouble()

    val nilaiInt = nilaiDouble.toInt()

    val nilaiString = nilaiDouble.toString()

    println("Nilai Double = $nilaiDouble")
    println("Nilai Int    = $nilaiInt")
    println("Nilai String = $nilaiString")

}
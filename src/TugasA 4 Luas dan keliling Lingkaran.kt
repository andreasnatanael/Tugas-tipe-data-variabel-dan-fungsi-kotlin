fun main() {

    val pi = 3.14

    print("Masukkan jari-jari lingkaran: ")

    val r = readln().toDouble()

    val luas = pi * r * r

    val keliling = 2 * pi * r

    println("Luas lingkaran     = $luas")
    println("Keliling lingkaran = $keliling")

}
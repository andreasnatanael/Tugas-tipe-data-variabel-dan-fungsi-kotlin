fun cekGanjil(bilangan: Int): String {

    return if (bilangan % 2 == 0) {
        "Genap"
    } else {
        "Ganjil"
    }
}

fun main() {

    print("Masukkan bilangan: ")

    val bilangan = readln().toInt()

    val hasil = cekGanjil(bilangan)

    println("$bilangan merupakan bilangan $hasil")
}
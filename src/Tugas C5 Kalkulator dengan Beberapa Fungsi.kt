fun tambah(a: Double, b: Double): Double {
    return a + b
}


fun kurang(a: Double, b: Double): Double {
    return a - b
}


fun kali(a: Double, b: Double): Double {
    return a * b
}


fun bagi(a: Double, b: Double): Double {
    return a / b
}


fun main() {

    println("=== KALKULATOR SEDERHANA ===")

    println("1. Penjumlahan")
    println("2. Pengurangan")
    println("3. Perkalian")
    println("4. Pembagian")


    print("Pilih operasi (1-4): ")
    val pilihan = readln().toInt()


    print("Masukkan bilangan pertama: ")
    val a = readln().toDouble()


    print("Masukkan bilangan kedua: ")
    val b = readln().toDouble()


    when (pilihan) {

        1 -> {
            val hasil = tambah(a, b)
            println("Hasil = $hasil")
        }

        2 -> {
            val hasil = kurang(a, b)
            println("Hasil = $hasil")
        }

        3 -> {
            val hasil = kali(a, b)
            println("Hasil = $hasil")
        }

        4 -> {

            if (b == 0.0) {
                println("Error: Tidak dapat melakukan pembagian dengan nol!")
            } else {

                val hasil = bagi(a, b)

                println("Hasil = $hasil")
            }
        }

        else -> {
            println("Pilihan operasi tidak valid!")
        }
    }
}
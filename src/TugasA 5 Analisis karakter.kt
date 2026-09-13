fun main() {

    print("Masukkan karakter: ")

    val karakter = readln()[0]

    val kodeAscii = karakter.code

    val termasukHuruf = karakter.isLetter()

    val termasukAngka = karakter.isDigit()

    println("Karakter        = $karakter")
    println("Kode ASCII      = $kodeAscii")
    println("Termasuk huruf  = $termasukHuruf")
    println("Termasuk angka  = $termasukAngka")

}
fun main() {

    print("Masukkan nama barang: ")
    val namaBarang = readln()

    print("Masukkan harga barang: ")
    val harga = readln().toDouble()

    print("Masukkan jumlah barang: ")
    val jumlah = readln().toInt()

    print("Masukkan persentase diskon: ")
    val diskon = readln().toDouble()

    val subtotal = harga * jumlah
    val potongan = subtotal * diskon / 100
    val totalBayar = subtotal - potongan

    println()
    println("=== RINCIAN BELANJA ===")
    println("Nama barang : $namaBarang")
    println("Harga       : $harga")
    println("Jumlah      : $jumlah")
    println("Diskon      : $diskon%")
    println("Subtotal    : $subtotal")
    println("Potongan    : $potongan")
    println("Total bayar : $totalBayar")
}
fun main() {

    print("Masukkan nama pegawai: ")
    val namaPegawai = readln()

    print("Masukkan gaji pokok: ")
    val gajiPokok = readln().toDouble()

    print("Masukkan tunjangan: ")
    val tunjangan = readln().toDouble()

    print("Masukkan uang lembur: ")
    val uangLembur = readln().toDouble()

    print("Masukkan potongan: ")
    val potongan = readln().toDouble()

    val gajiKotor = gajiPokok + tunjangan + uangLembur

    val gajiBersih = gajiKotor - potongan

    println()
    println("=== RINCIAN GAJI ===")
    println("Nama Pegawai : $namaPegawai")
    println("Gaji Pokok   : $gajiPokok")
    println("Tunjangan    : $tunjangan")
    println("Uang Lembur  : $uangLembur")
    println("Potongan     : $potongan")
    println("Gaji Kotor   : $gajiKotor")
    println("Gaji Bersih  : $gajiBersih")
}
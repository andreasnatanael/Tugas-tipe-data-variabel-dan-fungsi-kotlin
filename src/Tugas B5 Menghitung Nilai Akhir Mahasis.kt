fun main() {

    print("Masukkan nilai Tugas: ")
    val tugas = readln().toDouble()

    print("Masukkan nilai Kuis: ")
    val kuis = readln().toDouble()

    print("Masukkan nilai UTS: ")
    val uts = readln().toDouble()

    print("Masukkan nilai UAS: ")
    val uas = readln().toDouble()

    val nilaiAkhir =
        (tugas * 0.25) +
                (kuis * 0.15) +
                (uts * 0.25) +
                (uas * 0.35)

    println()
    println("=== HASIL NILAI MAHASISWA ===")
    println("Nilai Tugas : $tugas")
    println("Nilai Kuis  : $kuis")
    println("Nilai UTS   : $uts")
    println("Nilai UAS   : $uas")
    println("--------------------------")
    println("Nilai Akhir : $nilaiAkhir")
}
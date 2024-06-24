fun main() {
    // variable mutable (dapat diubah datanya)
    var warna : String = "HIJAU"
    warna = "MERAH"

    println(warna)

    // variable imutable (tidak dapat mengubah datanya)
//    val hewan : String = "kecoa"
//    hewan = "singa"
//
//    println(hewan)

    // nullable
    var name : String? = "irsyad"
    name = null

    println(name?.length)
}
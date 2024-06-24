fun main() {
    var barang : Array<String> = arrayOf("hp","laptop","pc","monitor")
    // cara mencetak semua sekaligus
    for (all in barang) {
        println(all)
    }

    println(barang[0])
    println(barang[1])
    println(barang[2])
    println(barang[3])

// cara mengubah data arrray
    barang[0] = "tv"

    println(barang[0])

}
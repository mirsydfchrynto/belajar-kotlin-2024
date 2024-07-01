fun main() {
    var nilai_agama = 100
    var nilai_IPA = 40
    var nilai_IPS = 10
    var nilai_MTK = 30
    var nilai_indonesia= 60
    var nilai_inggris = 50

    var rata_rata = (nilai_agama + nilai_IPA + nilai_MTK + nilai_IPS + nilai_indonesia + nilai_inggris) / 6

    if (rata_rata >= 65 ) {
        println("nilai rata-rata anda : $rata_rata")
        println("selamat!! nilai anda memenuhi kriteria nilai rata-rata ")
    }else{
        println("nilai rata-rata anda : $rata_rata")
        println("nilai anda tidak memenuhi kriteria nilai rata-rata ")
    }

}
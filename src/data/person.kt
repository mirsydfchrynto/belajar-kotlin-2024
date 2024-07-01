package data

class person {
    var firstname = "muhammad"
    var middlename : String? = null
    var lastname = "pamungkas"
     //membuat function
    fun sayHello(name:String){
        println("hello $name my name is $lastname")
    }

    fun run (){
        println("I'am run")

    }
    fun lengkap():String {
        return  "$firstname $middlename $lastname"

    }

}
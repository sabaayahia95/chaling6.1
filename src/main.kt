

open class Employee( name :String , age : Int , salary : Int ) {
    init {
        println("my name is $name , age is $age , salary is $salary  .")
    }
}
class webDeveloper ( name: String , age: Int , salary: Int) : Employee(name,age,salary) {
    fun website() {
        println("i am website developer")
    }
}
class androidDeveloper(name: String, age: Int,salary: Int) : Employee(name,age,salary){
    fun android() {
        println("i am android app developer")
    }
}
class iosDeveloper (name: String,age: Int,salary: Int) :Employee(name,age,salary){
    fun iosapp() {
        println("i am  ios app developer")

    }
}
fun main (args:Array<String>){
    var wd = webDeveloper("sarah", 21,70000)
    wd.website()
    var ad = androidDeveloper("sabaa",22,100000)
    ad.android()
    var iosd = iosDeveloper("somaiah",30,120000)
    iosd.iosapp()
}

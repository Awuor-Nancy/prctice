fun main() {
    val name = "Edgar"
    if(name.equals("Edgar"))
        println("that's me")
        else{
            println("thats not me")

        }
    var lady = "Patience"
    var height:Double= 7.1
    var greeting ="Hi,i am $name and i am $height metres"
    println(greeting)

    var car = "Limonzine"
   // print(car[0])
    //print(car[1])
    //print(car[2])
    //print(car[3])
    //print(car[4])
    //print(car[5])
    //print(car[6])
    //print(car[7])
    //print(car[8])
    var vehicle =car[0].toString()+car[3]+car[4]+car[1]
    println(vehicle)

    var group = " Merrygoround "
    println(group.trimStart())
    println(group.trimEnd())
    println(group.trim())

    println(group.length)

    var info = school("Nancy","Average")
    println(info)

    var title= identity("manager","one million")
    println(title)

    var stmnt = "Hello,is anyone there"
    var position = "in the living room?"
    var stmnt2 = "I need some water please"
    var response=stmnt+" "+position+" "+stmnt2
    println(response)
    println(stmnt.uppercase())
    println(stmnt2.lowercase())
    println(stmnt.trimEnd())
    println(stmnt2.trimStart())

    var lname = "Bobby"
    var nName = "Mufasa"
    println(lname.last())
    println(nName.first())
    println(lname.toList())


}
fun school(fname:String,Comment:String):String {
    var data = fname + Comment
    return data
}
fun  identity(position:String,salary:String):String {
    var rank ="$position, $salary"
    return rank

}


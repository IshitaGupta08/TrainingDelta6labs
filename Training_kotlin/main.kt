

import kotlin.collections.mutableSetOf// fun main(){
//     println("Hello World")
// }

// class Person(val name: String,var age: Int){
//     fun celebrateBirthday(){
//         age++
//         println("$name is now $age years old")
//     }
// }

// fun main(){
//     val person = Person("John",30)
//     println("${person.name} is ${person.age} years old")
//     person.celebrateBirthday()
// }

// data class Point(val x: Int, val y: Int)

// fun main(){
//     val point1 = Point(10,20)
//     val point2 = Point(10,20)
//     println(point1 == point2)
// }

// open class Shape(val name: String){
//     open fun area(): Double{
//         return 0.0
//     }
// }

// class Rectangle(val width: Double,val height: Double) : Shape("Rectangle"){

//     override fun area(): Double {
//         return width * height
//     }
// }
// fun main(){
//     val rectangle = Rectangle(5.0,10.0)
//     println("Area of ${rectangle.name} is ${rectangle.area()}")
// }

// abstract class Shape(val name: String){
//     abstract fun area(): Double
// }

// class Circle(val radius: Double) : Shape("Circle"){
//     override fun area(): Double{
//         return 3.14 * radius * radius
//     }
// }

// fun main(){
//     val circle = Circle(5.0)
//     println(circle.name)
//     println(circle.area())
// }

// object Settings{
//     var theme: String = "Light"

//     fun switchTheme(){
//         theme = if(theme == "Light") "Dark" else "Light"
//     }
// }

// fun main(){
//     println("Current theme: ${Settings.theme}")
//     Settings.switchTheme()
//     println(" ${Settings.theme}")
// }
// fun main(){
//     // val char:List<Char> = listOf('A','B','M')
//     val mixedList:List<Any> = listOf("Hello",'B',true,123,12.3)
//     println(mixedList)
// }

// fun main(){
//     val intSet = setOf(1,2,3,4,5)
//     println(intSet)
// }
// fun main(){
//     val stringSet = setOf("apple","banana","orange","apple")
//     println(stringSet)
// }

// fun main(){
//     val doubleSet = mutableSetOf(1.5,2.3,3.7,4.1,5.0)
//     doubleSet.add(6.2)
//     doubleSet.add(3.7)
//     println(doubleSet)
// }

//Set of custom object

data class Person(val name: String, val age: Int)
fun main(){
    //creating a set of custom objects(Person)
    val personSet = setOf(
    Person("Alice",30), 
    Person("Bob",25), 
    Person("Charlie",35)
    )

    //printing the set
    println(personSet)
}
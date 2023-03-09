
fun main(){
var now=Calculator("Addition","Subtraction","division")
    now.subtraction(4,5)
    println(now.subtraction(3,6))
    println()
    println(fu(36,7,8))


}
//Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers
//Instantiate your calculator object and invoke all its functions
class Calculator(var add:String,var subt:String,var divide:String){
    fun subtraction(Y:Int,X:Int){

    }



}
//Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements
fun fu(num1:Int,num2:Int,num3:Int):Int{
    var numarray= arrayOf(num1,num2,num3)
    return(numarray.max())

}

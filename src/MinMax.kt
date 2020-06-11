fun main(args:Array<String>){

    var numberOfInputs:Int?=null
    var number=0
    var max=0
    var min=0

    print("Please enter number of inputs: ")
    numberOfInputs = readLine()!!.toInt()

    for(presentInput in 1..numberOfInputs){
        print("\nPlease enter number: ")
        var currentNumber = readLine()!!.toInt()

        if(currentNumber > max){
            max = currentNumber;
        }
    }

    println("max number is $max")

}
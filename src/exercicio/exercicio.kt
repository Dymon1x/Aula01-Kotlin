package exercicio

import kotlin.math.ln

fun main(){
    println(ex1(10, 20, 30))
    println(ex2("abc", "abcd"))
    println(ex3(4))
    println(ex4())
    println(ex5(1,2,3,4))
    print(ex6())

}

fun ex1(num1: Int, num2: Int, num3: Int): Int{
    var maior = 0
    if((num1 > num2) && (num1 > num3)){
        maior = num1
    }else if ((num2 > num1) && (num2 > num3)){
        maior = num2
    }else if ((num3 > num1) && (num3 > num2)){
        maior = num3
    }

    return maior
}

fun ex2(a: String, b: String): Boolean {
    return a != b
}

fun ex3(x: Int){
    if (x % 2 == 0){
        print("É par \n")
    }else{
        print("Não é par")
    }
}

fun ex4(){
    for (i in 0..100){
        if(i % 2 == 1){
            println(i)
        }
    }
}
fun ex5(numA: Int,numB: Int,numC: Int,numD: Int): String {
    if(((numA > numC)&&(numA > numD)) || ((numB > numC)&&(numB > numD))) {
        return "True"
    } else
        return "False"
}

fun ex6(){
    for(x in 0..100){
        println(x)
    }
}

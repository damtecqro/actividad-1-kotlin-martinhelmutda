package com.m5c.tarea1
//Martin Helmut Domiguez Alvarez
//A01701813

import kotlin.math.sqrt



//PROBLEMA P06

/*
fun isPalindrome(lista)
    IF lista == lista.invertida
        TRUE
    ELSE
        FALSE

 */

fun isPalindrome(elements: List<Any>): Boolean {
    return elements == elements.reversed()
}

println(isPalindrome(listOf(1,"b","a",4)))

println(isPalindrome(listOf(1,"b","a","b",1)))
println(isPalindrome(listOf(0,"","AAAAA","3",1)))
println(isPalindrome(listOf(1,"3","AAAAA","AAAAA","3",1)))




//PROBLEMA P35

/*
fun primeFactors(numero)
    WHILE numero es par
        listaResultado.add
        numero / 2

    FOR i en numerosImpares
        WHILE numeroDivisible entre i
            listaResultado.add
            numero / i

    IF numPrimoPequeno
        listaResultado.add

 */


fun primeFactors(n:Int): List<Int>{
    val primeFactors = mutableListOf<Int>()
    var aux = n

    while (aux % 2 == 0){
        primeFactors.add(2)
        aux /= 2
    }

    val root = sqrt(aux.toDouble()).toInt()

    for(i in 3..root step 2){
        while(aux % i == 0){
            primeFactors.add(i)
            aux /= i
        }
    }

    if (aux>2) primeFactors.add(aux)

    return primeFactors
}



println(primeFactors(315))


println(primeFactors(2))
println(primeFactors(10000))
println(primeFactors(765))
println(primeFactors(89)) //Prime number




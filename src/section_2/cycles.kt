package section_2

import piste

fun main(args: Array<String>) {

    //цикл for
    for (i in 1..9) {
        print("${i*i} \t")
    }

    piste()

    // цикл for с таблицей умножения
    for (i in 1..9) {
        for (j in 1..9) {
            print("${i * j} \t")

        }
        println()
    }

    piste()

    // цикл while
    var i = 10
    while (i > 0) {
        print("${i*i} \t")
        i--
    }

    piste()

    // цикл do while
    var z = 1
    do {
        print("${z*z} \t")
        z++
    }
    while (z < 10)

    piste()

    //операторы continue и break
    for(n in 1..5){
        if(n == 4) break;
        println(n * n)
    }

    piste()

    for(n in 1..8){
        if(n == 5) continue;
        println(n * n)
    }

}



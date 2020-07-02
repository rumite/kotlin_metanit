fun main(args: Array<String>) {
    val age = 26
    val firstname = "Timur"
    val surname = "B"
    val welcome = "Welcome, $firstname $surname! Tell us about yourself"
    println(welcome)
    val introduction = """
        Hi!
        My name is $firstname
        I'm $age years old
    """.trimMargin()
    println(introduction)

    if (age in 18..100) {
        println("ok")
    } else {
        print("nok")
    }

    val a = 11
    when(a){
        10 -> println("a = 10")
        20 -> println("a = 20")
        else -> println("неопределенное значение")
    }

    for(i in 1..9){
        for(j in 1..9){
            print("${i * j} \t")
        }
        println()
    }
}

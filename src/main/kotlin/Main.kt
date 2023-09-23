fun main() {
    // Задача 1: Создаем константу myAge и определяем, является ли возраст подростком.
    val myAge = 18
    val isTeenager = myAge in 13..19

    // Задача 2: Создаем константу theirAge и определяем, являются ли оба человека подростками.
    val theirAge = 30
    val bothTeenagers = myAge in 13..19 && theirAge in 13..19

    // Задача 3: Создаем константы для имени читателя и автора, затем проверяем, совпадают ли они.
    val reader = "Милана"
    val author = "Петров Пётр"
    val authorIsReader = reader == author

    // Задача 4: Проверяем, следует ли имя читателя перед именем автора в алфавитном порядке.
    val readerBeforeAuthor = reader < author

    // Задача 5: Создаем константу myAge2 и выводим "Подросток" или "Не подросток" в зависимости от возраста.
    val myAge2 = 19
    if (myAge2 in 13..19) {
        println("Подросток")
    } else {
        println("Не подросток")
    }

    // Задача 6: Создаем переменную answer, которая выводит "Подросток" или "Не подросток" на основе условия и выводим ее.
    val answer = if (myAge2 in 13..19) "Подросток" else "Не подросток"
    println(answer)

    // Задача 7: Создаем переменную counter и выводим значения в цикле while до достижения значения 10.
    var counter = 0
    while (counter < 10) {
        println("counter равен $counter")
        counter++
    }

    // Задача 8: Создаем переменные counter и roll, бросаем кубик до первого выпадения значения 0 и выводим результаты.
    counter = 0
    var roll: Int
    do {
        roll = (0..5).random()
        counter++
        println("После $counter бросков, roll равен $roll")
    } while (roll != 0)

    // Задача 9: Создаем константу range с интервалом от 1 до 10 и выводим квадрат каждого числа.
    val range = 1..10
    for (number in range) {
        val square = number * number
        println("Квадрат числа $number равен $square")
    }

    // Задача 10: Выводим квадратный корень из каждого числа в интервале от 1 до 10.
    for (number in range) {
        val squareRoot = Math.sqrt(number.toDouble())
        println("Квадратный корень из числа $number равен $squareRoot")
    }

    // Задача 11: Выводим строку "Сумма равна 448" только для четных строк в интервале от 1 до 10.
    for (number in range step 2) {
        println("Сумма равна 448")
    }
}

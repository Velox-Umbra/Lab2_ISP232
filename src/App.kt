fun main() {
//    print("Ведите первое число ")
//    val number = readln().toInt()
//    print("Введите второе число ")
//    val number2 = readln().toInt()
//    if (number > number2) {
//        print("Первое число больше")
//    } else if (number == number2) {
//        print("Числа равны")
//    }
//    else {
//        print("Второе число больше")
//    }
//    val max = if (number > number2) number else number2
//    val number = 1..100 step 10
//    print(number)
//    for (i in number)
//        println(i)
//    val number1 = 1 until 100
//    val number2 = 100 downTo 1
//    repeat (times = 5) {
//        println(1)
//    }
    println("Введите порядковый номер месяца (1-12): ")
    val index = readln().toInt()
    var month = ""
    if (index == 1) month = "Январь"
    else if (index == 2) month = "Февраль"
    else if (index == 3) month = "Март"
    else if (index == 4) month = "Апрель"
    else if (index == 5) month = "Май"
    else if (index == 6) month = "Июнь"
    else if (index == 7) month = "Июль"
    else if (index == 8) month = "Август"
    else if (index == 9) month = "Сентябрь"
    else if (index == 10) month = "Октябрь"
    else if (index == 11) month = "Ноябрь"
    else if (index == 12) month = "Декабрь"
    if (index in 1..12){
        println("Вы ввели индекс $index соответствующий месяцу $month")}
}
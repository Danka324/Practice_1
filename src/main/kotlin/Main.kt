fun main() {
    // Задание 1

    /* Объявили константу exercises со значением 13 и
    переменную exercisesSolved со значением 0. По условию увеличили переменную exercisesSolved  */

    var exercisesSolved : Int = 0
    val exercises : Int = 13
    exercisesSolved++

    // Задание 2

    /*Объявили константу типа Int, определили её название в соответствии со
стандартами, отметили в качестве значения наш возраст.
По условию увеличили переменную exercisesSolved  */

    val myage : Int = 18
    exercisesSolved++

    // Задание 3

    /* Объявили переменную типа Double, определили её название в
соответствии со стандартами. Указали наш возраст в качестве
начального значения. Затем изменили значение переменной на
среднее арифметическое нашего возраста и человека, которому 30 лет.
По условию увеличили переменную exercisesSolved  */

    var firstage : Double = 18.0
    firstage = (firstage + 30) / 2
    println(firstage)
    exercisesSolved++

    // Задание 4

    /* Создали константу под названием testNumber, значением которой
стало целое число 8. Затем создали другую константу
под названием evenOdd, значением которой стал остаток от деления
testNumber на 2. Теперь мы изменили testNumber на число 9  и получили в
evenOdd 1.
По условию увеличили переменную exercisesSolved */

    val testNumber : Int = 8
    val evenOdd : Int = testNumber % 2 // в случае с 8 получили 0 , а с 9 получили 1
    println(evenOdd)
    exercisesSolved++

    // Задание 5

    /* Создали переменную под названием answer со значением 0.
Увеличили ее значение на 1. Добавили к результату 10. Умножили
полученное число на 10. Затем сделали смещение вправо на 3.
Получили конечный результат 13. По условию увеличили переменную exercisesSolved  */

    var answer : Int = 0
    answer += 1
    answer += 10
    answer *= 10
    answer = answer shr 3
    println(answer) // ответ = 13
    exercisesSolved++

    // Задание 6

    /* Объявили age для компиляции. По условию нам необходимо выбрать var или val.
 Выбираем var так как переменная может меняться .
 По условию увеличили переменную exercisesSolved  */

    var age : Int
    age = 16
    print(age)
    age = 30
    print(age)
    exercisesSolved++

    //Задание 7
    /**/
    val a1 : Int = 46
    val b1 : Int = 10
    val answer1 : Int = (a1 * 100) + b1
    val answer2 : Int = (a1 * 100) + (b1 * 100)
    val answer3 : Int = (a1 * 100) + (b1 / 100)
    exercisesSolved++



    // Задание 8

    /*Добавили скобки в выражение так ,чтобы порядок, в котором осуществляются операции, не влияли на
результат.
По условию увеличили переменную exercisesSolved */

    var scob  =  (5 * 3) - ((4 / 2 )* 2)
    println(scob)
    exercisesSolved++

    // Задание 9

    /*Объявили две константы а и b типа Double и присвоили обеим
значения. Вычислили среднее арифметическое чисел a и b и поместили
результат в константу под названием average.
По условию увеличили переменную exercisesSolved */

    val a : Double = 4.0
    val b : Double = 6.0
    val average : Double = (a + b) / 2
    println(average)
    exercisesSolved++

    // Задание 10

    /* Конвертировали температуру из °F в °С. Объявили константу под названием fahrenheit
типа Double и присвоили им значение. Посчитали температуру в °С и поместили результат в константу под названием
celcius .По условию увеличили переменную exercisesSolved */

    val fahrenheit : Double = 90.0
    val celcius : Double = (fahrenheit - 32) / 1.8
    println(celcius)
    exercisesSolved++

    // Задание 12

    /* Объявили
константу degrees типа Double и присвоили ей начальное значение.
Вычислили угол в радианах и сохранили результат в
константе под названием radians .
По условию увеличили переменную exercisesSolved */

    val degrees : Double = 60.0
    val radians : Double = degrees * Math.PI / 180
    exercisesSolved++
}
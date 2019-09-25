fun main() {

    //Question Num 1
    checkSameSubString("Hello", "World")

    // Question Num 2
    checkDuplicate(arrayOf(1, 2, 3, 4))

    // Question Num 3
    singleNumber(arrayOf(10, 30, 40, 10, 30, 40 , 20))

    // Question Num 4
    twoSum()

}

fun checkSameSubString(value1 : String, value2: String) {

    val valuesSameSubString = mutableSetOf<Char>()

    value1.toUpperCase().forEach {
        if (value2.toUpperCase().contains(it)) {
            valuesSameSubString.add(it)
        }
    }

    if (valuesSameSubString.isNotEmpty()) {
        var result : String? = ""
        valuesSameSubString.forEach {
            result += it

        }
        println("YES : $result")
    } else {
        println("NO")
    }
}


fun <T> checkDuplicate(value: Array<T>) {
    val newValue  = value.distinct()

    if (newValue == value.toList()) println("False")
    else println("True")
}


fun <T> singleNumber(value: Array<T>)  {

    val result : T? = value.groupingBy { it }.eachCount()
        .filter { it.value == 1 }.map { it.key }[0]

    println(result)

}


fun twoSum() {

    val value = arrayOf(2, 7, 11, 15)
    val target = 9

    val result = arrayListOf<Int>()

    for (i in value.indices) {
        for (j in i + 1 until value.size) {
            if (value[i] + value[j] == target) {
                result.add(value[i])
                result.add(value[j])
            }
        }
    }
    var sum = ""

    result.forEach {
        sum += it.toString()
    }

    val and = " dan "

    val newResult = StringBuffer(sum)
    newResult.insert(0 + 1, and)


    print(newResult)

}
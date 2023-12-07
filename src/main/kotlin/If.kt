fun main() {
    var age : Int = 16
    /*
     Kotlin의 if식은 Java의 if구문 과는 다르다.
      구문이 아닌 식이기 때문에 값을 바로 줄수있다.
     */
    val str : String = if (age > 20 ) {
        "성인"
    } else {
        "성인 아님"
    }
    println(str)
    println("--------------------")

    // if ( 조건 ) true else false
    val a = 2
    val b = 3
    val c = if (b < a ) a else b;
    println(c)

}
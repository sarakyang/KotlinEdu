fun main () {

    // 1. for (a in  0 .. 3 ) <= 가 아니라 자동으로 만들어짐
    for (a in 0..3  ) {
        println(a)
    }
    println("==================================================")
    // 2. for (a in 0 until 3 ) until의 맨 뒤의 값( max 값) 무시함
    for (a in 0 until 3) {
        println(a)
    }
    println("==================================================")

    // 3. for ( a in 0 .. 6 step b) step 의 변수 b 만큼 증가하는 반복문
    for (a in 0 .. 8 step 3) {
        println(a)
    }
    println("==================================================")

    // 4. for ( a in 3 downTo 1 )
    for (a in 5 downTo 1) {
        println(a)
    }
    println("==================================================")

    // 5. for ( a in array)
    val number = arrayOf(1,3,4)
    for (a in number){
        println(a)
    }
}
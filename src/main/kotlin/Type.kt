/* Kotlin은 class외부에 변수자정 가능
 val => 불변
 var => 가변
 또한 메소드 정의 => fun
*/

 var x = 5
 var a : Int = 2
 val c : String = "못바꿔요"
/* 이와 같이 클래스 보다 위에 있어 top-level 이라 함
    기본적 형태는 var or val 변수명 : Type = ?
 */
fun main () {
    println( x+1)
    println(a)

    // 먼저 선언 후 변수 지정 가능
    var b : Int
    b = 3

    /*
     c = "바꿈 "
     위와 같이 작성하면 컴파일 오류 발생
     즉, var ( variable ) 은 수치에 조절이 가능하지만 , 반대로
     val의 경우 수치 변경이 불가능함
    */


    println(b)

}
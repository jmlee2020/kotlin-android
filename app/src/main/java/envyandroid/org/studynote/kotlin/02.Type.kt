package envyandroid.org.studynote.kotlin

//02. 자료형
/*
정수형 -> Long > Int > Short > Byte
실수형 -> Double > Float
문자 -> Char
문자열 -> String
논리형 -> Boolean(True/false)
 */

/*
변수 선언법(1)
Variable / Value
var/val 변수명
 */

var number=10

fun main(array: Array<String>) {
    number = 20
    //number = 20.5
    //위는 에러, 처음 초기화한 타입과 맞지 않음

    //다음과 같이 지정하면 타입을 명시할 수 있다.
    var num1: Int = 20
    // var/val 변수명: 타입 = 초기화값
}
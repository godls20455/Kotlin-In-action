package Part1

//[36p] 코틀린의 첫 인상
data class Person(val name: String, val age: Int? = null) //데이터 클래스

fun main(args: Array<String>) { //최상위 함수
    val persons = listOf(Person("영희"), Person("철수", age = 29)) //이름 붙인 파라미터
    val oldest = persons.maxBy { it.age ?: 0 } //람다식과 엘비스 연산자
    println("나이가 가장 많은 사람 : $oldest") //문자열 템플릿
}
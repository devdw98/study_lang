# basic - 변수

## 변수 선언 방법
1. var [변수명] [자료형]
    ```go
    var i int
    var s string
    ```
2. var [변수명] [자료형] = [값]
    ```go
    var age int = 10
    var name string = "Maria"
    ```
3. var [변수명] = [값]
    - 값을 기준으로 자료형이 결정됨
    - 값을 대입하지 않으면 컴파일 에러 발생 → 반드시 초깃값 대입 필요
    ```go
    var age2 = 5
    var name2 = "hello"
    var address // 컴파일 에러 발생
    ```
4. [변수명] := [값]
    - if, for 제어문 안에서 임시 변수 사용할 때 유용하게 활용됨
    ```go
    age3 := 15
    name3 := "hi"
    ```
5. var [변수1], [변수2] [자료형] = [값1], [값2]
6. var [변수1], [변수2] = [값1], [값2]
    ```go
    var hi1, hi2 int = 30, 50 // hi1 = 30, hi2 = 50
    var hi3, hi4 = 10, "maria" // hi3 = 10, hi4 = "maria"
    ```
7. 병렬 할당(Parallel assignment)
    - 변수가 선언된 뒤에도 변수 여러 개의 값을 대입할 수 있음
    ```go
    var x, y int
    var name string

    x, y, name = 1, 2, "dowon"
    ```
8. var ()
    - 변수 여러 개 선언하고 초기화
    ```go
    var (
        x, y int = 3, 4
        age, name = 10, "dowon"
    )
    ```
## 사용하지 않는 변수, 패키지 처리
  - 선언만 하고 사용하지 않으면 컴파일 에러를 발생시킨다. 때문에 아래와 같이 해놓으면 디버깅 시 굳이 주석처리 안해도 에러가 발생하지 않게 할 수 있다.
  ```go
  package main

  import "fmt"
  import _ "time" // 사용하지 않는 패키지로 인한 컴파일 에러 방지

  func main() {
      a := 1
      b := 2
      _ = b // 사용하지 않는 변수로 인한 컴파일 에러 방지
      fmt.Println(a)
  }
  ```
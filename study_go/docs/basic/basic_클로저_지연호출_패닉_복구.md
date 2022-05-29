## 클로저 (closure)
- 함수 안에서 함수를 선언, 정의할 수 있음
- 바깥쪽 함수에 선언된 변수에도 접근할 수 있는 함수

## 지연 호출 defer
- 특정 함수를 현재 함수가 끝나기 직전에 실행하는 기능
- 파일을 열고 닫을 때 유용하게 사용함
```go
package main
import "fmt"
func hello(){
    fmt.Println("hello")
}
func world(){
    fmt.Println("world")
}

func main(){
    defer world() // 현재 함수(main())가 끝나기 직전에 호출됨 - 4
    hello() // 1
    world() // 2
    hello() // 3
}
```

## 패닉과 복구
### panic
- 에러가 발생한 뒤 종료되는 상황
- 사용자가 직접 에러를 발생시킬 수도 있음
  - 로직에 따라 에러로 처리하고 싶을 때 사용함
```go
func main() {
    panic("Error!")
    fmt.Println("say hi") // 실행되지 않음
}
```
### recover
- 패닉 발생 시 프로그램이 종료되지 않고 예외처리를 할 수 있게하는 함수
- 지연 호출로 사용해야 함
```go
package main
import "fmt"

func f() {
    defer func() {
        s := recover()
        fmt.Println(s)
    }()
    
    a := [...]int{1,2,3}
    for i := 0; i < 5; i++ { // 배열 크기를 벗어난 접근 -> panic
        fmt.Println(a[i])
    }
}
func main() {
    f()
    fmt.Println("hello world") // panic 발생했으나 recover로 복구되어 정상 실행됨
}
```
#### 익명함수
- 함수 내에 이름이 없는 익명함수를 정의한 뒤 바로 호출할 수 있음
- 코드양을 줄일 수 있음
- 클로저, 지연 호출, 고루틴 에서 주로 사용됨
    ```go
    func(s string) { // 익명함수 정의
        fmt.Println(s)
    }("say Hi") // 바로 호출

    r := func(a int, b int) int { // 익명함수 정의
        return a + b
    }(2,3)// 바로 호출하여 리턴 값을 변수 r에 저장
    ```
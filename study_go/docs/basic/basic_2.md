# basic - 기초
## 기본 구조
```go
package main
import "fmt"

func main() {
    fmt.Println("Hello, world!")
}
```
- package
  - 모든 부분이 패키지로 구성되어있음
  - 모든 소스코드의 맨 위엔 패키지 설정이 들어가야함
  - main 패키지부터 실행됨
   ```go
   package main
   ```
- import
  - 패키지 사용할 때 필요한 구문
  ```go
  import "fmt" // 문자열 출력을 위해 fmt 패키지 import
  ```
- main () 함수
  - 실행될 때 main 함수부터 시작함
  ```go
  func main() {
      fmt.Println("Hello, world!")
  }
  ```
## 중괄호, 주석
```go
func main () {
    i := 10
    // if문
    if i >= 5 { 
        fmt.Println("5 이상")
    }
    // for문
    for i := 0; i < 5; i++ {
      fmt.Println(i)
    }
    /*
    * 주석 여러줄 예시
    */
}
```
- 중괄호
  - 함수, 조건문, 반복문 등 시작할 때 중괄호가 반드시 같은 줄에 존재해야함

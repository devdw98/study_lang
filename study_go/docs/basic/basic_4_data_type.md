# basic - 자료형

### 정수
```go
var num1 int = 3
var num2 int -1
var num3 int = 0713 // 8진수
var num4 int = 0x32fa2c75 // 16진수
```
### 실수
- 소수점 사용
    ```go
    var num1 float32 = 0.1
    var num2 float32 = .35
    var num3 float32 = 132.24567
    ```
- 지수 표기법
    ```go
    var num4 float32 = 1e7
    var num5 float32 = .12345E+2 // 소수점 위치 지정
    var num6 float32 = 5.1234e-10 // 소수점 위치 지정
    ```
#### 부동소수점 반올림 오차 (Rounding error)
- 2진수로 실수를 정확하게 표현할 수 없음
- 실수는 `==` 로 직접 비교하면 안됨
    ```go
    var a float32 = 10.0

    for i := 0; i < 10; i++ {
        a = a - 0.1
    }

    fmt.Println(a) // 9.000000000000004: 반올림 오차 발생
    fmt.Println(a == 9.0)  // false
    ```
- 실수 비교 시 연산한 값과 비교할 값의 차이를 구한 후 `머신 입실론`보다 작거나 같은지 확인하는 방식으로 사용해야함
  - 머신 입실론 : 1e-14
    ```go
    ...
    const epsilon = 1e-14
    fmt.Println(math.Abs(a - 9.0) <= epsilon) // true -> 같은 값
    ```
### 복소수
- 실수부 + 허수부
  - 마지막에 i 붙임
  - complex 함수 사용하기
- real () : 실수부 불러오기
- imag () : 허수부 불러오기
```go
var num1 complex64 = 1 + 2i
var num2 complex64 = complex(1, 2)

var r1 float32 = real(num1) // 실수부
var i1 float32 = imag(num1) // 허수부
```

### 바이트
- 16진수, 문자 값으로 저장함
- 바이너리 파일에서 데이터 읽고 쓰기 / 암호화 복호화 시 사용함
```go
var b1 byte = 10  // 10진수
var b2 byte = 0x32 // 16진수
var b3 byte = 'a' // 문자
```
- 큰 따옴표(문자열)을 사용하거나 작은 따옴표 내에 문자열이 오면 byte에 저장할 수 없음 - 컴파일 에러
    ```go
    var b4 byte = "h"
    var b5 byte = 'hi'
    ```
### 룬 (rune)
- 유니코드(UTF-8) 문자코드 저장 시에 사용
- 작은 따옴표로 묶어주어야 함
- 문자 그대로 저장 가능
- \u , \U 를 사용해 유니코드 문자 코드로 저장할 수 있음 
```go
var r1 rune = '한'
var r2 rune = '\ud55c' // 한
var r3 rune = '\U0000d55c' // 한 (16진수 8자리로 맞춰주어야 함)
```
- 유니코드 문자표
  - 전체 유니코드 목록: http://ko.wikipedia.org/wiki/유니코드_블록

### 연산
- 덧셈(+), 뺄셈(-), 곱셈(*), 나눗셈 (/), 나머지 (%), 시프트연산(<<,>>), 비트 반전(^)
- 연산 시 서로 자료형이 다르면 컴파일 에러 발생
- 명시적 변환 해줘야 함 `int(32.123)`
- 실수에서 정수 변환 시 소수점 이하 값은 버림

### 오버플로우/언더플로우
- 오버플로우/언더플로우 상황에서 모두 오버플로우 컴파일 에러라고 발생시킴

### 변수 크기 구하기
- unsafe 패키지의 Sizeof함수
  - 크기는 byte 단위임

# basic - bool / 상수 / 열거형

### bool
- 1byte
- 논리 연산자
  - &&
  - ||
- 비교 연산자
  - <, >, <=, =>, !=, ==

### 상수 const
- 고정 값을 체계적으로 관리하고 싶을 때 사용
  - 선언한 뒤에 변경할 수 없음
- 선언과 동시에 초기화 해야함
- 선언은 변수 선언과 비슷하나 `var`대신 `const` 를 붙여야 함

### 열거형
- const 에 `iota` 사용하기
- 특정 iota 값 생략하고 싶으면 _ (밑줄 문자) 사용하기 (나중에 예시 찾기)
```go
const (
    Sunday = 0
    Monday = 1
    Tuesday = 2
    Wednesday = 3
    Thursday = 4
    Friday = 5
    Saturday = 6
    numberOfDays = 7
)

const (
    Sunday = iota   // 0
    Monday          // 1
    Tuesday         // 2
    Wednesday       // 3
    Thursday        // 4
    Friday          // 5
    Saturday        // 6
    numberOfDays    // 7
)
```
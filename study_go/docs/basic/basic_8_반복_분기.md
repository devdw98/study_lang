# basic - 반복문/분기문

### if
```go
if 조건식1 {
    // 조건식1 true일 때 실행됨
} else if 조건식2 {
    // 조건식1이 false, 조건식2가 true일 때 실행됨
}else{
    // 조건식1, 조건식2가 모두 false일 때 실행됨
}
```

### switch
- break가 필요 없음
- case내 코드만 실행됨
- 숫자 뿐 아니라 문자열도 값으로 사용 가능
    ```go
    i := 3
    switch i {
        case 0, 1, 2:
            fmt.Println("hi")
        case 3:
            fmt.Println("this") // 해당 부분을 실행하고 이후 실행은 중단됨
        case 4:
            fmt.Println("hi2")
        default: // 모든 case에 해당하지 않을 때 실행됨
            fmt.Println(-1)
    }
    ```
- fallthrough
  - 특정 case 문장 실행한 후 다음 case 문장을 실행하고 싶을 때 사용
  - 다른 언어에서 break 생략한 것처럼 동작함
  - 맨 마지막 case 에는 해당 키워드 사용 불가

### for
- for 초깃값; 조건식; 변화식
  - 다른 언어의 for문처럼 씀
    ```go
    for 초깃값; 조건식; 변화식 {
        // 반복
    }
    ```
- for 조건식 
  - while 문처럼 동작
  - 변화식은 블록 내에 작성해야함
  ```go
  i := 0
  for i < 5 {
      fmt.Println(i)
      i += 1
  }
  ```
- for
  - 무한루프
  ```go
  for {
      fmt.Println("hi")
  }
  ```
### break
- 반복문을 멈춤
- 레이블을 지정해서 중첩 반복문이어도 한 번에 빠져나올 수 있음
    ```go
    Loop:
        // 레이블과 for 키워드 사이에 다른 코드가 있으면 안됨
        for i := 0; i < 3; i++ {
            for j := 0; j < 3; j++ {
                if j == 2 {
                    break Loop // 중첩된 반복문을 빠져나옴
                }
            }
        }
    ```
### continue
- 특정 조건에서는 실행하지 않고 넘어갈 수 있게 함
- 레이블을 break와 마찬가지로 지정할 수 있음

### goto
- 정해진 레이블로 바로 이동

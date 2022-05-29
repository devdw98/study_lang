## 포인터
- 메모리 주소를 표현하는 포인터


## 구조체
```go
type Rectangle struct {
    width, height int
    name string
}

// 생성자 흉내내기
func NewRectangle(width, height int) *Rectangle {
    return &Rectangle{width, height}
}

// 구조체에 메서드 연결 
// 포인터 방식
func (rect *Rectangle) area(facter int) int{
    rect.width *= facter    // 원래 값에 영향 줌
    return rect.width * rect.height
}
// 일반 구조체 방식
func (rect Rectangle) area2() int{
    rect.width *= facter    // 원래 값에 영향 미치지 않음
    return rect.width * rect.height
}


rect1 := new(Rectangle) // 구조체 포인터 선언과 동시에 메모리 할당
rect2 := Rectangle{width:30, height: 50} // 필드 지정해서 값 초기화. 다할필요 없음
```


## 인터페이스
- 메서드 집합
- 메서드를 구현하진 않음
- ~er 형태로 이름을 많이 지음

```go
type hello interface { // 인터페이스 정의
    method1() int   // 리턴값 있는 메서드
    method2()       // 리턴값 없는 메서드
}
```
- 타입이 특정 인터페이스를 구현하는지 검사
```go
var donald Duck
if v, ok := interface{}(donald).(Quacker); ok{
    fmt.Println(v, ok)
}
```

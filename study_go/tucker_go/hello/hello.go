package main // 이 코드가 어떤 패키지에 속하는지 알려줌 - 반드시 패키지 선언으로 코드 시작해야함
// main 패키지는 프로그램의 시작점을 포함하는 특별한 패키지임 - main함수가 포함되어야 함
// main 함수가 없는 패키지는 실행파일을 만들수 없고, 다른 패키지에서 외부 패키지로 사용됨

import "fmt" // 패키지 가져오기

func main() {
	fmt.Println("Hello World!")
}

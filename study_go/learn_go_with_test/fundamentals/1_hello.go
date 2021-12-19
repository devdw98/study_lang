package fundamentals

import "fmt"

const spanish = "Spanish"
const french = "French"
const englishHelloPrefix = "Hello, "
const spanishHelloPrefix = "Hola, "
const frenchHelloPrefix = "Bonjour, "

// domain code를 분리하기 - side effect
func Hello(name string, language string) string{
	if name == ""{
		name = "World"
	}
	return greetingPrefix(language) + name
}
func greetingPrefix(language string) (prefix string){ // 리턴값에 이름 지정
	switch language {
	case spanish:
		prefix = spanishHelloPrefix
	case french:
		prefix = frenchHelloPrefix
	default:
		prefix = englishHelloPrefix
	}
	return 
}

func main(){
	fmt.Println(Hello("Dowon", ""))
}
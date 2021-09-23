package fundamentals

const repeatCount = 5

func Repeat(character string) string {
	var repeated string //바로 초기화 안할 때
	for i := 0; i < repeatCount; i++ {
		repeated += character
	}
	return repeated
}
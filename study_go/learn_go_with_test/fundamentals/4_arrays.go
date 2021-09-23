package fundamentals

func Sum(numbers [5]int) int {
	sum := 0
	// for i := 0; i < 5; i++ {
	// 	sum += numbers[i]
	// }
	for _, number := range numbers { //range: 인덱스(_)와 값(number)을 줌
		sum += number
	}
	return sum
}
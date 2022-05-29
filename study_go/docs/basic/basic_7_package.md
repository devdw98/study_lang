# basic - 패키지
- 각종 기능/라이브러리를 패키지로 만들어서 제공함
- 패키지 사용을 위해 `import` 키워드를 사용해야함

### 패키지 별칭
```go
package main
import f "fmt" // fmt 를 f로 가져옴

func main() {
    f.Println("hello")
}

```
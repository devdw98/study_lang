import java.util.Scanner;

public class Ex04Main {
    static int ex02(){
        int result = 0;

        for(int i = 1; i <= 20; i++) {
            if (i % 2 == 0 || i % 3 == 0)
                continue;
            result += i;
        }
        return result;
    }
    static int ex03(){
        int resultAll = 0;
        int resultOnce = 0;

        for(int i = 1; i <= 10; i++) {
            resultOnce += i;
            resultAll += resultOnce;
        }
        return resultAll;
    }
    static int ex04(){
        int result = 0;
        int i = 1;
        while(result < 100){
            if(i % 2 == 0)
                result -= i;
            else
                result += i;
            i++;
        }
        return i;
    }
    static void ex05(){
        int i = 0;
        while(i <= 10){
            int j = 0;
            while(j <= i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    static void ex06(){
        for(int i = 1; i <= 6; i++){
            for(int j = 1; j <= 6; j++){
                if(i+j == 6)
                    System.out.println("("+i+", "+j+")");
            }
        }
    }
    static void ex07(){
        double dValue = Math.random();
        int iValue1 = (int)(dValue * 6) + 1;
        System.out.println("iValue1 : " + iValue1);
    }
    static void ex08(){
        for(int x = 0; x <= 10; x++){
            for(int y = 0; y <= 10; y++){
                if(2*x + 4*y == 10)
                    System.out.println("x="+x + ", y="+y);
            }
        }
    }
    static int ex09(String s){
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += s.charAt(i) - '0';
        }
        return sum;
    }
    static int ex10(int n){
        int sum = 0;
        int num = n;
        while(num > 0){
            sum += (num % 10);
            num = (num / 10);
        }
        return sum;
    }
    static void ex11(){
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;
        System.out.print(num1 +", "+ num2+", ");
        for(int i = 0; i < 8; i++){
            num3 = num1 + num2;
            System.out.print(num3);
            num1 = num2;
            num2 = num3;
            if(i == 7)
                continue;
            System.out.print(", ");
        }
    }
    static void ex12(){
        for(int i = 1; i <= 3; i++){
            for(int j = 2; j <= 9; j++){
                System.out.print(j + "*" + i + "="+j*i+"    ");
            }
            System.out.println();
        }
    }
    static void ex13(String s){
        boolean isNumber = true;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch - '0' > 10) {
                isNumber = false;
                break;
            }
        }
        if(isNumber)
            System.out.println(s+"는 숫자입니다.");
        else
            System.out.println(s+"는 숫자가 아닙니다.");
    }
    static int ex14(){
        int answer = 14;
        int input = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        do{
            count ++;
            System.out.print("1과 100 사이의 값을 입력하세요: ");
            input = sc.nextInt();
            if(input == answer){
                System.out.println("맞췄습니다.");
                break;
            }else if(input > answer){
                System.out.println("더 작은 수를 입력하세요.");
            }else{
                System.out.println("더 큰 수를 입력하세요!");
            }

        }while(true);
        System.out.println("시도횟수는 "+count+" 번 입니다.");
        return count;
    }
    static void ex15(int n){
        int tmp = n;
        int result = 0;
        while(tmp != 0){
            result += tmp % 10;
            tmp /= 10;
            if(tmp == 0)
                continue;
            result *= 10;
        }
        if(n == result)
            System.out.println(n+"은 회문수 입니다.");
        else
            System.out.println(n+"은 회문수가 아닙니다.");
    }
    public static void main(String[] args) {
        System.out.println("[4-2] " + ex02());
        System.out.println("[4-3] " + ex03());
        System.out.println("[4-4] " + ex04());
        System.out.println("[4-5] " );
        ex05();
        System.out.println("[4-6] " );
        ex06();
        System.out.println("[4-7] " );
        ex07();
        ex08();
        System.out.println("[4-9] " +ex09("12345"));
        System.out.println("[4-10] " + ex10(12345));
        System.out.println("[4-11] ");
        ex11();
        System.out.println("[4-12] ");
        ex12();
        System.out.println("[4-13] ");
        ex13("1234");
        System.out.println("[4-14] "+ex14());
        System.out.println("[4-15] ");
        ex15(12321);
    }
}

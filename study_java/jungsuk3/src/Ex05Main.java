import java.util.Arrays;
import java.util.Scanner;

public class Ex05Main {
    static int ex03(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    static void ex04(int[][] arr){
        int total = 0;
        float average = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                total += arr[i][j];
                count++;
            }
        }
        average = (float)total / count;
        System.out.println("total: "+total);
        System.out.println("average: "+average);
    }
    static void ex05(){
        int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];
        for(int i = 0; i < ballArr.length; i++){
            int j = (int)(Math.random() * ballArr.length);
            int tmp = 0;
            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }
        ball3 = Arrays.copyOf(ballArr, ball3.length);
        for(int i = 0; i < ball3.length; i++){
            System.out.print(ball3[i]);
        }
    }
    static void ex06(int money){
        int[] coinUnit = {500, 100, 50, 10};
        System.out.println("money: "+money);
        for(int i = 0; i < coinUnit.length; i++){
            int count = money / coinUnit[i];
            money -= (count * coinUnit[i]);
            System.out.println(coinUnit[i]+"원: "+count);
        }

    }
    static void ex07(int money){
        int[] coinUnit = {500, 100, 50, 10};
        int[] coin = {5,5,5,5};
        System.out.println("money=  "+money);
//        int tmp = money;
        for(int i = 0; i < coinUnit.length; i++){
            int count = money / coinUnit[i];
            if(coin[i] < count){
                count = coin[i];
            }
            money -= (count * coinUnit[i]);
            coin[i] -= count;
            System.out.println(coinUnit[i]+"원: "+count);
        }
        if(money > 0){
            System.out.println("거스름돈이 부족합니다.");
            return;
        }
        System.out.println("=남은 동전의 개수=");
        for(int i = 0; i < coinUnit.length; i++){
            System.out.println(coinUnit[i]+"원: "+coin[i]);
        }
    }
    static void ex08(){
        int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
        int[] counter = new int[4];
        for(int i = 0; i < answer.length; i++){
            counter[answer[i]-1]++;
        }
        for(int i = 0; i < counter.length; i++){
            System.out.print(counter[i]+"*".repeat(counter[i]));
            System.out.println();
        }
    }
    static void ex09(){
        char[][] star = {
                {'*','*',' ',' ',' '},
                {'*','*',' ',' ',' '},
                {'*','*','*','*','*'},
                {'*','*','*','*','*'}
        };
        char[][] result = new char[star[0].length][star.length];
        for(int i = 0; i < star.length; i++){
            for(int j = 0; j < star[i].length; j++){
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < star.length; i++){ //4
            for(int j = 0; j < star[i].length; j++){ //5
                result[j][star.length - i - 1] = star[i][j];
            }
        }
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[i].length; j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
    static String ex10(String s){
        char[] abcCode =
                { '`','~','!','@','#','$','%','^','&','*',
                        '(',')','-','_','+','=','|','[',']','{',
                        '}',';',':',',','.','/'};
        char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

        String result = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch - 'a' >= 0){
                result = result.concat( String.valueOf(abcCode[ch-'a']));
            }else{
                result = result.concat( String.valueOf(numCode[ch-'0']));
            }
        }
        return result;
    }
    static void ex11(){
        int[][] score = {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
                , {50, 50, 50}
        };
        int[][] result = new int[score.length+1][score[0].length+1];
        for(int i=0; i < score.length;i++) {
            for(int j=0; j < score[i].length;j++) {
                result[i][j] = score[i][j];
                result[i][result[i].length-1] += score[i][j];
                result[result.length-1][j] += score[i][j];
                result[result.length-1][result[i].length-1] += score[i][j];
            }
        }
        for(int i=0; i < result.length;i++) {
            for(int j=0; j < result[i].length;j++) {
                System.out.printf("%4d",result[i][j]);
            }
            System.out.println();
        }
    }
    static void ex13(){
        String[] words = {"television", "computer", "mouse","phone"};
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < words.length; i++){
            char[] question = words[i].toCharArray();
            for(int j = 0; j < question.length; j++){
                int index = (int)(Math.random()* question.length);
                char tmp = question[index];
                question[index] = question[j];
                question[j] = tmp;
            }
            System.out.printf("Q%d. %s의 정답을 입력하세요. > ", i+1, new String(question));
            String answer = sc.nextLine();

            if(words[i].equals(answer.trim()))
                System.out.println("맞았습니다.");
            else
                System.out.println("틀렸습니다.");
        }
    }

    public static void main(String[] args) {
        System.out.println("[5-3] " +ex03(new int[]{1, 2, 3, 4, 5}));
        System.out.println("[5-4] " );
        ex04(new int[][]{
                {5,5,5,5,5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        });
        ex05();
        ex06(2680);
        ex07(3510);
        ex08();
        ex09();
        System.out.println(ex10("abc123"));
        ex11();
        ex13();
    }
}

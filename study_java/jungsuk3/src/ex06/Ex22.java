package ex06;

public class Ex22 {
    static boolean isNumber(String s){
        char[] chars = s.toCharArray();
        boolean isNumber = true;
        for(int i = 0; i < chars.length; i++){
            if(chars[i] - '0' < 0 || chars[i] - '9' > 0){
                isNumber = false;
                break;
            }
        }
        return isNumber;
    }
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"  는 숫자입니까? "+isNumber(str));
        str = "1234o";
        System.out.println(str+"  는 숫자입니까? "+isNumber(str));
    }
}

package ex06;

public class Ex23 {
    static int max(int[] arr){
        int result = 0;
        if(arr == null || arr.length == 0)
            return -999999;
        for(int a : arr){
            if(a > result)
                result = a;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 :"+max(data));
        System.out.println("최대값 :"+max(null));
        System.out.println("최대값 :"+max(new int[]{})); // 0 최대값 크기가 인 배열
    }
}

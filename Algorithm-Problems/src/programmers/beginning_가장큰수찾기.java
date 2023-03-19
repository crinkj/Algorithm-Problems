package programmers;

public class beginning_가장큰수찾기 {
    public static void main(String[] args){
        int[] ans = solution(new int[]{1,8,3});
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
    public static int[] solution(int[] array){

        int max = 0;
        int index = 0;
        for(int i=0;i<array.length;i++){
            if(array[i] > max){
                max = array[i];
                index = i;
            }
        }
        return new int[]{max,index};
    }
}

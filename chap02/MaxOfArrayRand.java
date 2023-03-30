package chap02;
import java.util.Random; //난수 발생을 위함
import java.util.Scanner;

public class MaxOfArrayRand {
    //최댓값 찾기
    static int maxOf(int [] a){
        int max =a[0];
        for(int i = 1; i < a.length; i++){
            if (a[i] >max){
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        //Random 클래스형의 변수를 만들기 위한 선언
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람의 수");
        int num = stdIn.nextInt();

        int[] height = new int[num];

        System.out.println("키의 값은 아래와 같습니다.");
        for(int i = 0; i<num; i++){
            //변수 random에 대한 난수를 생성하는 메서드 nextlnt를 호출
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "] : " + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }
}

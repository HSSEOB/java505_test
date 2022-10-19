import java.lang.reflect.Array;
import java.util.Scanner;

public class Multiple3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //정수를 10개 입력받아 배열에 저장한 후, 배열을 검색하여 3의 배수만 골라 출력하는 프로그램을 작성하시오
        int array[] = new int [10];

        System.out.print("정수 10개 입력 >> ");
        for(int i = 0 ; i < array.length; i++){
            array[i]=(sc.nextInt());
        }
        System.out.println(array[4]);
        System.out.println("3의 정수 >> ");
        for(int i = 0; i< array.length; i++){
            if(array[i]%3==0){
                System.out.print(array[i]+" ");
            }
        }
    }
}

import java.util.Scanner;

public class Game369 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //369게임을 작성하시오. 1 ~ 99까지의 정수를 입력받고 수에 3, 6, 9 중 하나가 있는 경우는 “박수짝”, 두 개가 있는 경우는 “박수짝짝”,
        // 하나도 없으면 “박수없음”을 출력하고 0을 입력 받으면 종료하는 프로그램을 작성하시오.
        // 예를 들면, 13인 경우 “박수짝”, 36인 경우 “박수짝짝” 5인 경우 “박수없음” 0인 경우 “종료합니다” 출력 후 종료하면 된다

        while (true) {
            System.out.println("1 ~ 99 사이의 정수를 입력하세요 >> ");
            int number = sc.nextInt();
            int FNumber = number / 10;
            int SNumber = number % 10;


            if (FNumber == 3 || FNumber == 6 || FNumber == 9){
                if(SNumber == 3 || SNumber == 6 || SNumber == 9){
                    System.out.println("박수짝짝");
                }else {
                    System.out.println("박수짝");
                }
            }else if(FNumber != 3 || FNumber != 6 || FNumber != 9){
                if(SNumber == 3 || SNumber == 6 || SNumber == 9){
                    System.out.println("박수짝");
                }else {
                    System.out.println("박수없음");
                }
            }

            if(number==0){
                System.out.println("종료합니다");
                break;
            }

        }
    }
}

import java.util.Scanner;

public class GBBGameApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = (int)(Math.random()*3+1);
        System.out.println(c);
        String CA ="미정";
        String MA ;
        if(c==1){
            CA ="가위";
        }
        if(c==2) {
            CA = "바위";
        }
        if(c==3) {
            CA = "보";
        }


        System.out.println("가위 바위 보 게임을 시작합니다.");
        System.out.print("입력 하세요 >> ");
        MA = sc.next();
        System.out.println("컴퓨터 >> "+ CA);

        if(CA.equals("가위")){
            if(MA.equals("가위")){
                System.out.println("비겼습니다.");
            } else if (MA.equals("바위")) {
                System.out.println("이겼습니다.");
            } else if (MA.equals("보")){
                System.out.println("졌습니다");
            }else{
                System.out.println("잘못 입력했습니다.");
            }
        }

        if(CA.equals("바위")){
            if(MA.equals("가위")){
                System.out.println("졌습니다.");
            } else if (MA.equals("바위")) {
                System.out.println("비겼습니다.");
            } else if (MA.equals("보")){
                System.out.println("이겼습니다");
            }else{
                System.out.println("잘못 입력했습니다.");
            }
        }

        if(CA.equals("보")){
            if(MA.equals("가위")){
                System.out.println("이겼습니다.");
            } else if (MA.equals("바위")) {
                System.out.println("졌습니다.");
            } else if (MA.equals("보")){
                System.out.println("비겼습니다");
            }else{
                System.out.println("잘못 입력했습니다.");
            }
        }



    }
}

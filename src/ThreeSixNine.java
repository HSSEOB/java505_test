import java.util.Scanner;

public class ThreeSixNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //다음과 같이 영어와 한글의 짝을 이루는 2개의 배열을 만둘고,
        // 사용자로부터 영어 단어를 입력 받아 한글을 출력하는 프로그램을 작성하시오.
        // “exit”를 입력하면 프로그램을 종료하시오

        String eng[] = {"student","love","java","happy","future"};
        String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};

        while(true){

            System.out.print("영어 단어를 입력하세요 >> ");
            String name = sc.next();
            for(int i = 0; i< eng.length; i++){
                if(name.equals(eng[i])){
                    System.out.println(kor[i]);
                }
            }

            if(name.equals("exit")){
                System.out.println("종료합니다");
                break;
            }
        }











    }
}

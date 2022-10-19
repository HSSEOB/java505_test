import java.util.Scanner;

public class BuildingHeight {

    public static void main(String[] args) {
//  quiz1      한 층의 높이가 5m일 때 건물이 몇 층인지 입력받아 건물의 총 높이가 어떻게 되는지 출력하는 프로그램을 작성하시오
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 층인지 입력하세요 >> ");
        int Floor = sc.nextInt();
        System.out.println("이 건물의 높이는 " + Floor * 5 + "m 입니다");
    }
}

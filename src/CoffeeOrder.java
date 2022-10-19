import java.util.Scanner;

public class CoffeeOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int 에스프레소 = 2000;
        int 아메리카노 = 2500;
        int 카푸치노 = 3000;
        int 카페라떼 = 3500;
        int price;
        System.out.print("커피를 주문하세요 >>");

        String name = sc.next();
        int number = sc.nextInt();

        if(name.equals("에스프레소")){
            price =에스프레소*number;
            System.out.println(price+"원 입니다");
        }
        if(name.equals("아메리카노")){
            price=아메리카노*number;
            System.out.println(price+"원 입니다");
        }
        if(name.equals("카푸치노")){
            price=카푸치노*number;
            System.out.println(price+"원 입니다");
        }
        if(name.equals("카페라떼")){
            price=카페라떼*number;
            System.out.println(price+"원 입니다");
        }









    }
}

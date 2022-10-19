import java.util.Scanner;

public class PhoneManager2 extends Phone {
    public PhoneManager2(String name, String tel) {
        super(name, tel);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("인원수 >> ");
        int people = sc.nextInt();
        String nameBook[] = new String[people];
        String telBook[] = new String[people];

        for(int i=0; i<telBook.length; i++) {
            {
            System.out.print("이름과 전화번호를 입력하세요 >> ");
            Phone phone = new Phone(sc.next(), sc.next());
            nameBook[i] = phone.getName();
            telBook[i] = phone.getTel();}
        }

        System.out.println("저장 되었습니다...");


        while(true){

            System.out.print("검색 할 이름 >> ");
            String name = sc.next();
            int check = -1;

            for (int i = 0 ; i < telBook.length; i++) {
                if(nameBook[i].equals(name)){
                    check = i;
                }else if(name.equals("exit")){
                    System.out.println("프로그램을 종료합니다...");
                    break;
                }


            }
            if(check > -1){
                System.out.println(nameBook[check] + "의 번호는 " + telBook[check] + " 입니다");
            }else{
                System.out.println("그런 이름은 없습니다");
            }
        }





    }
}

import java.util.Scanner;

public class PhoneManager extends Phone {
    public PhoneManager(String name, String tel) {
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


            for (int i = 0 ; i < telBook.length; i++) {
                if(nameBook[i].equals(name)){
                    System.out.println(nameBook[i] + "의 번호는 " + telBook[i] + " 입니다");
                }else if(name.equals("exit")){
                    System.out.println("프로그램을 종료합니다...");
                    break;
                }
                else{
                    System.out.println(name+" 은(는) 없습니다");
                }
            }
        }





    }
}

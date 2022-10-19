import java.util.Scanner;

public class phoneEX extends Phone{

    public phoneEX(String name, String tel) {

        super(name, tel);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름과 전화번호를 입력하세요 >> ");
        Phone phone = new Phone(sc.next(),sc.next());
        System.out.print("이름과 전화번호를 입력하세요 >> ");
        Phone phone2 = new Phone(sc.next(),sc.next());
        System.out.println(phone.getName()+"의 번호 "+ phone.getTel());
        System.out.println(phone2.getName()+"의 번호 "+ phone2.getTel());

    }
}

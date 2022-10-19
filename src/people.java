import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class people {
    public static void main(String[] args) {

        HashMap<String, Integer> nations = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("나라 이름과 인구를 5개 입력하세요. (예: Korea 5000)");
        System.out.print("나라 이름, 인구 >> ");
        for(int i = 1 ; i <= 5 ; i++){
            nations.put(sc.next(), sc.nextInt());
        }



    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("빈 칸으로 분리하여 5 개의 학점을 입력(A/B/C/D/F) >> ");
        for(int i = 1 ; i<=5; i++){
            list.add(sc.next());
        }
        Collections.replaceAll(list, "A", "5.0");
        Collections.replaceAll(list, "B", "4.0");
        Collections.replaceAll(list, "C", "3.0");
        Collections.replaceAll(list, "D", "2.0");
        Collections.replaceAll(list, "F", "1.0");

        System.out.println(list+" ");
    }
}

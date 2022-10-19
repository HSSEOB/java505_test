import java.util.Scanner;

public class RectArray extends Rect{
    public RectArray(int width, int height) {
        super(width, height);
    }

    public static void main(String[] args) {
        int array[] = new int[4];
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i= 0; i < array.length; i++){
            System.out.println((i+1) + " 너비와 높이 >> ");
            Rect rect = new Rect(scanner.nextInt(), scanner.nextInt());
            array[i] = rect.getArea();
        }
        System.out.println("저장 하였습니다");

        for(int i=0; i<array.length; i++){
            sum+=array[i];
        }

        System.out.println("사각형 전체의 합은 "+sum);

    }
}

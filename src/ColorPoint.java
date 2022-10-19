public class ColorPoint extends Point{
    String name;
    public ColorPoint(int x, int y, String name) {
        super(x, y);

            }

    public void setPoint(int x,int y){
        move(x, y);
    }
    public void setColor(String color){
        name = color;
    }
    public void show(){
        System.out.println(name+"색으로 "+"("+getX()+" , "+getY()+")");
    }

    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setPoint(10, 20);
        cp.setColor("GREEN");
        cp.show();
    }
}

package Test_240510;

class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
 
public static void main(String[] args) {
    ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
    cp.setPoint(10, 20);
    cp.setColor("GREEN");
    cp.show();
 }
}
package Geometry;

public class Polygon {

    private int x;
    private int y;

    public double calcularDistancia (Polygon point){
        int     x1=x, y1=y,
                x2= point.getX(),
                y2= point.getY();

        return Math.sqrt(Math.pow(x2-x1,2) +Math.pow(y2-y1,2));
    }
    // setter
    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}

    // getter
    public int getX() {return x;}
    public int getY() {return y;}

    @Override
    public String toString() {return "(" + x + ", " + y + ")";}

}

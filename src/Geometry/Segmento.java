package Geometry;

/*
 Teorema de Pitagoras para dos puntos:

 Punto1X = (x1, y1)
 Punto2Y = (x2, y2)

 distancia XY = raiz((x2-x1)^2 + (y2-y1)^2)


 */

public class Segmento { //Create the class Segment which has 2 points
  public int startPoint; //// (startPoint
  public int endPoint; //and endPoint)

  public void setStartPoint(int startPoint){this.startPoint = startPoint;}
  public void  setEndPoint(int endPoint){this.endPoint = endPoint;}
  public int getEndPoint() {return endPoint;}
  public int getStartPoint() {return startPoint;}
  public void setOffset(int offX , int offY){ startPoint += offX; endPoint += offY;}

  public double calcularDistancia(Segmento p){
    int startPoint1=startPoint;
    int endPoint1=endPoint;
    int startPoint2=p.getStartPoint();
    int endPoint2=p.getEndPoint();

    return Math.sqrt(Math.pow(startPoint2-startPoint1,2)+Math.pow(endPoint2-endPoint1,2));}

  @Override
  public String toString() {
    return '('+ startPoint + "," + endPoint + ')';
  }

}
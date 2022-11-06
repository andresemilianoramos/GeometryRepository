package Geometry;


public class mainPolygon {
    public static void main(String[] args) {



        Polygon point = new Polygon();
        point.setX(1); point.setY(2);

        Polygon point2 = new Polygon();
        point2.setX(3); point2.setY(4);

        Polygon point3 = new Polygon();
        point3.setX(5); point3.setY(6);

        Polygon point4 = new Polygon();
        point4.setX(7); point4.setY(8);

        System.out.println("");
       System.out.println( point + "-"+ point2 + "-"+ point3 + "-"+ point4 );

        System.out.println();
        System.out.println(
                "La Longitud del Poligono es: "
                + (point.calcularDistancia(point2)
                +point2.calcularDistancia(point3)
                +point3.calcularDistancia(point4)
                +point4.calcularDistancia(point))
                                                    );

    }
}

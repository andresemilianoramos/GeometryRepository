package Geometry;
public class Main {
    public static void main(String[] args) {
        Segmento p = new Segmento();
        p.setStartPoint(4);
        p.setEndPoint(5);
        p.setOffset(4,4);

        Segmento p2 = new Segmento();
        p2.setStartPoint(6);
        p2.setEndPoint(8);
        p2.setOffset(4,4);

       System.out.println("La 1 coordenada es: "+p.getStartPoint()+","+p.getEndPoint());
       System.out.println("La 2 coordenada es: "+p2.getStartPoint()+","+p2.getEndPoint());

        System.out.println();
        System.out.println("(" +p.startPoint+","+p.endPoint+") - ("+p2.startPoint+','+ p2.endPoint+')');
        System.out.println("\nLa distancia es: "+p.calcularDistancia(p2));

    }
}

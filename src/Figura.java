
public class Figura {
    protected Punto punto1;
    protected Punto punto2;
    protected Punto punto3;

    public Figura(Punto punto1, Punto punto2, Punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    public double calcularDistancia(Punto punto1, Punto punto2) {
        double distanciaX = punto2.getX() - punto1.getX();
        double distanciaY = punto2.getY() - punto1.getY();
        double distanciaZ = punto2.getZ() - punto1.getZ();
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY + distanciaZ * distanciaZ);
    }

    public Punto calcularBaricentro() {
        double baricentroX = (punto1.getX() + punto2.getX() + punto3.getX()) / 3;
        double baricentroY = (punto1.getY() + punto2.getY() + punto3.getY()) / 3;
        double baricentroZ = (punto1.getZ() + punto2.getZ() + punto3.getZ()) / 3;
        return new Punto(baricentroX, baricentroY, baricentroZ);
    }
}
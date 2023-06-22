public class Triangulo extends Figura {
    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        super(punto1, punto2, punto3);
    }

    public double calcularArea() {
        double ladoA = calcularDistancia(punto1, punto2);
        double ladoB = calcularDistancia(punto2, punto3);
        double ladoC = calcularDistancia(punto3, punto1);
        double semiperimetro = (ladoA + ladoB + ladoC) / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));
    }
}

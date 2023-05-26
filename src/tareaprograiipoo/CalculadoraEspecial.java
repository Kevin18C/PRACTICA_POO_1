package tareaprograiipoo;

public class CalculadoraEspecial {

    public String tipocalculadora;
    public String color;
    public int dimensionPantalla;
    private String numeroDeSerie;
    private String nombrePropietario;

    public CalculadoraEspecial(String propietario) {
        this.tipocalculadora = "Special Calculator";
        this.dimensionPantalla = 10;
        this.numeroDeSerie = "12345abc";
        this.color = "Blue";
        this.nombrePropietario = propietario;
    }

    public CalculadoraEspecial() {
    }

    // These are the 6 new methods that you need to add to the class
    public double factorial(int numero) {
        double factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public double potencia(double base, double exponente) {
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public double logaritmo(double numero, double base) {
        return Math.log(numero) / Math.log(base);
    }

    public double coseno(double angulo) {
        double radianes = Math.toRadians(angulo);
        return Math.cos(radianes);
    }

    public double seno(double angulo) {
        double radianes = Math.toRadians(angulo);
        return Math.sin(radianes);
    }

    public double tangente(double angulo) {
        double radianes = Math.toRadians(angulo);
        return Math.tan(radianes);
    }

}

public class Main {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        double nota1 = 5.5;
        double nota2 = 10;
        double nota3 = 2.0;
        double nota4 = 7.5;

        double[] notas = {nota1, nota2, nota3, nota4};

        c.calcularMedia(nota1, nota2, nota3, nota4);
        c.calcularMedia(notas);
    }
}

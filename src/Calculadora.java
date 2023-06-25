public class Calculadora {

    public double calcularMedia(double n1, double n2, double n3, double n4) {
        double media = ((n1 + n2 + n3 + n4) / 4);
        declararMedia(media);
        return media;
    }

    public double calcularMedia(double[] notas) {
        double totalNotas = 0;
        for(int i = 0; i < notas.length; i++) {
            totalNotas += notas[i];
        }
        double media = totalNotas / notas.length;
        declararMedia(media);
        return media;
    }

    public void declararMedia(double media) {
        System.out.println("A média alcançada foi de: " + media + ".");
    }
}

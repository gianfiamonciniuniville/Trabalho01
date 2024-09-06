public class Main {
    public static void main(String[] args) {
        Equacao ex = new Equacao();

        System.out.println("Ao Quadrado"+ex.getSquare(4));

        System.out.println(ex.calcEquacao(14, 51, 94));

        DesvioPadrao ex2 = new DesvioPadrao();

        double[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Média: "+ex2.calcMedia(nums));
        System.out.println("Desvio Padão:"+ex2.calcVariance(nums));

        Juros ex3 = new Juros();

        System.out.println("Juros Compostos: "+ex3.calcJurosCompostos(1000, 0.1, 5));
    }
}
public class Juros {
    public double calcJurosCompostos(double capitalicial, double juros, double tempo) {
        return capitalicial * Math.pow((1 + juros), tempo);
    }
}

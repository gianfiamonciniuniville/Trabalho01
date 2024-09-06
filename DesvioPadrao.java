public class DesvioPadrao {
    private double soma = 0.0;
    private double somaQuadrados = 0.0;

    public double calcMedia(double[] nums){
        for(double num : nums){
            this.soma += num;
        }

        return this.soma / nums.length;
    }

    public double calcVariance(double[] nums){
        double media = calcMedia(nums);
        for (double num : nums) {
            somaQuadrados += Math.pow(num - media, 2);
        }

        return somaQuadrados / nums.length;
    }

    public double calcDesvioPadrao(double[] nums){
        DesvioPadrao d = new DesvioPadrao();
        return Math.sqrt(d.calcVariance(nums));
    }
}

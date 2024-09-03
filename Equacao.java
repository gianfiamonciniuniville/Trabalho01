public class Equacao {
    private double a;
    private double b;
    private double c;
    private double rz;

    public int getSquare(int num){
        return num * num;
    }

    public double calcDelta(){
        return b * b -4 * a * c;
    }

    public double calcEquacao(double a, double b, double c){
        double delta = calcDelta();

        if(delta > 0){
            return rz = -b / (2*a);
        }

        return 0;
    }
}
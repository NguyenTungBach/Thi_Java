package Cau1;

public class ConversionUtil implements ConversionUtilImplement {

    private double fDegree;
    private double cDegree;

    public ConversionUtil() {
    }

    public double getfDegree() {
        return fDegree;
    }

    public void setfDegree(double fDegree) {
        this.fDegree = fDegree;
    }

    public double getcDegree() {
        return cDegree;
    }

    public void setcDegree(double cDegree) {
        this.cDegree = cDegree;
    }

    public double fahrenheitToCelsius(double fDegree){
        double c = (fDegree - 32) * 0.55;
        return c;
    }

    public double celsiusToFahrenheit(double cDegree){
        double f = (cDegree * 1.8) + 32;
        return f;
    }

    public static void main(String[] args) {
        ConversionUtil test = new ConversionUtil();
        System.out.println("F -> C = "+ test.fahrenheitToCelsius(1));
        System.out.println("C -> F = "+ test.celsiusToFahrenheit(50));

    }
}

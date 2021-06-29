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
        return (5/9) * (fDegree - 32);
    }

    public double celsiusToFahrenheit(double cDegree){
        return (cDegree * 9/5) + 32;
    }

    public static void main(String[] args) {
        ConversionUtil test = new ConversionUtil();
        System.out.println("F -> C = "+ test.fahrenheitToCelsius(57));
        System.out.println("C -> F = "+ test.celsiusToFahrenheit(57));

    }
}

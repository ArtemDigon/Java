package lab_1;
import java.util.Scanner;


public class Complex
{
    public double[] complex  = new double[2];
    public double newComplex[] = new double[2];

    public Complex(){
        Scanner in = new Scanner(System.in);
        System.out.print("Re: ");
        complex[0] = in.nextDouble();
        System.out.print("Im: ");
        complex[1] = in.nextDouble();

        in.close();
    }

    public Complex(double re, double im){
        complex[0] = re;
        complex[1] = im;
    }
    public double[] addComplex(double reNew,double imNew){
        newComplex[0] = reNew;
        newComplex[1] = imNew;
        return newComplex;
    }

    public double[] sum(double[] complex,double[] complex1) {
        double[] sumComplex = new double[2];

        sumComplex[0] = complex[0] + complex1[0];
        sumComplex[1] = complex[1] + complex1[1];
        return sumComplex;
    }

    public double[] difference(double[] complex,double[] complex1) {
        double[] difference = new double[2];
        difference[0] = complex[0] - complex1[0];
        difference[1] = complex[1] - complex[1];
        return difference;
    }

    public String argumentComplex(double[] complex){
        if (complex[0] > 0) return "arctg("+ complex[0]+"/"+complex[1]+")";
        if (complex[0] < 0 && complex[1] >= 0) return "pi" + "arctg("+ complex[0]+"/"+complex[1]+")";
        if (complex[0] < 0 && complex[1] < 0) return "-pi" + "arctg("+ complex[0]+"/"+complex[1]+")";
        if (complex[0] == 0 && complex[1] > 0) return "pi";
        if (complex[0] == 0 && complex[1] < 0) return "-pi";
        return "error";
    }

    public void printComplex(double[] complexs){
        if (complex[0] == 0)
            System.out.println(complex[1]+"i");
        if (complex[1] == 0)
            System.out.println(complex[0]);
        System.out.println((complex[0]*100)/100 + " + "+(complex[1]*100)/100 + "i");
    }
    public double ModulComplex(double[] complex) {
        double module = (int)(Math.sqrt(Math.pow(complex[0], 2) + Math.pow(complex[1],2))*100);
        module = module / 100;
        return module;
    }

}

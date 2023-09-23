package lab_1;

public class TestComplex {
    public static void main(String[] args) {
        Complex constru = new Complex(10,10.3);
        double[] complexSum = new double[2];
        double[] complexDiff = new double[2];
        double module;
        String arg;
        double[] newComplex = new double[2];
        newComplex = constru.addComplex(10,10);
        complexSum = constru.sum(constru.complex,newComplex);
        System.out.print("sum: ");
        constru.printComplex(complexSum);
        complexDiff = constru.difference(constru.complex,newComplex);
        System.out.print("diff: ");
        constru.printComplex(complexDiff);
        module = constru.ModulComplex(constru.complex);
        System.out.println("mod: "+ module);
        module = constru.ModulComplex(newComplex);
        System.out.println("mod1: "+ module);
        arg = constru.argumentComplex(constru.complex);
        System.out.println("arg: "+ arg);
        arg = constru.argumentComplex(newComplex);
        System.out.println("arg1: "+ arg);


      //1 доделать метод принт
      //2 дореализовать калькулятор
    }
}

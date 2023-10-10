public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();

        System.out.println(calc.sum(100, 300));
        System.out.println(calc.pow(200, 10));
        System.out.println(calc.mult(198, 98));
    }
}
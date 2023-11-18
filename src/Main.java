public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double result1 = calculator.add(1,2);
        double result2 = calculator.subtract(2,5);
        double result3 = calculator.multiply(3,2);
        double result4 = calculator.divide(6,2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
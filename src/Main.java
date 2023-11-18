public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double result1 = calculator.add(1,2);
        double result2 = calculator.subtract(2,5);
        double result3 = calculator.multiply(3,2);
        double result4 = calculator.divide(6,2);
        double result5 = calculator.squareRoot(49);
        double result6 = calculator.exp2(5);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);

    }
}
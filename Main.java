public class Main {

    public static void main(String[] args) {

        char op = args[0].charAt(0);
        int int1 = Integer.parseInt(args[1]);
        int int2 = Integer.parseInt(args[2]);

        System.out.println(InfixCalculator.calculator(op, int1, int2));

    }

}

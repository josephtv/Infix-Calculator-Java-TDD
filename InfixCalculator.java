public class InfixCalculator {

    public static int calculator(char op, int int1, int int2) {

        switch (op) {
            case '+':
                return int1 + int2;
            default:
                System.out.println("Invalid operation (returns -1)");
        }
        return -1;
    }
}

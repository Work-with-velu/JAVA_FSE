public class OperatorPrecedenceDemo {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;           
        int result2 = (10 + 5) * 2;         
        int result3 = 20 - 4 / 2 + 3 * 2;   
        int result4 = 100 / 10 * 5 + 2 - 1; 

        System.out.println("Result 1 (10 + 5 * 2): " + result1);
        System.out.println("Explanation: 5 * 2 = 10, then 10 + 10 = 20\n");

        System.out.println("Result 2 ((10 + 5) * 2): " + result2);
        System.out.println("Explanation: 10 + 5 = 15, then 15 * 2 = 30\n");

        System.out.println("Result 3 (20 - 4 / 2 + 3 * 2): " + result3);
        System.out.println("Explanation: 4 / 2 = 2, 3 * 2 = 6, then 20 - 2 + 6 = 24\n");

        System.out.println("Result 4 (100 / 10 * 5 + 2 - 1): " + result4);
        System.out.println("Explanation: 100 / 10 = 10, 10 * 5 = 50, 50 + 2 = 52, 52 - 1 = 51\n");
    }
}

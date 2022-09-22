public class reCapDemo_Classes {
    public static void main(String[] args) {
        FourOperations fourOperations = new FourOperations();
        int sum = fourOperations.Addition(3, 4);
        System.out.println(sum);
        int sum2 = fourOperations.Extraction(7, 6);
        System.out.println(sum2);
        int sum3 = fourOperations.Multiplication(8, 4);
        System.out.println(sum3);
        int sum4 = fourOperations.Division(100, 50);
        System.out.println(sum4);
    }
}

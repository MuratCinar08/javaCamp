public class methods2 {
    public static void main(String[] args) {
       String message = "Bugün hava çok güzel. ";
       String newMessage = getCity();
       System.out.println(newMessage);
       int number = addition(15, 27);
       System.out.println(number);
    }

    public static void add() {
        System.out.println("Added");
    }

    public static void delete() {
        System.out.println("Deleted");
    }

    public static void update() {
        System.out.println("Updated");
    }

    public static String getCity() {
        return "İstanbul";
    }

    public static int addition(int num1, int num2){
        return num1+num2;
    }
}

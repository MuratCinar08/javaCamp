public class methods2 {
    public static void main(String[] args) {
       String message = "Bugün hava çok güzel. ";
       String newMessage = getCity();
       System.out.println(newMessage);
       int number = addition(15, 27);
       System.out.println(number);
       int total = addition2(2,4,6,8,10);
       System.out.println(total);
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

    public static int addition2(int... numbers) {
        int total = 0;
        for(int number:numbers) {
            total+=number;
            
        }
        return total;
    }
}

public class recapDemo2 {

    public static void main (String[] args) {
        double[] myList = {1.5,2.6,3.8,8.3};
        double total = 0;
        double max = myList[0];

        for(double number:myList) {
            if(max<number){
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }

        System.out.println("Total: " +total);
        System.out.println("En Büyük Sayı: " +max);
        

    }

    
}

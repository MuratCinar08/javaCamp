public class recapDemo1 {

    public static void main (String[] args) {
        int num1 = 65;
        int num2 = 45;
        int num3 = 56;
        int highestNum = num1;
        
        
        if(highestNum<num2) {
            highestNum = num2;
        }  
        if(highestNum<num3){
            highestNum = num3;

        }
        
        System.out.println("En büyük = "+highestNum);
       

    }

}

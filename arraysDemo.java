public class arraysDemo {

    public static void main (String[] args) {
        String ogrenci1 = "Murat";
        String ogrenci2 = "Ahmet";
        String ogrenci3 = "Sıla";
        String ogrenci4 = "Esra";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("----------------");

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Murat";
        ogrenciler[1] = "Sıla";
        ogrenciler[2] = "Esra";

        for(int i=0;i<ogrenciler.length;i++) {
            System.out.println(ogrenciler[i]);

        }
        System.out.println("-----------------");
        for(String ogrenci: ogrenciler) {
            System.out.println(ogrenci);
        }

    



    }
    
}

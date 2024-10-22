package d28exception_enum;

public class EnumRunner {
    public static void main(String[] args) {
       // Cities c=new Cities();  //HATA! Enumlardan obje oluşturulamaz.

        // Enum'daki tüm şehirleri ve ilgili bilgilerini yazdır
        for (Cities city : Cities.values()) {
            System.out.println("Plate Code: " + city.getPlateCode());
            System.out.println("City Name: " + city.getCityName());
            System.out.println("Postal Code: " + city.getPostalCode());
            System.out.println("-------------------------");


        }
    }
}

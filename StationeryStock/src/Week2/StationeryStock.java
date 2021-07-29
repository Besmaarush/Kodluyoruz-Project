package Week2;
import java.util.HashMap;
import java.util.Scanner;
public class StationeryStock {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Kalem", 0);
        hashMap.put("Silgi", 0);
        hashMap.put("Defter", 0);
        hashMap.put("Kitap", 0);
        addProduct(hashMap);
    }

    private static void addProduct(HashMap<String, Integer> hashMap) {
        System.out.println("\nÜRÜNLER\n-----------------");
        System.out.println("1-Kalem\n2-Silgi\n3-Defter\n4-Kitap\n-----------------");
        Scanner scanner = new Scanner(System.in);
        int product;
        System.out.println("Çıkmak için 0'a basınız.");
        while (true) {
            System.out.print("Eklenecek ürün no giriniz. ");
            product = scanner.nextInt();
            if(product == 0) break;
            switch (product) {
                case 1:
                    hashMap.replace("Kalem", hashMap.get("Kalem"), hashMap.get("Kalem")+1);
                    break;
                case 2:
                    hashMap.replace("Silgi", hashMap.get("Silgi"), hashMap.get("Silgi")+1);
                    break;
                case 3:
                    hashMap.replace("Defter", hashMap.get("Defter"), hashMap.get("Defter")+1);
                    break;
                case 4:
                    hashMap.replace("Kitap", hashMap.get("Kitap"), hashMap.get("Kitap")+1);
                    break;
                default:
                    System.out.println("Yanlış bir seçim yapıldı.");

            }
        }
        calculate(hashMap);
    }

    public static void calculate(HashMap<String, Integer> hashMap){
        int kinds = 0, total = 0;
        System.out.println("--------------------------------------");
        for (String prodKey : hashMap.keySet()){
            if(hashMap.get(prodKey) != 0) {
                kinds++;
                total += hashMap.get(prodKey);
            }
            System.out.println(prodKey + " ürününden " + hashMap.get(prodKey) + " adet var.");
        }
        System.out.println("Toplam ürün adedi: " + total + "\n" + kinds + " çeşit mal var.");
    }
}

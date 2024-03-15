import java.util.ArrayList;
import java.util.Scanner;

public class gramer {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("cumle girin");
			String cumle=scanner.nextLine();
			cumle = cumle.stripLeading();

			ArrayList<String> kelimeler = new ArrayList<>();
			String[] parse= cumle.split("\\s+");

			for (String kelime : parse) {

				kelimeler.add(kelime);

				
			}

			for (String kelime : parse) {
				System.out.println(kelime);
			}
			kelimeDuzeltme(kelimeler);
			kontrolEt(kelimeler);
		}


	}
	static void kontrolEt(ArrayList<String> _kelimeler){

		if(((ozne(_kelimeler))&&nesne(_kelimeler)&&yuklem(_kelimeler))==true) {
			System.out.println("EVET");
		}
		else
			System.out.println("HAYIR");
	}


	static boolean ozne(ArrayList<String> _kelimeler) {
		String[] ozneListesi= {"Ben", "Sen", "Hasan", "Nurşah", "Elif", "Abdulrezzak",
				"Şehribanu", "Zeynelabidin", "Naki"};
        

		for(int i=0;i<ozneListesi.length;i++) {

			if(_kelimeler.get(0).equals((ozneListesi[i]))){
				return true;

			}
		}

		return false;

	}
	static boolean nesne(ArrayList<String> _kelimeler) {
		String[] nesneListesi= {"Bahçe", "Okul", "Park", "Sınıf", "Yarın",
				"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma",
				"Cumartesi", "Pazar", "Merkez", "Ev", "Kitap", "Defter", "Güneş", "Beydağı"};
		for(int i=0;i<nesneListesi.length;i++) {

			if(_kelimeler.get(1).equals((nesneListesi[i]))){
				return true;

			}
		}
		return false;

	}
	static boolean yuklem(ArrayList<String> _kelimeler) {
		String[] yuklemListesi= {"Gitmek", "Gelmek", "Okumak", "Yazmak", "Yürümek", "Görmek"};
		for(int i=0;i<yuklemListesi.length;i++) {

			if(_kelimeler.get(2).equals((yuklemListesi[i]))){
				return true;

			}
		}
		return false;

	}
	public static void kelimeDuzeltme(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            String str = strings.get(i);
            if (!str.isEmpty()) {
                String firstLetter = str.substring(0, 1).toUpperCase();
                String restOfString = str.substring(1).toLowerCase();
                strings.set(i, firstLetter + restOfString);
            }
        }
    }
}


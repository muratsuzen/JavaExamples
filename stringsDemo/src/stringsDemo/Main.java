package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Deneme Yazısı";
		System.out.println(mesaj);
		
		/*System.out.println("Eleman sayısı : "+mesaj.length());
		System.out.println("6. Eleman : "+mesaj.charAt(5));
		System.out.println(mesaj.concat(" *Ekleme Yazı*"));
		System.out.println(mesaj.startsWith("D"));
		System.out.println(mesaj.endsWith("ı"));
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("Yaz"));
		System.out.println(mesaj.lastIndexOf("me"));*/
		
		System.out.println(mesaj.replace(' ','|'));
		System.out.println(mesaj.substring(0,8));
		
		for(String kelime : mesaj.split("")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
	}

}

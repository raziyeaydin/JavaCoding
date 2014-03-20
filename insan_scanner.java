package kitap.bolum10.nyp;
 
import java.util.Scanner ;
 
public class Insan { // Insan adında bir sınıf oluşturuldu.
	
	static double boy ;        //
	static String cinsiyet ;   //    Sınıfa ait özellikler
	static int yas ;           //
	static String isim ;       // 
	
	public static void bilgi(){
		
		Scanner tara = new Scanner(System.in);
		
		System.out.print("isminizi giriniz: ");
		isim = tara.nextLine();
		             
		System.out.print("boyunuzu giriniz: ");
		boy = tara.nextDouble();
		                                                //Kullanıcı bilgilerinin alınması
		System.out.print("cinsiyetinizi yazınız: ");
		cinsiyet = tara.next();
		
		System.out.print("yaşınızı yazınız: ");
		yas = tara.nextInt();
	}
 
	public static void main(String[] args) {
		
		Insan kisi = new Insan();  //Insan sınıfına ait kisi adlı nesnenin oluşturulması
		
		bilgi(); //oluşturulan metodun kullanılması
		
		System.out.print(kisi.isim+","+kisi.yas+" yaşında "+kisi.boy+" boyunda "+"cinsiyeti ise "+kisi.cinsiyet); //bilgilerin ekrana yazdırılması...     
		}
 
}

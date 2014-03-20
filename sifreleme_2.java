package mobil_uygulama_rsa;
 
import java.util.ArrayList;
import javax.swing.JOptionPane;
 
public class Sifreleme {
	
	static ArrayList<Character> mesaj_karakter = new ArrayList<Character>(); 
	static ArrayList<Integer> mesaj_ascii = new ArrayList<Integer>();
	static ArrayList<Integer> donusturulmus_sayisal_mesaj = new ArrayList<Integer>() ;
	static ArrayList<Character> mesaj_sifreli = new ArrayList<Character>();
	
	static int p, q, e, n, phi_n ;
	static String mesaj ;
	static boolean durum= false ;
	static char ch ;
	
	
	
	
	static void kullanicidan_Al(){ //kullanıcıdan p,q ve e bilgilerinin istenmesi
		
		if(durum == false){     // durumu false olarak tanımladım aşağıda durumu true yapan 
							    // olay phi_n ile e'nin aralarında asal olması
		String asal1, asal2, asal3;
		
		asal1 = JOptionPane.showInputDialog("p asal sayınızı girin");
		p=Integer.parseInt(asal1);
		
		asal2 = JOptionPane.showInputDialog("q asal sayınızı girin");
		q = Integer.parseInt(asal2);
		
		asal3 = JOptionPane.showInputDialog("e asal sayınızı girin");
		e = Integer.parseInt(asal3);
		}
		
	}
	
	
	
	
	static int n_Hesapla(int x, int y){ //n'nin hesaplandığı metod
		
		n = x*y ;
		return n;
	
	}
 
	
	
	
	static int phi_n_Hesapla(int x, int y){ // phi_n'nin hesaplandığı metod
	
		phi_n = (x-1)*(y-1) ;
		return phi_n ;
	
	}
	
	
	
	
	static String mesaj_Al(){ // şifrelenecek mesajın kullanıcıdan istendiği metod 
		
		mesaj = JOptionPane.showInputDialog("şifrelenecek mesajınızı yazınız");
		return mesaj;
		
		
	}
	
	
	
	
	static void e_dogrulama( int tolient_n, int encrypt){ // e ile phi_n'nin aralarında asal 
														  // olup olmadığı kontrolünün yapıldığı metod
		if(tolient_n > encrypt){
			if( tolient_n % encrypt != 0){				  // e ile phi_n aralarında asal ise durum true olacak 
				durum = true ;							  // böylece ona göre bir ekran çıktısı verecek
			}
			else{
				durum = false ;
			}
			
			if(durum == true){
				JOptionPane.showMessageDialog(null, "e uygundur.");
			}
			else{
				String uyari = "e uygun değildir "+(p-1)+" ve "+(q-1)+"nin böle"
						+ "ni olmamalı.";
				JOptionPane.showMessageDialog(null, uyari ,"e asal olmalı",JOptionPane.WARNING_MESSAGE);
			}
			
		}
	}
	
	
	
	
	
	static void mesaji_ayir(String m){ // şifrelenecek mesajın ascii karşılıklarını bulurken kolaylık 
									   // sağlaması açısından karakterlerine ayrılan metod
		char msj[] = m.toCharArray();  // mesajı karakterlerine ayırdım.
		
		for(int i = 0 ; i < msj.length ; i++){ //for döngüsüyle 
			mesaj_karakter.add(msj[i]);        // mesajın her bir karakterini listeye ekledim
		}
		JOptionPane.showMessageDialog(null, mesaj_karakter);
		
	}
	
	
	
	
	
	static void mesaji_ascii_cevir(String k){ // her bir karakterin sayıya dönüştürüldüğü metod
		
		char harf;
		int ch ;
		
		char msj_liste[] = k.toCharArray(); // dizi oluşturulmuş
		
		for(int i=0 ; i < msj_liste.length ; i++){
			
			harf = msj_liste[i];
			ch = (int)(harf);
			mesaj_ascii.add(ch);
		}
		
		JOptionPane.showMessageDialog(null, mesaj_ascii); 
	}
	
	
	
	
	static void us_Alma(){ // ascii listenin üs alınıp yeni bir listeye eklendiği metod
		
		int us = e;
		int sonuc = 1;
		int taban, eleman ;
	
		for(int i = 0 ; i < mesaj_ascii.size() ; i++ ){
			taban = mesaj_ascii.get(i) ;
			
			for(int k = us ; k > 0 ; k--){
				sonuc = taban*sonuc ;
			}	
			eleman = sonuc%(n);
			if(eleman<0){ // eklenecek sayı negatif ise n ekliyoruz ve listeye ekliyoruz.
				eleman+= n ;
				donusturulmus_sayisal_mesaj.add(eleman);
			}
			else if(eleman > 255){ // eklenecek sayı ascii'de maksimum değerden büyükse 
				eleman = eleman%(255); // asci'de en büyük sayısal karşılık 255 olduğundan bu sayıyı çıkardım.
				donusturulmus_sayisal_mesaj.add(eleman);
			}
			else{ 
			donusturulmus_sayisal_mesaj.add(eleman);
			}
		}
		JOptionPane.showMessageDialog(null, donusturulmus_sayisal_mesaj,"ŞİFRELİ_ASCII",JOptionPane.PLAIN_MESSAGE);
	}
	
	
	
	
	static void donustur(ArrayList<Integer> k){
		
		int m;
		for(int i=0 ; i<k.size() ; i++){
			m = k.get(i);
			ch = (char)m;
			System.out.print(ch);
			
		}
		
		JOptionPane.showMessageDialog(null, ch);
	}
	
	
	
	static void bilinmeyen_d(){
		
		boolean state = true ;
		int d=2;
		while(state){
			if((e*d)%phi_n==1){
				state=false ;				
			}
			else{
				d++;
			}
			
		}
		JOptionPane.showMessageDialog(null, d, "d BİLİNMEYENİ", JOptionPane.DEFAULT_OPTION);
	}
	
	public static void main(String[] args) {
 
		kullanicidan_Al();
		n_Hesapla(p, q);
		phi_n_Hesapla(p, q);
		mesaj = mesaj_Al();
		e_dogrulama(phi_n, e);
		mesaji_ayir(mesaj);
		mesaji_ascii_cevir(mesaj);
		us_Alma();
		donustur(donusturulmus_sayisal_mesaj);
		bilinmeyen_d();
		
		
	}
 
}

package com.rzydn.rsa.Sifreleme;
 
import java.util.Scanner ;
import java.math.BigInteger;
import java.util.ArrayList;
 
public class Sifreleme {
	
	static BigInteger n,tolient_n ;
	static int p,q,E,i,ascii_int,indis;
	static String mesaj ;
	static char ascii_char;
	
	static ArrayList<Integer> ascii_liste = new ArrayList<Integer>();
 
	public static void main(String[] args) {
		
		p=bilgi_p();
		q=bilgi_q();
		hesap_n(p,q);
		hesap_tolient_n(p,q);
		E=bilgi_E();
		mesaj = mesaj_al();
		sifrele( mesaj);
		
	}
	
	public static int bilgi_p(){
		
		Scanner tara = new Scanner(System.in);
		
		System.out.print("asal p sayısını girin: ");
		p = tara.nextInt();
		return p ;
		
	}
	
	public static int bilgi_q(){
		
		Scanner tara = new Scanner(System.in);
		
		System.out.print("asal q sayısını girin: ");
		q = tara.nextInt();
		return q ;
		
	}
	
	public static void hesap_n( int x, int y) {
		
		n = BigInteger.valueOf(y*x);
		System.out.print("n: "+n+"\n") ;
				
	}
	
	public static void hesap_tolient_n(int x, int y){
		
		tolient_n = BigInteger.valueOf((x-1)*(y-1));
		System.out.print("tolient_n: "+tolient_n+"\n") ;
	}
	
	public static int bilgi_E(){
		Scanner tara = new Scanner(System.in);
		
		System.out.print("1<E<"+tolient_n+" , gcd(E,"+tolient_n+")=1  olmak üzere bir E sayısı girin: ");
		E = tara.nextInt();
		return E;
		
	}
 
	public static String mesaj_al(){
		
		Scanner tara = new Scanner(System.in);
		
		System.out.print("şifrelenecek mesajı yazın: ");
		mesaj = tara.nextLine();
		return mesaj;
 
	}
	
	public static void sifrele( String k){
		
		char[] c_liste = mesaj.toCharArray();
		i = c_liste.length ;
		for(indis = 0 ; indis < i ; indis++){
			ascii_char = c_liste[indis];
			ascii_int = (int)ascii_char ;
			ascii_liste.add(ascii_int);
	
		}
		System.out.print("ascii_liste "+ ascii_liste +"\n");
		
		
		
	}
}
 
 
 
/*  ekran çıktısı
 
asal p sayısını girin: 19
asal q sayısını girin: 23
n: 437
tolient_n: 396
1<E<396 , gcd(E,396)=1  olmak üzere bir E sayısı girin: 3
şifrelenecek mesajı yazın: raziye aydın
ascii_liste [114, 97, 122, 105, 121, 101, 32, 97, 121, 100, 305, 110]
*/

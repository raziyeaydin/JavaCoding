import java.util.Scanner;
import java.awt.Window;
 
public class Kutu {
	static int en,boy;
	static double yukseklik,hacim;
	static boolean durum= true;
	
	static void kullanicidanAl(){
		Scanner al=new Scanner(System.in);
		System.out.println("en boy yüksekliği girin: ");
		en=al.nextInt();
		boy=al.nextInt();
		yukseklik=al.nextDouble();
		
	}
	
	static void kontrolEt(int x, int y, double z){
		if(x<0 || y<0 || z<0){
			System.out.println("negatif değer girilemez !!");
			durum=false;
		}
		else{
			durum=true;
		}
	}
	
	static double hacimBul(int x, int y, double z){
		kontrolEt(en,boy,yukseklik);
		if(durum==true){
			hacim=x*y*z;
			return hacim ;
		}
		else{
			kullanicidanAl();
			hacimBul(en, boy, yukseklik);
			return 0;
		}
	}
	
	static void ekranaYaz(double hacim){
		System.out.println("hacim: "+ hacim);
	}
	
	public static void main(String[] args) {
		Kutu k = new Kutu();
		k.kullanicidanAl();
		k.hacimBul(en,boy,yukseklik);
		k.ekranaYaz(hacim);
		k.main(null);
	}
 
	}

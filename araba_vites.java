import java.util.Scanner;
public class araba {
	static int v;
	
	static void vites(){
		Scanner al = new Scanner(System.in);
		System.out.print("kaçıncı vitestesiniz: ");
		v=al.nextInt();
	}
	
	static void yaz(int v){
		System.out.println("araba "+v+"de gidiyor.");
	}
	
	static void hiz(int v){
		switch(v){
		case(5): System.out.println("100 ile gidiyorsunuz."); break;
		case(4): System.out.println("80 ile gidiyorsunuz."); break;
		case(3): System.out.println("60 ile gidiyorsunuz."); break;
		case(2): System.out.println("40 ile gidiyorsunuz."); break;
		case(1): System.out.println("20 ile gidiyorsunuz."); break;
		}
	}
	public static void main(String[] args) {
		araba.vites();
		if (v>5 || v<=0){
			System.out.println("yanlış değer girdiniz...");
			araba.main(null);//başa dön
		}
		else{
			araba.yaz(v);
		}
		araba.hiz(v);
		araba.main(null);
	}
 
}

package com.rzydn.rsa.SayiIste;
 
import javax.swing.JOptionPane ;
 
public class SayiIste {
	
	static int p,q ;
	static boolean durum = true ;
 
	static int sayi_al1(){
		
		String sayi1 = JOptionPane.showInputDialog("asal bir p sayısı girin:");//p sayısının alınması
		p = Integer.parseInt(sayi1);
		return p;
			
	}
	
	static int sayi_al2(){
		
		String sayi2 = JOptionPane.showInputDialog("asal bir q sayısı girin:");//q sayısının alınması
		q = Integer.parseInt(sayi2);
		return q;
		
	}
	
static void Kontrol(int a){ //sayıların asallık kontrolünün yapıldığı metod
	durum= true ;
		
		for(int k=2 ; k<a ; k++){
			
			if(a%k==0){
				
				durum = false ;
				JOptionPane.showMessageDialog(null,"sayı asal değil","UYARI",JOptionPane.WARNING_MESSAGE);//durumun false olması
				                                                                          //sayının asal olmadığı anlamına gelir.
				break;
			}
		
		}
		if(durum==true){
			
			JOptionPane.showMessageDialog(null,"asal sayı","TEBRİKLER",JOptionPane.PLAIN_MESSAGE);
			
		}
}
	
	public static void main(String[] args) {//ana metod
 
		p=sayi_al1();
		Kontrol(p);
		
		q=sayi_al2();
		Kontrol(q);
		
		}
		
}

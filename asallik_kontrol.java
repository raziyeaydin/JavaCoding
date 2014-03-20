package com.rzydn.rsa.AsallikKontrol;
 
import javax.swing.JOptionPane;
 
public class AsallikKontrol{
	
	static int p ;
	static boolean durum = true ;
	
	static int degerAl(){
		
		String pS = JOptionPane.showInputDialog("asal olmak şartıyla bir değer girin");
		int p = Integer.parseInt(pS);
		return p;
		
	}
	
	static void Kontrol(int a){
		
		for(int k=2 ; k<a ; k++){
			
			if(a%k==0){
				durum = false ;
				JOptionPane.showMessageDialog(null,"sayı asal değil","UYARI",JOptionPane.WARNING_MESSAGE);
				break;
			}
		}
		
		
		if(durum==true){
			JOptionPane.showMessageDialog(null,"asal sayı","TEBRİKLER",JOptionPane.PLAIN_MESSAGE);
		}
	}
		
 
	public static void main(String[] args) {
		
		p = degerAl();
		Kontrol(p);
		
 
	}
 
}

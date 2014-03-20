package com.rzydn.rsa.SayiIste;
 
import javax.swing.JOptionPane ;
 
public class SayiIste {
	
	static int p,q ;
 
	static void sayi_al(){
		
		String sayi1 = JOptionPane.showInputDialog("asal bir sayı girin:");
		p = Integer.parseInt(sayi1);
	
		String sayi2 = JOptionPane.showInputDialog("asal bir sayı daha girin:");
		p = Integer.parseInt(sayi2);
		
	}
	
	public static void main(String[] args) {
 
		sayi_al();
		
	}
 
}

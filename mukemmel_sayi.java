import javax.swing.JOptionPane;
public class mukemmel_sayi_bulduran {
 
	static int sayi1;
	static void sayiAl(){
		String sayi=JOptionPane.showInputDialog("sayıyı girin)");
		sayi1=Integer.parseInt(sayi);
	}
	
	static void kontrolEt(int x){
		int a=0;
		if (x>1){
			for( int i=1 ; i < x ; i++ ){
				if (x%i==0){
					a=a+i;					
				}
				if(sayi1 == a){
					JOptionPane.showMessageDialog(null,"sayınız mükemmel sayı");
					break;
				}
			}
		}
		else{
			String mesaj="pozitif tam sayılar girin";
			JOptionPane.showMessageDialog(null,mesaj);
			main(null);
		}
	}
	public static void main(String[] args) {
 
		sayiAl();
		kontrolEt(sayi1);
		
	}
 
}

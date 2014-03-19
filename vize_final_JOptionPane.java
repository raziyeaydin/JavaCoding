import javax.swing.JOptionPane;
 
public class vize_final {
 
	public static void main(String[] args) {
 
		int vize_notu;
		int final_notu;
		float ortalama;
		
		String vize=JOptionPane.showInputDialog("vize notunuzu giriniz");
		vize_notu=Integer.parseInt(vize);
		
		String finalnotu=JOptionPane.showInputDialog("final notunuzu girin");
		final_notu=Integer.parseInt(finalnotu);
	
		while(true){
			if(final_notu>=0 & vize_notu>=0){
				ortalama = (float)(vize_notu*0.4) + (float)(final_notu*0.6);
				String mesaj="dönem sonu notunuz "+ortalama ;
				JOptionPane.showMessageDialog(null, mesaj);
				break;
			}
			else{
				JOptionPane.showMessageDialog(null,"negatif not olmaz..");
				main(null);
			}
		}
	}
 
}

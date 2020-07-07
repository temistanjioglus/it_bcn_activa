import javax.swing.JOptionPane;

import java.util.Arrays;

public class ciutats2 {

	public static void main(String[] args) {
	
			 String[] arrayCiutats= new String[6];
			
			 
			 for(int i = 0; i<6; i++) {
				 
				 arrayCiutats[i]=JOptionPane.showInputDialog("Introdueix el nom de la "+ (i+1) +" ciutat");
				 
			 }
			 
			 
			 Arrays.sort(arrayCiutats);
			 
			 for(String elemento:arrayCiutats) {
				 
				 
				 
				 System.out.println(elemento);
				 
			 }
	
		
}
}
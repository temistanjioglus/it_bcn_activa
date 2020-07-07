import javax.swing.JOptionPane;

import java.util.Arrays;

public class ciutats3 {

	public static void main(String[] args) {
	
			 String[] arrayCiutats= new String[6];
			 String[] nouArrayCiutats = new String[6];
			 
			 for(int i = 0; i<6; i++) {
				 
				 arrayCiutats[i]=JOptionPane.showInputDialog("Introdueix el nom de la "+ (i+1) +" ciutat");
				 
			 }
			
			 
			 Arrays.sort(arrayCiutats);
			 
			 for (int i = 0; i < arrayCiutats.length; i++) { 
				 
		                
					  arrayCiutats[i]= arrayCiutats[i].replace("a", "4");
					  nouArrayCiutats[i]=arrayCiutats[i];
					 

		            }
				 
				 
				  
				  Arrays.sort(nouArrayCiutats);
				  
				  
				  System.out.println("Llista amb ciutats: ");
			
				  for (int j = 0; j < nouArrayCiutats.length; j++) { 	  
				  
				  System.out.println(nouArrayCiutats[j]);
				 
			 }
			 }
			 
	}



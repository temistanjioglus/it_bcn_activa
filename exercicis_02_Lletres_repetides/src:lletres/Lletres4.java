import java.util.ArrayList;
import java.util.Collections;


public class Lletres4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ArrayList <Character> nom = new ArrayList<>();
			ArrayList <Character> cognom = new ArrayList<>();
			ArrayList <Character> nomComplet = new ArrayList<> ();
			
			
			nom.add('J');
			nom.add('O');
			nom.add('R');
			nom.add('D');
			nom.add('I');
	
			cognom.add('T');
			cognom.add('E');
			cognom.add('M');
			cognom.add('I');
			cognom.add('S');
			cognom.add('T');
			cognom.add('A');
			cognom.add('N');
			cognom.add('J');
			cognom.add('I');
			cognom.add('O');
			cognom.add('G');
			cognom.add('L');
			cognom.add('U');
			cognom.add('S');
			
			for (int i=0; i<nom.size();i++) {
				
				nomComplet.add(nom.get(i));
				
				
			}
			
			nomComplet.add(' ');
			
			for (int i=0; i<cognom.size();i++) {
				
				nomComplet.add(cognom.get(i));
				
			}
			
			System.out.print(nomComplet);
			
				
				
				
			}
			
			
	}



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;


public class Lletres_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			
	
			ArrayList <Character> nomComplet = new ArrayList<>();
			int numLletres;
			HashMap<Character,Integer> mapnomComplet = new HashMap <>();
			
			nomComplet.add('E');
			nomComplet.add('M');
			nomComplet.add('I');
			nomComplet.add('L');
			nomComplet.add('I');
			nomComplet.add('E');
			nomComplet.add('0');

	for(int i = 0; i < nomComplet.size(); i++) {
				
				System.out.print(nomComplet.get(i));
				
				
				if (Character.isDigit(nomComplet.get(i))) {
					
					System.out.print(" Els noms de persones no contenen números! ");			
				
				} else {
						
					numLletres = Collections.frequency(nomComplet, nomComplet.get(i));
					mapnomComplet.put(nomComplet.get(i), numLletres);
					
					if (nomComplet.get(i) == 'A' || nomComplet.get(i) == 'E' || nomComplet.get(i) == 'I' || nomComplet.get(i) == 'O' || nomComplet.get(i) == 'U') {
						System.out.print(" VOCAL ");
					} else {
						System.out.print(" CONSONANT ");
					}
				}
				
				System.out.println(" ");
			}	
	
			System.out.println(mapnomComplet);
		}

		
	}



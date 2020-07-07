import java.util.ArrayList;

public class Lletres_2 {



	public static void main(String[] args) {
	
		
		ArrayList <Character> nomComplet = new ArrayList<>();
		
		nomComplet.add('J');
		nomComplet.add('O');
		nomComplet.add('R');
		nomComplet.add('D');
		nomComplet.add('I');
		nomComplet.add('1');
		nomComplet.add('0');

for(int i = 0; i < nomComplet.size(); i++) {
			
			System.out.print(nomComplet.get(i));
			
		
			if (Character.isDigit(nomComplet.get(i))) {
				System.out.print(" Els noms de persones no contenen números! ");			
			} else {
				if (nomComplet.get(i) == 'A' || nomComplet.get(i) == 'E' || nomComplet.get(i) == 'I' || nomComplet.get(i) == 'O' || nomComplet.get(i) == 'U') {
					System.out.print(" VOCAL ");
				} else {
					System.out.print(" CONSONANT ");
				}
			}
			
			System.out.println(" ");
		}		
		
	}

	}




public class variables_4 {

	public static void main(String[] args) {
		
		
		String nom = "Jordi";
		String cognom1 = "Temistanjioglus";
		String cognom2 = "San José";
		String nomComplet;
		
		int dia = 10;
		int mes = 4;
		int any = 1988;
		String dataNaixement;
		int anyInici;
		
		String anysTraspas;
		boolean esTraspas;
		
		String msgEsAnyTraspas;
		String msgNoEsAnyTraspas;
				

		nomComplet = nom + " " + cognom1 + " " + cognom2;
		
	
		dataNaixement = dia + "/" + mes + "/" + any;
		anysTraspas = "";			
		esTraspas = false;
		
		msgEsAnyTraspas = "El meu any de naixement és de traspàs.";
		msgNoEsAnyTraspas = "El meu any de naixement no és de traspàs.";
		
		for (anyInici = 1948; anyInici <= any; anyInici++) {
			if ((anyInici % 4 == 0) && (anyInici % 100 != 0) || (anyInici % 400) == 0) { // verifiquem si l'any es de traspàs
				anysTraspas += anyInici + " ";
				if ((anyInici == any)) { // verifiquem si l'any de naixement es de traspàs
					esTraspas = true;
				}
			}
		}		
				
		System.out.println("El meu nom és: " + nomComplet);
		System.out.println("Vaig néixer el: "+ dataNaixement);
		//System.out.println("Entre l'any " + anyInici + " i l'any " + any + " aquests anys: " + anysTraspas + "son de traspàs.");
		
		if (esTraspas) {
			System.out.println(msgEsAnyTraspas);		
		} else {
			System.out.println(msgNoEsAnyTraspas);
		}
	}	


}



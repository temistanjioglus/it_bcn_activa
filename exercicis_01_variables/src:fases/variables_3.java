

public class variables_3 {

	public static void main(String[] args) {
		
		String nom = "Jordi";
		String cognom1 = "Temistanjioglus";
		String cognom2 = "San José";
		
		String missatgeOk = "El meu any de naixement és de traspàs.";
		String missatgenoOK = "El meu any de naixement no és de traspàs.";
		
		String anysTraspas = "";
		boolean esTraspas = false;
				
		int dia = 10;
		int mes = 4;
		int any = 1988;
		int anyInici;
		
	
		
		for (anyInici = 1948; anyInici <= any; anyInici++) {
			if ((anyInici % 4 == 0) && (anyInici % 100 != 0) || (anyInici % 400) == 0) { // verifiquem si l'any es de traspàs
				anysTraspas += anyInici + " ";
				if ((anyInici == any)) { // verifiquem si l'any de naixement es de traspàs
					esTraspas = true;
				}
			}
		}	
		System.out.println(cognom1 + " " + cognom2 + " " + nom);
		System.out.println(dia + "/" + mes + "/" + any);
		System.out.println("Entre l'any " + anyInici + " i l'any " + any + " hi ha " + anysTraspas + " anys de traspàs.");
		
		if (esTraspas) {
			System.out.println(missatgeOk);		
		} else {
			System.out.println(missatgenoOK);
		}
	}	
}
		


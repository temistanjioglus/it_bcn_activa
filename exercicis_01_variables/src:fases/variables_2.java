
public class variables_2 {

	public static void main(String[] args) {
		
		String nom = "Jordi";
		String cognom1 = "Temistanjioglus";
		String cognom2 = "San José";
		
		int dia = 10;
		int mes = 4;
		int any = 1988;
		final int anyInici = 1948;
		
		int anyT = 0;
		int totalAnysTraspas = 0;
		
		
		
		for (anyT = anyInici; anyT <= any ; anyT++) {
			if ((anyT % 4 == 0) && (anyT % 100 != 0) || (anyT % 400) == 0){ // verifiquem si l'any es de traspàs
				totalAnysTraspas++;
			}
		}
		System.out.println(cognom1 + " " + cognom2 + " " + nom);
		System.out.println(dia + "/" + mes + "/" + any);
		System.out.println("Entre l'any " + anyInici + " i l'any " + any + " hi ha " + totalAnysTraspas + " anys de traspàs.");
		
		
	}

}

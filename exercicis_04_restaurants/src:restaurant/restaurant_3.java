import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class restaurant_3 {

	public static void main(String[] args) {
		
		int bitllet_cinc=5;
		int bitllet_deu=10;
		int bitllet_vint=20;
		int bitllet_cinquanta=50;
		int bitllet_cent=100;
		int bitllet_doscents=200;
		int bitllet_cinqcents=500;
		float total=0;
		
		String [] nomMenu = new String[5];
		Integer [] preuPlat = new Integer[5];
		
		Scanner introInfo = new Scanner(System.in); 

		List<Object> orderList = new ArrayList<>();
		
		int iniciList = 1;
		
		
		//entrada de dades
		for(int i=0; i<preuPlat.length;i++) {
			
			System.out.println("Introdueix el nom del Plat "+(i+1));
			nomMenu[i] = introInfo.nextLine(); 
			System.out.println("Introdueix el preu del Plat "+(i+1));
			preuPlat[i] = Integer.parseInt(introInfo.nextLine());
			
		}
		
		//mostrar el menú
		System.out.println("");
		System.out.println("Menú del día:");

		
		for (int i = 0; i<preuPlat.length;i++) {
			
			System.out.println(nomMenu[i]+" - "+preuPlat[i]+" €");
			
		}
		
		System.out.println("");
		
		
		System.out.println("Voleu menjar algo? 1:Sí/0:No");
		// guardar la comanda del consumidor
		while (iniciList == 1) {
			
			
			
			if (Integer.parseInt(introInfo.nextLine()) == 1) {
				System.out.println("Quin plat vols? ");
				orderList.add(introInfo.nextLine());
				System.out.println("Algo més? 1:Sí/0:No");
				while (Integer.parseInt(introInfo.nextLine()) == 1) {
					System.out.println("Quin altre plat vols? ");
					orderList.add(introInfo.nextLine());
					System.out.println("Algo més? 1:Sí/0:No");

				}
				
				}else {	
			
		
				iniciList = 0;
			}
		
			// mostrar la comanda
			System.out.println("");
			System.out.println("Has demanat :");
			orderList.forEach((item) -> System.out.println(item));
			System.out.println("");
			System.out.println("Vols afegir algo més? 1:Sí/0:No");
			
	}

orderList.forEach((item) -> System.out.println(item));						
		
		// Search list element in array
		for (int i = 0; i < orderList.size(); i++) {
			for (int j = 0; j < nomMenu.length; j++) {				
				if (orderList.get(i).equals(nomMenu[j])) {	
					total += preuPlat[j]; // calculem preu total
					iniciList++; // // valIntroValues ahora como contador de platos no existentes en menuList 					
				}
			}		
		}
		
		//mostrar el preu total
		total = (float) Math.round(total * 100) / 100; // redondeamos a 2 decimales				
		if (iniciList != orderList.size() || orderList.size() == 0) { 
			System.out.println("");
			System.out.println("Llista buida o amb algun plat que no està en el menú.");
		} else {
			System.out.println("");
			System.out.println("Preu Total:");
			System.out.println(total + " €");	
			System.out.println("");
			
			// Calculem monedes	
			iniciList = 0; 			
				
			orderList.clear(); 				// orderList ahora como lista de billetes
			orderList.add(bitllet_cinc);
			orderList.add(bitllet_deu);
			orderList.add(bitllet_cinquanta);
			orderList.add(bitllet_vint);
			orderList.add(bitllet_cent);
			orderList.add(bitllet_doscents);
			orderList.add(bitllet_cinqcents);
			
			for (int i = 0; i < orderList.size(); i++) {
				iniciList = (int) Math.floor(total / (int) orderList.get(i)); 			
				total = total - ((int) orderList.get(i) * iniciList); 				
				total = (float) Math.round(total * 100) / 100;							
				System.out.println(iniciList + " bitllets de " + orderList.get(i) + " €.");				
			}
			
			System.out.println("més " + total + " € en monedes.");		
						
		}	
		
}
	

}



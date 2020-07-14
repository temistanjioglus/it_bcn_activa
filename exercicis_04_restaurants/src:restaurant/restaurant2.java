import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class restaurant2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bitllet_cinc=5;
		int bitllet_deu=10;
		int bitllet_vint=20;
		int bitllet_cinquanta=50;
		int bitllet_cent=100;
		int bitllet_doscents=200;
		int bitllet_cinqcents=500;
		int total=0;
		
		String [] nomMenu = new String[5];
		Integer [] preuPlat = new Integer[5];
		
		Scanner introInfo = new Scanner(System.in); 

		List<Object> orderList = new ArrayList<>();
		
		int iniciList = 1;
		
		for(int i=0; i<preuPlat.length;i++) {
			
			System.out.println("Nom del Plat "+(i+1));
			nomMenu[i] = introInfo.nextLine(); 
			System.out.println("Preu del Plat "+(i+1));
			preuPlat[i] = Integer.parseInt(introInfo.nextLine());
			
		}
		
		System.out.println("");
		System.out.println("Menú :");

		
		for (int i = 0; i<preuPlat.length;i++) {
			
			System.out.println(nomMenu[i]+" - "+preuPlat[i]+" €");
			
		}
		
		while (iniciList == 1) {
			
			System.out.println("Voleu menjar algo? 1:Sí/0:No");
			
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
		

		orderList.forEach((item) -> System.out.println(item));
	}

}
}
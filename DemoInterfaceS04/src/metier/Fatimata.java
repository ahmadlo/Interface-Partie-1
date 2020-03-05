package metier;

import service.IManga;
import service.ISport;

public class Fatimata  implements ISport, IManga{

	@Override
	public void courir() {
		
		System.out.println("Fatimata sait courir ");
		
	}

	@Override
	public void nager() {
		
		System.out.println("Fatimata sait nager ");
		
	}

	@Override
	public void lireManga() {
		System.out.println("J'aime lire des mangas");
		
	}
	
	
}

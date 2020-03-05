package metier;

import service.IJeu;
import service.ISport;

public class Benjamin  implements ISport, IJeu{
	@Override
	public void courir() {
		System.out.println("BEnji sait courir ");
	}
	@Override
public void nager() {
	System.out.println("BEnji sait nager ");
}
	@Override
	public void jouer() {
		System.out.println("J'aime jouer");
		
	}
}

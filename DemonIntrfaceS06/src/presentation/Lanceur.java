package presentation;

import metier.Benjamin;
import metier.Cedric;
import metier.Fatimata;
import service.ServiceSport;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceSport sport = new ServiceSport();
		Benjamin b = new Benjamin();
		
		sport.participerTriathlon(b);
		b.implementer();
		
		
		Fatimata f = new Fatimata();
		
		sport.participerTriathlon(f);
		f.implementer();
		
		/*Cedric c = new Cedric();
		sport.participerTriathlon(c);*/

	}

}

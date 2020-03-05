package presentation;

import metier.Benjamin;
import metier.Fatimata;
import service.IManga;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Benjamin b = new Benjamin();
		b.courir();
		b.nager();
		b.jouer();
		b.etreAddict();
		
		Fatimata f = new Fatimata();
		f.courir();
		f.nager();
		f.lireManga();
		//f.shonen();
		
		IManga.shonen();
		

	}

}

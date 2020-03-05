package service;

public interface ITriathlon {
	  void courir();
	
	 void nager();
	 
	 void pedaler();
	 
	 default void implementer() {
		 System.out.println(" Je suis une methode default - ");
	 }

}

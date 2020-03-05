package service;

public interface IJeu {
void jouer();
default void etreAddict() {
	System.out.println("Je suis addict au jeu ");
}
}

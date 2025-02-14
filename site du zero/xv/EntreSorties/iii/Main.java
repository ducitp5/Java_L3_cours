package xv.EntreSorties.iii;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	
	public static void main(String[] args) {
	
		ObjectOutputStream oos;
		
		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("game.txt"))));
			oos.writeObject(new Game("Assassin Creed", "Aventure", 45.69));
			oos.writeObject(new Game("Tomb Raider", "Plateforme", 23.45));
			oos.writeObject(new Game("Tetris", "Stratégie", 2.50));
			oos.close();

		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		ObjectInputStream ois;
		
		try {
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("game.txt"))));
		
			try {
				System.out.println("Affichage des jeux :");
				System.out.println("*************************\n");
				System.out.println(((Game) ois.readObject()).toString());
				System.out.println(((Game) ois.readObject()).toString());
				System.out.println(((Game) ois.readObject()).toString());
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			ois.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

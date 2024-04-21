package pt.iscte.dcti.poo.sokoban.starter;

import java.io.FileNotFoundException;

import pt.iul.ista.poo.gui.ImageMatrixGUI;

public class Main {
	public static SokobanGame s;
	
	public static void main(String[] args) throws FileNotFoundException {
		ImageMatrixGUI.setSize(10, 10);
		s =new SokobanGame();
		ImageMatrixGUI.getInstance().registerObserver(s);
		ImageMatrixGUI.getInstance().go();

			
	
		
	}

}

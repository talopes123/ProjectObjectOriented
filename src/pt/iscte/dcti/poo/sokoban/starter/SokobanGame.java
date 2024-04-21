package pt.iscte.dcti.poo.sokoban.starter;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pt.iul.ista.poo.gui.ImageMatrixGUI;
import pt.iul.ista.poo.gui.ImageTile;
import pt.iul.ista.poo.observer.Observed;
import pt.iul.ista.poo.observer.Observer;
import pt.iul.ista.poo.utils.Direction;
import pt.iul.ista.poo.utils.Point2D;

public class SokobanGame implements Observer{
 	
	
	List<AbstractObject> lista = new ArrayList<>();
	List<AbstractObject> listaActive = new ArrayList<>();
	AbstractObject obj;
	private Player player;
	
	
	 
	
	
	
	 
	 
	 
	 
		 
	
	
	public SokobanGame() throws FileNotFoundException {
		
		ArrayList<ImageTile> tiles = buildSampleLevel();

		Scanner ss = new Scanner(new File("levels/level0.txt"));
		int j = 0;
		
		while(ss.hasNextLine()){
			String linha = ss.nextLine();
			for(int i = 0; i < linha.length(); i++){
				AbstractObject obj = Nivel.criarObjetos(linha, i, j);
			if(obj instanceof Player)
				player = (Player) obj;
			if(obj instanceof ActiveObject)
				listaActive.add(obj);
			else
				lista.add(obj);
			
			
		}
			j++;
	}
		
		
		
			for(AbstractObject obj: lista)
					if(obj != null)
						tiles.add(obj);
					
			
			for(AbstractObject obj:  listaActive)
					if(obj != null)
						tiles.add(obj);
			
			
			
			
			
		
		ImageMatrixGUI.getInstance().addImages(tiles);
		ImageMatrixGUI.getInstance().setName("SokobanDoGonçalo");
		
		
		
		}
	

	
	
	public AbstractObject checkPosition2(Point2D p) {
		
		for (AbstractObject a: Main.s.getLista())
			if (a.getPosition().equals(p))
				obj = a;
				
		
		return obj;
	}
	
	
	
	
	public List<AbstractObject> getLista() {

		return this.lista;
	}
	
	
	public List<AbstractObject> getListaA() {
		return this.listaActive;
	}
	
	
	private ArrayList<ImageTile> buildSampleLevel() {
		
		ArrayList<ImageTile> sampleLevelTiles = new ArrayList<ImageTile>();
		
		// Build 10x10 floor tiles
		for (int y = 0; y != 10; y++)
			for (int x = 0; x != 10 ; x++)
				sampleLevelTiles.add(new Chao(new Point2D(x, y)));
				
		return sampleLevelTiles;	
	}
	
	@Override
	public void update(Observed arg0) {
		int lastKeyPressed = ((ImageMatrixGUI)arg0).keyPressed();
		Direction dir = Direction.directionFor(lastKeyPressed);
		
		System.out.println("Key pressed " + lastKeyPressed);
		
		if (Direction.isDirection(lastKeyPressed)) {
			
			
				for (AbstractObject d:listaActive){
					if (d.isMovable())
						if (d != null && d.checkParede(dir))
						
						
						d.move(dir);
						
				
		 }
	 }
		
		ImageMatrixGUI.getInstance().setStatusMessage("Moves: " + player.getMoves());
}
	
  }
				
				

		
		
			


	

	
	
	
		



	
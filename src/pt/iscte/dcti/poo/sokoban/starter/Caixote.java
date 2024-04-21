package pt.iscte.dcti.poo.sokoban.starter;



import pt.iul.ista.poo.utils.Direction;
import pt.iul.ista.poo.utils.Point2D;


import java.util.ArrayList;
import java.util.List;

import pt.iul.ista.poo.gui.ImageMatrixGUI;
import pt.iul.ista.poo.gui.ImageTile;



public class Caixote extends AbstractObject implements ActiveObject{
	 
	 
	 
	
	public Caixote(Point2D position) {
		super(position);
		ImageName = "Caixote";
		}
	
	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return ImageName;
	}
	
	
	@Override
	public int getLayer() {
		
		return 2;
	}	
			
	@Override
	public boolean surpassable() {
		return false;
	}

	@Override
	public void interact() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	public void move(Direction dir){
		Point2D newPosition = position.plus(dir.asVector());
		
		
		if (newPosition.getX() >= 0 && newPosition.getX() < 10 && newPosition.getY() >= 0 && newPosition.getY() < 10 ){
			
					
				if(canMove(dir))
					position = newPosition;
		
			ImageMatrixGUI.getInstance().update();
		}
		}
	
		
 		public boolean canMove(Direction dir) {
 			for (AbstractObject a:Main.s.getListaA())
			   	
				if (position.equals(a.getPosition().plus(dir.asVector())) && a instanceof Player)
					return true;
 			return false;
 		}

 		
 		@Override
 		public boolean checkParede(Direction dir) {
 			Point2D newPosition = position.plus(dir.asVector());
 			for (AbstractObject a:Main.s.getLista())
 				if (newPosition.equals(a.getPosition())&& a instanceof Parede)
 					return false;
 			return true;
 		}



		@Override
		public boolean isMovable() {
			// TODO Auto-generated method stub
			return true;
		}
 		}

 		


		
		
 
	



 
 
	

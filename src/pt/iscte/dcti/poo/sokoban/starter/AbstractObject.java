package pt.iscte.dcti.poo.sokoban.starter;


import pt.iul.ista.poo.utils.Direction;
import pt.iul.ista.poo.utils.Point2D;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pt.iul.ista.poo.gui.ImageMatrixGUI;
import pt.iul.ista.poo.gui.ImageTile;



public abstract class AbstractObject implements ImageTile{
	 Point2D position;
	String ImageName;
	
	 
	
	
	public abstract boolean isMovable();
	
	
	
	
	public AbstractObject (Point2D position){
		super();
		this.position=position;
	}
	
	

	
	
	@Override
	public Point2D getPosition(){
		return position;
	}
					
	
	
	public boolean checkParede(Direction dir){
		Point2D newPosition = position.plus(dir.asVector());
		for(AbstractObject a:Main.s.getLista())
			if(newPosition.equals(a.getPosition())&& a instanceof Parede)
				return false;
		return true;
	}
	

	
	
	
		
	public void move(Direction dir){
		Point2D newPosition = position.plus(dir.asVector());
		
		
		if (newPosition.getX()>=0 && newPosition.getX()<10 && newPosition.getY()>=0 && newPosition.getY()<10 ){
			for(AbstractObject a:Main.s.getLista())
				if(a instanceof ActiveObject)	
			position=newPosition;
			
			newPosition=position;
		}
			ImageMatrixGUI.getInstance().update();
		}
	
	
	public boolean checkParede2 (Direction dir){
		Point2D newPosition = position.plus(dir.asVector());
	
		
	    AbstractObject obj=Main.s.checkPosition2(newPosition);
		
			if(obj instanceof Parede)
				
				return true;
			return false;
			
	}

	
}
						
		
		


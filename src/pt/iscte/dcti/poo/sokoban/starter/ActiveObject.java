package pt.iscte.dcti.poo.sokoban.starter;

import java.awt.geom.Point2D;

import pt.iul.ista.poo.utils.Direction;

public interface ActiveObject  {
	boolean surpassable();
	boolean isMovable();
	void interact();
	void move(Direction dir);
	boolean checkParede(Direction dir);
	boolean canMove(Direction dir);
	
	
	
	
	
	

}

package pt.iscte.dcti.poo.sokoban.starter;

import java.util.List;
import java.util.Random;

import pt.iul.ista.poo.gui.ImageMatrixGUI;
import pt.iul.ista.poo.gui.ImageTile;
import pt.iul.ista.poo.utils.Direction;
import pt.iul.ista.poo.utils.Point2D;

public class Player extends AbstractObject implements ActiveObject  {

	
	
	
	
	public List<AbstractObject> lista;
	public int moves = 0;
	
	
	
	
	
	
	public Player(Point2D position) {
		super(position);
		ImageName = "Empilhadora_D";
	}
	
	@Override
	public String getName() {
		return ImageName;
	}

	@Override
	public int getLayer() {
		return 3;
	}
	
	
	public int getMoves() {
		return moves;
		
	}
		
	
	
	@Override
	public void move(Direction dir) {
		switch(dir){
		case LEFT:ImageName = "Empilhadora_L";
		break;
		case RIGHT:ImageName = "Empilhadora_R";
		break;
		case UP:ImageName = "Empilhadora_U";
		break;
		case DOWN:ImageName = "Empilhadora_D";
		break;
		}
		
		Point2D newPosition = position.plus(dir.asVector());
		
		
		if (newPosition.getX() >= 0 && newPosition.getX() < 10 && newPosition.getY() >= 0 && newPosition.getY() < 10 )
			
				position = newPosition;
				moves++;
			
		
			
		ImageMatrixGUI.getInstance().update();
		}
	
	
	@Override
	public boolean surpassable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void interact() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canMove(Direction dir) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkParede(Direction dir){
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

	

	
	
	
	
			
	
	
	
			



	
			
		
	


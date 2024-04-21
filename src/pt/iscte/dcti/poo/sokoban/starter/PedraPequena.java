package pt.iscte.dcti.poo.sokoban.starter;

import pt.iul.ista.poo.utils.Direction;
import pt.iul.ista.poo.utils.Point2D;

public class PedraPequena extends AbstractObject implements ActiveObject {
	
	public PedraPequena(Point2D position) {
		super(position);
		ImageName="SmallStone";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return ImageName;
	}

	@Override
	public int getLayer() {
		// TODO Auto-generated method stub
		return 2;
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
	public boolean isMovable() {
		// TODO Auto-generated method stub
		return true;
	}


}


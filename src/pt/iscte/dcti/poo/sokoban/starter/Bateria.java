package pt.iscte.dcti.poo.sokoban.starter;

import pt.iul.ista.poo.utils.Direction;
import pt.iul.ista.poo.utils.Point2D;

public class Bateria extends AbstractObject implements ActiveObject {

	public Bateria(Point2D position) {
		super(position);
		ImageName="Bateria";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return ImageName;
	}

	@Override
	public int getLayer() {
		// TODO Auto-generated method stub
		return 0;
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
		return false;
	}

}

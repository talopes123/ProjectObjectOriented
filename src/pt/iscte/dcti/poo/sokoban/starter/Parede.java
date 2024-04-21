package pt.iscte.dcti.poo.sokoban.starter;

import pt.iul.ista.poo.utils.Point2D;

public class Parede extends AbstractObject implements InactiveObject{

	public Parede(Point2D position) {
		super(position);
		ImageName="Parede";
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
	public boolean isMovable() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
}

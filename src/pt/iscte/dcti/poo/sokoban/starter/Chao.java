package pt.iscte.dcti.poo.sokoban.starter;
import pt.iul.ista.poo.gui.ImageTile;
import pt.iul.ista.poo.utils.Point2D;

public class Chao extends AbstractObject implements InactiveObject {


	
	public Chao(Point2D position){
		super(position);
		ImageName="Chao";
		
	}
	
	@Override
	public String getName() {
		return ImageName;
	}

	@Override
	public Point2D getPosition() {
		return position;
	}

	@Override
	public int getLayer() {
		return 0;
	}

	@Override
	public boolean isMovable() {
		// TODO Auto-generated method stub
		return false;
	}

}

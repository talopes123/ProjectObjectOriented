package pt.iscte.dcti.poo.sokoban.starter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import pt.iul.ista.poo.gui.ImageTile;
import pt.iul.ista.poo.utils.Point2D;

public class Nivel {
	 String nivel1="levels/level0.txt";
	 String nivel2="levels/level1.txt";
	 String nivel3="levels/level2.txt";
	private int widht;
	private int height;
	char [][] m=new char[10][10];
	List<AbstractObject> lista=new ArrayList<AbstractObject>();
	
	
	
	
	
	
	public static AbstractObject criarObjetos(String grelha,int k,int l){
		
			
		
		 switch(grelha.charAt(k)){
		 
		 case '#':return new Parede(new Point2D(k,l));
		 case 'O':return new Buraco(new Point2D(k,l));
		 case 'E':return new Player (new Point2D(k,l));
		 case 'C':return new Caixote(new Point2D(k,l));
		 case 'X':return new Alvo(new Point2D(k,l));
		 case'b':return new Bateria(new Point2D(k,l));
		 default:return new Chao(new Point2D(k,l));
		 }
	}
		 
		 
	public static ActiveObject criarActive(String grelha,int k,int l){
		switch(grelha.charAt(k)){
		 
		 
		 case 'E':return new Player (new Point2D(k,l));
		 case 'C':return new Caixote(new Point2D(k,l));
		 
		 default:return null;
		 }
		 
	}
	 
	

}


		 
		 
		 
		
		
			
		
	
	
	
	




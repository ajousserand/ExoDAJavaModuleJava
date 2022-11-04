package echiquier;

import echec.Position;
import piece.Piece;

public class Case {
	private Position position;
	private Piece piece;
	private String affichage;
	
	
	public Case(Position position){
		this.position = position;
	}
	
	public String getAffichage() {
		return affichage;
	}

	public void setAffichage(String affichage) {
		this.affichage = affichage;
	}	

	public Position getPosition(){
		return position;
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}

	public Piece getPiece(){
		return piece;
	}
	
	public void positionne(Piece p){
		this.piece=p;
	}

	@Override
	public String toString() {
		return ("Case"+ position + piece);
	}
	
	public void vider(){
		piece=null;
	}
	 
	 
}

package fr.caensup.licence.prince;

public class Prince extends Personnage {
	public Emplacement localisation;

	public Prince(){
	}

	public void deplacement(Orientation sens,Emplacement[][] plateau){
		switch (sens){
			case EST:
				if(verifBordure(this.localisation.x,this.localisation.y+1, plateau)){
				this.localisation=plateau[this.localisation.x][this.localisation.y+1];}
				break;
			case OUEST:
				if(verifBordure(this.localisation.x,this.localisation.y+1, plateau)){
				this.localisation=plateau[this.localisation.x][this.localisation.y-1];}
				break;
			case NORD:
				if(verifBordure(this.localisation.x,this.localisation.y+1, plateau)){
				this.localisation=plateau[this.localisation.x-1][this.localisation.y];}
				break;
			case SUD:
				if(verifBordure(this.localisation.x,this.localisation.y+1, plateau)){
				this.localisation=plateau[this.localisation.x+1][this.localisation.y];}
				break;		
		}
	}

	public boolean verifBordure(int xIncr, int yIncr, Emplacement[][] plateau){
		int tailleX_plateau=plateau.length;
		int tailleY_plateau=plateau[0].length;
		System.out.println("Xincr="+xIncr+1);
		System.out.println("Yincr="+yIncr+1);
		System.out.println("taillex="+tailleX_plateau);
		System.out.println("TailleY="+tailleY_plateau);
		if(0<=xIncr+1  && xIncr+1<=tailleX_plateau && 0<=yIncr+1 && yIncr+1 <=tailleY_plateau){
			return true;
		}
		return false;
	}

	private int getNiveau(){
		return this.localisation.getNiveau();
	}
}













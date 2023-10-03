package fr.caensup.licence.prince;

public abstract class Personnage {
    private int maxPv;
    private int activePv;
	private boolean epee;
    private Orientation direction;
	
	public Personnage() {
        this.maxPv=5;
		this.activePv=3;
		this.epee=false;
	}
	
	public int getactivePv() {
		return this.activePv;
	}
	
	public boolean hasEpee() {
		return this.epee;
	}
	
	public void boire(Fiole fiole) {
		this.activePv=this.activePv+fiole.getEffetPv();
	}

    public void seDeplacer(int x, int y){}

    public void attaquer(Personnage personnage){
        personnage.activePv=personnage.activePv-1;
    }


}

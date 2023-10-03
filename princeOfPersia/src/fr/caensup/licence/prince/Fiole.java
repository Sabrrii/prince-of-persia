package fr.caensup.licence.prince;

public class Fiole extends AbstractObject {
	private int pv;
	private boolean effet;
	
	public Fiole() {
		this.pv=3;
		this.effet=true;
	}
	
	public void setPv(int pv) {
		this.pv = pv;
	}
	
	public void setEffet(boolean effet) {
		this.effet = effet;
	}
	
	/**
	 * Retourne les points de vie compte tenu de l'effet
	 * @return
	 */
	public int getEffetPv() {
		if(this.effet) {
			return this.pv;
		}
		return -this.pv;
	}
	
	public boolean isEffet() {
		return effet;
	}
}

package fr.caensup.licence.prince;

public class Emplacement {
    private int niveau;
    private AbstractObject contenu;
    private Personnage enemie;
    public int x,y;

    public Emplacement(int lv,int x, int y){
        this.niveau=lv;
        this.x=x;
        this.y=y;
    }
    public Emplacement(int lv,int x, int y,AbstractObject quoi){
        this.niveau=lv;
        this.x=x;
        this.y=y;
        this.contenu=quoi;
    }
    public Emplacement(int lv,int x, int y, Personnage mechant){
        this.niveau=lv;
        this.x=x;
        this.y=y;
        this.enemie=mechant;
    }

    public int getNiveau(){
        return this.niveau;
    }

    public Emplacement getNord(Emplacement [][] plateau){
        return plateau[this.x][this.y-1];
    }

    public Emplacement getSud(Emplacement [][] plateau){
        return plateau[this.x][this.y+1];
    }

    public Emplacement getEst(Emplacement [][] plateau){
        return plateau[this.x-1][this.y];
    }
    
    public Emplacement getOuest(Emplacement [][] plateau){
        return plateau[this.x+1][this.y];
    }
}

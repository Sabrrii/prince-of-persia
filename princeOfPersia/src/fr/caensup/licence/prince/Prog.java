package fr.caensup.licence.prince;

public class Prog {

	public static void main(String[] args) {

		Emplacement [][] plateau = new Emplacement[4][4];
		for(int i=0;i<plateau.length;i++){
			for(int j=0;j<plateau[i].length;j++){
				Emplacement emp = new Emplacement(1,i,j);
				plateau[i][j]=emp;
				//System.out.println("position : "+i+","+j+plateau[i][j]);
			}
		}

		Prince joe=new Prince();
		joe.localisation= plateau[0][0];
		joe.deplacement(Orientation.OUEST, plateau);

		for (int i = 0; i < plateau.length; i++) {
			System.out.println("");
			for (int j = 0; j < plateau[i].length; j++) {
				if (joe.localisation == plateau[i][j]) {
					System.out.print("x|");
				} else {
					System.out.print(" |");
				}
			}
		}	




		
		// System.out.println("pv de joe : "+joe.getactivePv());
		// System.out.println("Epee : "+joe.hasEpee());
		// Garde dalton= new Garde();
		// System.out.println("pv mechant : "+dalton.getactivePv());
		// joe.attaquer(dalton);
		// dalton.attaquer(joe);
		// System.out.println("pv mechant : "+dalton.getactivePv());
		// System.out.println("pv de joe : "+joe.getactivePv());
	}

}

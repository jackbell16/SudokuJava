package utils;

public class RisolutoreCarattare implements Risolutore {
	
	int[] sommaValori = new int[9];
	
	private void calcolaSommaN(String[][] valori) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9 ; j++) {
				if(!valori[i][j].equalsIgnoreCase(".")){
				sommaValori[i] += Integer.valueOf(valori[i][j]); 
				}
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see utils.Risolutore#risolvi(java.lang.String[][])
	 */
	@Override
	public void risolvi(String[][] valori){
		calcolaSommaN(valori);
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if(valori[i][j].equalsIgnoreCase(".")){
					valori[i][j] = String.valueOf(45-sommaValori[i]);
				}
			}
		}
	}
}
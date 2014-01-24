/**
 * Questa interfaccia ha i metodi che dobrebbe essere implementati dalle
 * classe che contengono metodi per interpretare un file contenente
 * i valori delle varie righe del sudoku
 * @author Giacomo
 */
package utils;

import java.util.ArrayList;

public interface InterpreteSudoku {

	public abstract void impostaSoduku(ArrayList<String> list);
	
	public String[][] getValori(); 

}
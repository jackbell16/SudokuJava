/**
 * Questa classe contiene di leggere un file e trasformarlo in lista
 * di stringhe
 * @author Giacomo
 */
package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CaricamentoFile {
	private ArrayList<String> list = new ArrayList<>();
	private BufferedReader bufferedReader;
	/**
	 * Questo metodo permette di impostare il nome del file da leggere
	 * @param string
	 */
	public void setNameFile(String string){
		list.clear();
		try {
			bufferedReader = new BufferedReader(new FileReader(string));
			String line = bufferedReader.readLine();
			while(line!=null){
				list.add(line);
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<String> getList() {
		return list;
	}
	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	
}

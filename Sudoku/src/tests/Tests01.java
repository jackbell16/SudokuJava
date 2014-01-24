package tests;

import utils.CaricamentoFile;
import utils.InterpreteSudokuTest;
import utils.Risolutore;
import utils.RisolutoreCarattare;
import utils.Sudoku;

public class Tests01 {
	public static void main(String[] args) {
		// Caricaro il file
		CaricamentoFile caricamentoFile = new CaricamentoFile();
		caricamentoFile.setNameFile("sudoku.txt");
		// vengono convertati i dati
		InterpreteSudokuTest interpreteFileSudoku = new InterpreteSudokuTest();
		interpreteFileSudoku.impostaSoduku(caricamentoFile.getList());
		Sudoku sudoku = new Sudoku(interpreteFileSudoku);
		sudoku.stampaSudoku();
		Risolutore risolutoreCarattare = new RisolutoreCarattare();
		sudoku.stampaSudokuRisolto(risolutoreCarattare);
	}
}

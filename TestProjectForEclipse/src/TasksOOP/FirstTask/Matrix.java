package TasksOOP.FirstTask;

public class Matrix {
	public double[][] matrixArray;
	public int columns, rows;
	
	public Matrix() {
		this.columns = 5;
		this.rows = 5;
		matrixArray = new double[5][5];
	}
	public Matrix(int columns, int rows) {
		this.columns = columns;
		this.rows = rows;
		matrixArray = new double[columns][rows];
	}
	
	public Matrix sumWithNumber(int n) { 
		for(int i = 0; i < columns; i++) {
			for(int j = 0; j < rows; j++) {
				this.matrixArray[i][j] += n;
			}
		}
		return this;
	}
	
	public Matrix mulWithNumber(int n) {
		for(int i = 0; i < columns; i++) {
			for(int j = 0; j < rows; j++) {
				this.matrixArray[i][j] *= n;
			}
		}
		return this;
	}
}
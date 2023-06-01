package Tema4control;

public class Matriz {

	public static void main(String[] args) {
			int notas[][]= new int[3][4];
			for(int i=0;i<3;i++) {
				for(int c=0;c<12;c++) {
					int x=(int)(Math.random()*200-(-200));
					notas[i][c]=x;
					System.out.print(notas[i][c]+" ");}
			System.out.println("");

	}
	}
}

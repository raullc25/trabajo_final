package tema5;

public class matrices {

	public static void main(String[] args) {
		int[][] notas =new int[3][2];//Si fuera 3 x 12 se asignaria con otro bucle y no manualmente =36 componentes
        int filas,columnas;
        notas[0][0]= 1;
                notas[0][1]= 1;
        notas[1][0]=2;
                 notas[1][1]=2;
        notas[2][0]        =3   ;
       notas[2][1]=3;
       for(filas=0;filas<3;filas++){
           for(columnas=0;columnas<2;columnas++){
               System.out.print(notas[filas][columnas]+"  "); //tras escribir un componente separo con dos espacios en blancos
           }
           System.out.println();
       }

    }
}

/*Salida de la matriz 3 filas y 2 columnas
1  1
2  2
3  3 */


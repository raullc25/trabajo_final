package tema6;
/** tres versiones del método suma:
* 1una versión que suma dos números double
* 2 otra que suma tres
* 3suma todos los miembros de un array de números decimales.
* JVM decide llamar una u otra segun los datos pasados en la llamada
7 */
 // 6.6.3- Sobrecarga de metodos Pagina 21
public class Matematicas2 {
// fijate que los tipos o parametros varian, por eso NO HAY CONFLICTO
// multiples formas de sumar con distintas acciones {} : POLIMORFISMO
public double suma(double x, double y) {
return x+y;
}
public double suma(double x, double y, double z){
return x+y+z;
}
public double suma(double[] array){
double total =0;
for(int i=0; i<array.length;i++){
total+=array[i];
}
return total;
}
//////////////////////////////////////////// MAIN solo p robar
public static void main(String args[])
{
Matematicas2 m1 =new Matematicas2();
// p1 la llenamos y mostramos campo a campo
System.out.println("usamos primera opcion SUMA DE ENTEROS ");
//1)
System.out.print("\nLA SUMA 1 ES =");
double res1= m1.suma(3.1, 6.0);
System.out.print(res1);
//2)
System.out.print("\nLA SUMA 2 ES =");
res1= m1.suma(2, 6.54, 10);
System.out.print(res1);
//3
double array[]={2,2,1.54,1,1.22};
System.out.print("\nLA SUMA 3 ES =");
res1= m1.suma(array);
System.out.print(res1);

}
}
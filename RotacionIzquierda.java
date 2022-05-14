import java.util.Scanner;
public class RotacionIzquierda{
  public static void main (String [] args){ 
  int[] arr1 ={1,3,9,2,5};
  int[] aiz;
  int posicion;
  Scanner sc = new Scanner(System.in);
  mostrar(arr1);
  System.out.println("Indique la posición para ponerlo a la izquierda:");
  posicion = sc.nextInt();
  aiz = rotarIzquierdaArray(arr1,posicion);
  mostrar(aiz);
  }
  public static int[] rotarIzquierdaArray(int[] A, int D){
    int [] Aiz = new int [A.length];
    int posD = A.length - D;
    if(D<A.length){
      for(int i=0;i<=D;i++)
        Aiz[i] = A[D+i];
        
      int cont=0;
      for(int j=posD;j<A.length;j++){
        Aiz[j] = A[cont];
        cont++;
      }
    }
    return Aiz;
  }
  public static void mostrar(int[]a){
    System.out.print("{ ");
    for(int i = 0; i < a.length; i++){
      System.out.print(a[i]);
      System.out.print(", ");
    }
    System.out.print("}");
    System.out.print("\n");
  }
} 

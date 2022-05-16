public class InvertirMatriz{
  public static void main (String [] args){
  
  int[] matriz ={8,5,3,2,7};
  int[] matriz_Invertida;
  mostrar(matriz);
  System.out.print(" ----> ");
  matriz_Invertida=invertirArray(matriz);
  mostrar(matriz_Invertida);
  }

  public static int [] invertirArray(int[]a){
    int guardar;
    int ultimo = a.length-1;
    for(int primero=0; primero < ultimo; primero++){ 
        guardar=a[primero];
        a[primero] = a[ultimo];
        a[ultimo] = guardar;
        ultimo--;
    }
    return a;
  }
  public static void mostrar(int[]a){
    System.out.print("[ ");
    for(int i = 0; i < a.length; i++){
      System.out.print(a[i]);
      System.out.print(", ");
    }
    System.out.print("]");
  }
}

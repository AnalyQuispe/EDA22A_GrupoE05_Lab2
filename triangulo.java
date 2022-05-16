import java.util.*;
	public class triangulo {
		
		public static void main(String []args) {
			int n,a;
			Scanner scan= new Scanner(System.in);
			System.out.println("Ingrese n:");
			n=scan.nextInt();
			a=n;
			trianguloRecursivo(n+1,a+1);
		}
		
		public static void trianguloRecursivo(Integer b,Integer a) {
			
			if(b==1) {
				System.out.println("");
				
			}
			else{
				for(int i=b;i<=a;i++) {
					System.out.print("* ");
				}
				System.out.println("");
				trianguloRecursivo(b-1,a);
			}
		}
	}

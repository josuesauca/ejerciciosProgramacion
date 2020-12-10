/**
1^2/√1 - 2/√2 + 3^2/√3 - 4/√5 + 5^2/√7 - 6/11.....
**/
import java.util.Scanner;

public class serieTrabajo{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		double numerador =0;
		double denominador =0;
		int signo = 1;
		int limite = 0;
		System.out.print("\nIngrese un Limite : ");
		limite = scanner.nextInt();

		int i =1;
		int contador = 1;
		boolean esPrimo = false;
		double numeroPrimo = 1;
		double sumaTotal = 0;
		while(i<=limite){

			esPrimo = true;
			esPrimo = veficarPrimo(numeroPrimo,esPrimo);

			if(esPrimo == true){

				presentarSigno(signo);

				denominador = numeroPrimo;
				if(contador == 1){
					System.out.print(i+"*2/raiz("+denominador+")");
					numerador = Math.pow(i,2);
					
					contador = 0;

				}else{
					contador++;
					numerador = i;
					System.out.print(i+"/raiz("+denominador+")");

				}
				

				sumaTotal = sumaTotal + ( (numerador/Math.sqrt(denominador)) * signo); 

				signo = signo*-1;

				numeroPrimo++;
				i++;
			}else{
				numeroPrimo++;
			}
			//Maneras de Incrementar en uno
			/*i-=-1;
			++i;
			i+=1;
			i++;*/

		}
		System.out.println("\nLa suma Total es : "+sumaTotal);
	}	

	public static void presentarSigno(int signo){
		if(signo > 0){
			System.out.print(" + ");
		}else{
			System.out.print(" - ");
		}
	}

	public static boolean veficarPrimo(double numeroPrimo,boolean esPrimo){
		for (int j = 2; (j < numeroPrimo) && (esPrimo == true) ;j++) {
			if(numeroPrimo%j==0){
				esPrimo = false;
			}
		}
		return esPrimo;
	}

}
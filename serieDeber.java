import java.util.Scanner;

// import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class serieDeber{

	public static void main(String args[]){
		/* String acu = "";
		int n,i=0,j=0;
		n=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese tamaño de la matriz"));
		int matriz [][];
		matriz= new int[n][n];
		
		for(i=0; i<n;i++){
			for(j=0; j<n;j++){
				if(j==i){
					matriz[i][j]=1;
				}else{
					matriz[0][0]=1;
				}
				if(j==n-1){
					acu=""+acu+"     "+matriz [i][j]+"\n";
				}else{
					acu=""+acu+"     "+matriz [i][j];
				}
				}
			}JOptionPane.showMessageDialog(null,"Matriz identidad "+n+"x"+n+"\n"+"\n"+acu);	
		
		
		 */
		
		Scanner scanner = new Scanner(System.in);


		char repetirSerie;		

		do{

			double sumaTotal  = 0;
			//long start = System.nanoTime(); 

			mensajeInicial();
			System.out.print("\nIngrese un Limite : ");
			int limite = scanner.nextInt();
			sumaTotal =  sumaSerie(limite);
			System.out.println("\n\nLa Suma Total : "+ sumaTotal);

			// long end = System.nanoTime();
			// long exec = end - start;
			// double inSeconds = (double)exec / 1_000_000_000.0;
			// System.out.println("The program takes "+exec+" nanoseconds that is "+inSeconds+" seconds to execute.");    

			System.out.print("\n\nPulse (C) para cancelar el programa,pulse cualquier otra letra para seguir : ");
			repetirSerie = scanner.next().charAt(0);

		}while(repetirSerie != 'c' && repetirSerie != 'C');
		mensajeFinal();


	}
	
	public static void mensajeInicial(){

		System.out.println("\n\n---------------------------------------------------------------");
		System.out.println("\t\t\tBievenido!!!");
		System.out.println("---------------------------------------------------------------");

	}


	public static double sumaSerie(int limiteSerie){

		int contador = 1, numPrimo = 1, signo = 1;
		double numerador =1,denominador = 0,sumaTotal  = 0 ;
		boolean esPrimo;
		int i = 1 ;
		System.out.println();

		int a=1;

		while(i<=limiteSerie){

			esPrimo = true;
			esPrimo = verificarPrimo(esPrimo, numPrimo);

			if (esPrimo) {

				imprimirSigno(signo);

				if(contador==2){
					numerador = i * i;
					System.out.print(i+""+(char)178+""+((char)47)+"√"+numPrimo);
					contador = 0;

				}else{
					numerador = i;
					System.out.print(i+""+(char)47+"√"+""+numPrimo);

				}

				sumaTotal = sumaTotal+ (numerador / Math.sqrt(denominador) * signo);

				signo*=-1;
				contador++;
				numerador++;
				numPrimo++;	
				i++;

			}else{
				numPrimo++;
			} 
			//esPrimo = isPrime(a);
			//System.out.println(i+"  "+isPrime(i));

			/*if(esPrimo){

				if(signo>0){
					System.out.print(" + ");
				}

				if(contador==2){
					numerador = a* a;
					System.out.print(a+""+(char)178+""+((char)47)+"√"+denominador);
					contador = 0;

				}else{
					numerador = a;
					System.out.print(a+""+(char)47+"√"+""+denominador);

				}

				sumaTotal = sumaTotal+ (numerador / Math.sqrt(denominador) * signo);
				contador++;
				denominador++;
				numPrimo++;	
				
				i++;
			}
			a++;*/	
			
		}

		return sumaTotal;

	}

	public static boolean verificarPrimo(boolean esPrimo,int numPrimo){

		for(int j = 2;j<numPrimo && esPrimo;j++){
			esPrimo = !(numPrimo%j==0);
		}
		return esPrimo;
	}
	public static void imprimirSigno(int signo){
		if(signo>0){
			System.out.print(" + ");
		}else{
			System.out.print(" - ");
		}
	}

	public static boolean isPrime(int i){
        double maxDivisor;
        if(i==1){
            return false;
        }else{
            if(i==2){
                return true;
            }else{
                if(i%2==0&& i>2){
                    return false;
                }else{
                    
                    maxDivisor = Math.sqrt(i);
                    for(int j = 3;j<=1+maxDivisor;j+=2){
                        if(i%j==0){
                            return false;
                        }
                    }

                }
            }

        }
        return true;

	} 
	
	public static void mensajeFinal(){
		System.out.println("\nGracias Por Usar el Programa!!!");
		System.out.println("Programa Realizado por Josue Sauca");
		System.out.println("Segundo Ciclo Paralelo 'B' ");
		System.out.println("Vuelva Pronto!!!");

	}
}
/*AAAAAA
A    A
A    A
AAAAAA
BBBBBB
B    B
B    B
BBBBBB*/

import java.util.Scanner;

public class letras{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese filas : ");
		var filas =  scanner.nextInt();
		System.out.print("Ingrese columnas ");
		var columnas =  scanner.nextInt();
		System.out.print("Ingrese una letra : ");
		var letra =  scanner.next().charAt(0);

		for (char i = 'a';i<=letra;++i) {

			for (int j = 0;j<filas ;++j ) {

				if(j==0){
					System.out.print(i);
				}

				if(j==filas-1){
					System.out.print(i);

				}

				for (int k = 0;k<columnas;++k) {
					if(k==0){
						System.out.print(i);
					}
					if(k==columnas-1){
						System.out.print(i);
					}
					
				}

				System.out.println("");
				
			}
			
		}
	}
}
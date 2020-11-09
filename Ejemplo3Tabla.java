package es.Studium.Ejemplo3Tabla;

import java.util.Scanner;

public class Ejemplo3Tabla
{

	public static void main(String[] args)
	{
		final int TAM=5;
		int i;
		int tabla1 [] = new int[TAM];
		float tabla2 [] = new float[TAM];
		Scanner teclado=new Scanner(System.in);
		for (i=0;i<TAM;++i)
		{
			System.out.println("Dame un valor para tabla ["+i+"]");
			tabla1[i]=teclado.nextInt();
		}
		for (i=0;i<TAM;++i)
		{
			tabla2[i]=(float)tabla1[i]/(float)2;
		}
		for (i=0;i<TAM;++i)
		{
			
			System.out.println(tabla2[i]);
		}
	}

}

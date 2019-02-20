import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Saludo al cliente
		Scanner input = new Scanner(System.in);
		int opcion = 0;
		double r1 =0;
		double r2= 0;
		double r3 = 0;
		double resultado=0;
		System.out.println("/***********Bienvenido al programa***********/");
		System.out.println("Programador: Manuel Alejandro Ordoñez********/");
		System.out.println("Con este programa podrá realizar tareas generales");
		System.out.println("1) Cálculos básicos");
		System.out.println("2) Cálculos complejos");
		System.out.println("4) Promedio Arimético de 6 notas");
		System.out.println("Ingrese la opcion deseada");
		if(input.hasNextInt()) {
			opcion = input.nextInt();
		}
		else {
			System.out.println("Error, Dato incorrecto");
			System.exit(0);
		}


		if(opcion==1) {
			opcion=0;
			System.out.println("Haz escogido calculos básicos");
			System.out.println("1) Sumar dos números");
			System.out.println("2) Resta dos números");
			System.out.println("3) Mulplicación dos números");
			System.out.println("4) Division dos números");
			System.out.println("Ingrese la opcion");
			opcion=input.nextInt();
			if(opcion==1) {
				System.out.println("Inrese el primer valor");
				r1=input.nextDouble();
				System.out.println("Ingrese el segundo valor");
				r2=input.nextDouble();
				resultado=r1+r2;
				System.out.format("El resultado es: %.4f \n", resultado);
			}
			else if(opcion==2) {
				System.out.println("Inrese el primer valor");
				r1=input.nextDouble();
				System.out.println("Ingrese el segundo valor");
				r2=input.nextDouble();
				resultado=r1-r2;
				System.out.format("El resultado es: %.4f \n", resultado);
			}
			else if(opcion==3) {
				System.out.println("Inrese el primer valor");
				r1=input.nextDouble();
				System.out.println("Ingrese el segundo valor");
				r2=input.nextDouble();
				resultado=r1*r2;
				System.out.format("El resultado es: %.4f \n", resultado);
			}
			else if(opcion==4) {
				System.out.println("Inrese el primer valor");
				r1=input.nextDouble();
				System.out.println("Ingrese el segundo valor");
				r2=input.nextDouble();
				resultado=r1/r2;
				System.out.format("El resultado es: %.4f \n", resultado);
			}
			else {
				System.out.println("Error, opción incorrecta");
				System.exit(0);
			}
		}else if(opcion == 2) {
			//Codigo para la opcion 2 menú 1
			opcion=0;
			System.out.println("1) Calcular potencias");
			System.out.println("2) Calcular raices");
			System.out.println("Ingrese la opcion");
			opcion=input.nextInt();
			if(opcion==1) {
				System.out.println("Inrese el primer valor");
				r1=input.nextDouble();
				System.out.println("Ingrese el segundo valor");
				r2=input.nextDouble();
				resultado=Math.pow(r1, r2);
				System.out.format("El resultado es: %.4f \n", resultado);
			}
			else if(opcion == 2){
				System.out.println("Inrese el valor");
				r1=input.nextDouble();
				resultado=Math.sqrt(r1);
				System.out.format("El resultado es: %.4f \n", resultado);
			}
			else {
				System.out.println("Error, opcion incorrecta");
				System.exit(0);
			}
		}
		else if(opcion==4) {
			System.out.println("Ingrese las notas");
			System.out.println("Primer nota:");
			r1=input.nextDouble();
			System.out.println("Segunda nota:");
			r2= input.nextDouble();
			System.out.println("Tercera nota:");
			r3=input.nextDouble();
			resultado=Math.pow((r1*r2*r3), 1.0/3.0);
			System.out.format("El resultado es: %.4f \n", resultado);
			if(resultado>=0&&resultado<3) {
				System.out.println("Su desempeño es bajo");
			}
			else if(resultado>=3&&resultado<4) {
				System.out.println("Desempeño medio");
			}
			else if(resultado>=4&&resultado<=5) {
				System.out.println("Desempeño alto");
			}
		}
		else {
			System.out.println("Error, opción incorrecta");
			System.exit(0);
		}
		System.out.println("Gracias por usar el programa");
		System.exit(0);

	}

}

import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import java.util.*;

public class TareaIA extends Agent{
	protected void setup(){
		
		addBehaviour(new Tarea1());
		addBehaviour(new Tarea2());
		addBehaviour(new Tarea3());
		addBehaviour(new Tarea4());
		addBehaviour(new Tarea5());
		addBehaviour(new Tarea6());
	}
	protected void takeDown(){
		System.out.println("Finalizando el agente");
	}
	//primer comentario en jade
	private class Tarea1 extends Behaviour{
		String guid = getAID().getName();
	    // Obtener el nombre del agente
	    String nombre = getLocalName();
		      public void action() {
		        // Obtener la fecha actual
		        Date fechaActual = new Date();

		        // Realizar acciones con los datos del agente y la fecha actual
		        System.out.println("GUID del agente: " + guid);
		        System.out.println("Nombre del agente: " + nombre);
		        System.out.println("Fecha actual de ejecución: " + fechaActual);
		}
		public boolean done(){
			return true;
		}
	}
	private class Tarea2 extends Behaviour{
		public void  action(){
			System.out.println("------------------------------------------------------------------------------------------");
			 Scanner scanner = new Scanner(System.in);
		        boolean esPrimo = true;
		        for(int i=0;i<4;i++) {
		        System.out.println("Ingrese un número:");
		        int numero = scanner.nextInt();
		        if (numero <= 1) {
		            esPrimo = false;
		        } else {
		            for (int j = 2; j <= Math.sqrt(numero); j++) {
		                if (numero % j == 0) {
		                    esPrimo = false;
		                    break;
		                }
		            }
		        }
		        if (esPrimo) {
		            System.out.println("El número ingresado es primo.");
		        } else {
		            System.out.println("El número ingresado no es primo.");
		        }
		}   
		}
		public boolean done(){
			return true;
		}
	}
	private class Tarea3 extends Behaviour{
		public void  action(){
			Scanner scanner = new Scanner(System.in);
			System.out.println("------------------------------------------------------------------------------------------");
	        System.out.println("Ingrese un número:");
	           int numero = scanner.nextInt();
			    int numeroInvertido = 0;
		        int resto;
		        int numeroOriginal = numero;
		        while (numero > 0) {
		            resto = numero % 10;
		            numeroInvertido = numeroInvertido * 10 + resto;
		            numero = numero / 10;
		        }
		        if(numeroOriginal == numeroInvertido) {
		        	System.out.println(numeroOriginal+" es capicua");
		        }
		        else {
		        	System.out.println(numeroOriginal+" no  es capicua");
		        }
		}
	public boolean done(){
		return true;
	}
}
	private class Tarea4 extends Behaviour{
		public void  action(){
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.println("Ingrese el numero a generar");
			Scanner l = new Scanner(System.in);
			int n = l.nextInt();
			int cont=0, s =1,g=1;
			for(int i=0;i<n;i++) {
				if(cont<s) {
					System.out.print(g+" ");
					cont++;
				}
				else {
					if(g==0) {
						g=1;
						s=s+1;
						cont=0;
						i--;
					}
					else {
						g=0;
						s=s+1;
						cont=0;
						i--;
					}
				
				}
			}
			System.out.println();
		}
		public boolean done(){
			return true;
		}
	}
	
	private class Tarea5 extends Behaviour{
		public void  action(){
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.println("Ingrese el numero a generar");
			Scanner l = new Scanner(System.in);
			int n = l.nextInt();
			int cont=0, s =1;
			for(int i=0;i<n;i++) {
				if(cont<s) {
					System.out.print(s+" ");
					cont++;
				}
				else {
				s=s+1;
				cont=0;
				i--;
				}
			}
		}
		public boolean done(){
			return true;
		}
	}
	private class Tarea6 extends Behaviour{
		public void  action(){
			addBehaviour(new Tarea2());
			addBehaviour(new Tarea5());
		}
		public boolean done(){
			return true;
		}
	}
}

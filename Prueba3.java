import java.util.Scanner;

public class Prueba3 {

	public static void main(String[] args, Object While) {
		// TODO Auto-generated method stub
		
		System.out.print("Calculadora de Calculator S.A");

		Scanner entraDatos= new Scanner(System.in);
   boolean salir =false;
   
    	
    	float opcion= 0.0f;
    	float num1=0.0f;
    	float num2=0.0f;
    	float num3=0.0f;
    	float numeroInvertido= 0.0f;
    	float invertido=0.0f;
    	float resto=0.0f;
    	float resultado=0.0f;
    	
 
    	
    While= (!salir);
    
    System.out.println ("elige una opción: ");
    
    System.out.println("1.- suma");	
    System.out.println("2.- resta");
    System.out.println("3.- multiplicar");
    System.out.println("4.- dividir");
    System.out.println("5.- número mayor de tres números");
    System.out.println("6.- capicua");
    System.out.println("0.- salir");
    
    System.out.println("Introduce un número: ");
    
    Scanner am;
	opcion =am.nextFloat();
    
    
   System.out.println("esta es la opción 1");
   System.out.println ("introduzca un número: ");
   num1= entraDatos.nextFloat ();
   System.out.println("introduz un segundo número: ");
   num2=entraDatos.nextFloat ();
   resultado=num1+num2;
   System.out.println (" el resultado es: "+ resultado);
   break;
   
  
   System.out.println("esta es la opción 2");
   System.out.println ("introduzca un número: ");
   num1= entraDatos.nextFloat ();
   System.out.println("introduzca un segundo número: ");
   num2= entraDatos.nextFloat ();
   resultado=num1-num2;
   System.out.println ("el resultado es: " + resultado);
   break;
   
   
   System.out.println("esta es la opción 3");
   System.out.println ("introduzca un número: ");
   num1=entraDatos.nextFloat ();
   System.out.println("introduzca un segundo número: ");
   num2=entraDatos.nextFloat ();
   resultado=num1*num2;
   System.out.println (" el resultado es: " + resultado);
   break;
   
   
   System.out.println("esta es la opción 4");
   System.out.println ("introduzca un número: ");
   num1=entraDatos.nextFloat ();
   System.out.println("introduzca un segundo número: ");
   num2= entraDatos.nextFloat ();
   resultado=num1/num2;
   System.out.println (" el resultado es: " + resultado);
   break;
   
   
   System.out.println("esta es la opción 5");
   System.out.println ("introduzca un número: ");
   num1= entraDatos.nextFloat ();
   System.out.println("introduzca un segundo número: "); 
   num2= entraDatos.nextFloat ();
   System.out.println ("introduzca un tercer número:  ");
   num3= entraDatos.nextFloat ();
   if (num1> 1 && num1>5 && num1>15)
   
   System.out.println("esta es la opción 6");
   System.out.println ("introduzca un número  : ");
   numeroinvertido=entraDatos.nextFloat ();
  while (numeroinvertido >0)
	  resto=numero%10;
  invertido=invertido +10+ resto;
  numeroinvertido=10;
  
  System.out.println (" el resultado es: ");
   break;
   
   
   salir=true;
   break;

   
   
   default;
  
   System.out.println(" las opciones son entre 1 a 7");
   
   }
    
    
	}catch(InputMismatchExcepcion e) {
		System.out.println ("Debes un número");
		sn.next ();
		System.out.println ("Fin del menu");
    
    	
    }
        }		

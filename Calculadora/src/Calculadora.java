import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculadora {

    static float suma(float a, float b){
        return a+b;
    }
    static float resta(float a, float b){return a-b;}
    static float multiplicacion(float a, float b){return a*b;}
    static float division(float a, float b){return a/b;}

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float x,y;
    int option;
    do{
        System.out.println("Que desea hacer: \n1.Suma \n2.Resta \n3.Multiplicaion \n4.Division \n5.Salir");
        option = sc.nextInt();
        switch (option){
            case 1:
                System.out.println("Primer número: ");
                x = sc.nextFloat();
                System.out.println("Segundo número: ");
                y = sc.nextFloat();
                System.out.println("El resultado es: "+suma(x,y));
                break;
            case 2:
                System.out.println("Primer número: ");
                x = sc.nextFloat();
                System.out.println("Segundo número: ");
                y = sc.nextFloat();
                System.out.println("El resultado es: "+resta(x,y));
                break;
            case 3:
                System.out.println("Primer número: ");
                x = sc.nextFloat();
                System.out.println("Segundo número: ");
                y = sc.nextFloat();
                System.out.println("El resultado es: "+multiplicacion(x,y));
                break;
            case 4:
                System.out.println("Primer número: ");
                x = sc.nextFloat();
                System.out.println("Segundo número: ");
                y = sc.nextFloat();
                System.out.println("El resultado es: "+division(x,y));
                break;
            case 5:
                System.out.println("Vuleva pronto");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }while(option != 5);

    }
}


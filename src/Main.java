import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opciones;
        String name;

        do {
            String bienvenida = "Por favor ingresar el nombre de usuario deseado:" ;
            System.out.println(bienvenida);

            Scanner usuario = new Scanner(System.in);
            name = usuario.nextLine();
            System.out.println("-----Su nombre de usuario es " + name + " ¿Esta de acuerdo?-----");

            Scanner opcionUsuario = new Scanner(System.in);

            System.out.println("1. Si");
            System.out.println("2. No");
            System.out.println("3. Salir");

            System.out.println("-----Selecciona el numero de una de las opciones:-----");
            opciones = opcionUsuario.nextInt();



            switch(opciones){
                case 1:
                    System.out.println("-----Tu nombre de usuario a sido seleccionado------");
                    String mensajeUsuarioConfirmado = "Su nombre de usuario es: " + name;
                    System.out.println(mensajeUsuarioConfirmado);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Ha seleccionado una opcion incorrecta");
                    break;
            }
        }while(opciones == 2);

    }
}


/*1-
*
*
* */
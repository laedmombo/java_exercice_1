import java.util.Scanner;
public class Launcher {
    public static void main(String[] args){
        System.out.println(" Bienvenue dans le fichier Launcher ");
        try ( Scanner scanner = new Scanner( System.in ) ) {
            while( true ) {
                System.out.print( "Entrer une commande : " );
                String entrer = scanner.nextLine();
                if ( entrer.equals( "quit" ) ) {
                    break;
                }
                else {
                    System.out.println("Unknown command");
                }
                }
            }
        }
    }


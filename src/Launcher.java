import java.util.Scanner;
public class Launcher {
    public static void main(String[] args){
        System.out.println(" Bienvenue dans le fichier Launcher ");
        Scanner scanner = new Scanner( System.in );
        String entrer = scanner.nextLine();
        if(!entrer.equals( "quit" )){
            System.out.println("Unknown command");
        }
    }
}

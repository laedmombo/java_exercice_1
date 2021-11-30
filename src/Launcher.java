import java.util.Scanner;
public class Launcher {
    public static void main(String[] args){
        System.out.println(" Bienvenue dans le fichier Launcher ");
        try ( Scanner scanner = new Scanner( System.in ) ) {
            while( true ) {
                System.out.print( "Entrer une commande : " );
                String entrer = scanner.nextLine();
                if (entrer.equals("quit")) break;
                else if (entrer.equals("fibo")){
                    System.out.println("Entrer un entier n : ");
                    Integer nbr = scanner.nextInt();
                    System.out.println("La suite de Fibonacci d'ordre "+nbr+" vaut "+ Fib(nbr));
                    break;
                }
                else{
                        System.out.println("Unknown command");
                }
            }
            }
        }
        public static int Fib(int nbr)
        {
         if(nbr<=1) return nbr;
         else return Fib(nbr-1)+Fib(nbr-2);
         }

}


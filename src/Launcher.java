import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
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
                else if (entrer.equals("freq")){
                    System.out.println("Entrer le chemin du fichier à lire : ");
                    String path = scanner.nextLine();
                    Path filePath = Paths.get(path);
                    try
                    {
                        String content = Files.readString(filePath);
                        String result = content.replaceAll("\\p{Punct}", " ");
                        String[] TabResult = result.split(" ");
                        List<String> al = (ArrayList<String>)toArrayList(TabResult);
                        for (int i = 0; i < TabResult.length; i++) {
                            System.out.println(TabResult[i]);
                        }
                        //System.out.println(TabResult);
                    }
                    catch (IOException e)
                    {
                        System.err.println("Unreadable file: " + e.getClass() +"  "+ e.getCause());
                    }
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


import java.util.Scanner;

public class Main {
    

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String name;

    System.out.println("Escribe el nombre de tu personaje");
    name = sc.nextLine();
    Prota prota = new Prota(name, 100, 15, 0, 1, true, 10);


    }
}

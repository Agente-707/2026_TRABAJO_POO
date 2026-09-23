import java.util.Scanner;

public class PJS{

    String name;
    boolean state;
    
    public PJS(String name,boolean state){
        this.name = name;
        this.state = state;
    }

    String getName(){return name;}
    void setName(String name){this.name = name;}
    boolean getState() {return state;}

    /*Scanner sc = new Scanner(System.in);
    public void nombre(){
        System.out.println("Escribe el nombre de tu personaje");
        name = sc.nextLine();
        setName(name);
    }*/
        

}

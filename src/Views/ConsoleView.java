package Views;

import java.util.Scanner;
    

public class ConsoleView {
    Scanner scanner = new Scanner(System.in);
    public void displayMenu(){
        System.out.println("--- Menu de opciones ---");
        System.out.println("1.- Agregar contacto");
        System.out.println("2.- Buscar contacto");
        System.out.println("3.- Eliminar contacto");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                
                break;
        
            default:
                break;
        }
    }

    public String getInput(String prompts){
        System.out.print(prompts);
        String input = scanner.nextLine();
        return input;
    }

    public void ShowMessage(String message){
        System.out.println(message);
    }
}
 
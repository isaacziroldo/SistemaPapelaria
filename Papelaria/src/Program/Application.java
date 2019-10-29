
package Program;

import Pedido.Pedido;
import Produto.CaixaLapis;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Application {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        List <Pedido> cxLapis = new ArrayList<>();
        
        int menu = 0;
        
        do {
            System.out.println("======== MENU ========");
            System.out.println("1 --- Cadastrar Pedido " + 
                    "\n2 --- Consultar Pedido" + 
                    "\n3 --- Listar Pedidos"+ 
                    "\n4 --- Sair");
            menu = sc.nextInt();
            
            switch(menu){
                case 1:
                    
                    
                    
                    break;
                case 2:
                    
                    break;    
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                default: 
                    System.exit(0);
                    break;
            }
     
        } while (menu != 4);
        
    }
    
}

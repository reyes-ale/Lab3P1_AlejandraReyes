
package lab3p1_alejandrareyes;
import java.util.Scanner;
/**
 *
 * @author aleja
 */
public class Lab3P1_AlejandraReyes {
    
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        System.out.println(" ********** M E N U **********");
        System.out.println("1. Sucesiones y mas sucesiones");
        System.out.println("2. Pocket Monsters");
        System.out.println("3. Asterisco en casa");
        System.out.print("Ingrese una opcion:  ");
       // leer.next();
        int opcion=leer.nextInt();
        
        while (opcion>0 && opcion<4){
            switch (opcion){
                case 1: 
                    System.out.print("Diferencia: ");
                    int dif=leer.nextInt();
                    System.out.print("Inicial: ");
                    int ini=leer.nextInt();
                    System.out.print("Cantidad: ");
                    int cant=leer.nextInt();
                    int ini2=ini;
                    for (int i=0;i<=cant;i++){
                        if (i<cant){
                             System.out.print(ini + ",");
                        }
                        else{
                            System.out.print(ini);
                        }
                        ini=ini+(dif+(i));
                        
                    }
                    System.out.println();
                    System.out.print("Que numero desea ver mas adelante en la sucesion? ");
                    int suc=leer.nextInt();
                    for (int i=0;i<suc-1;i++){
                        ini2=ini2+(dif+(i));
                    }
                    System.out.println(ini2);
                    
                    break;
                    
                
                    
               /*case 2: 
                    System.out.print("Ingrese que modo de pelea pokemon desea: ");
                    System.out.println("1.- Hasta la muerte");
                    System.out.println("2.-Por rondas");
                    int modo=leer.nextInt();
                    
                    switch (modo){
                        case 1: 
                            System.out.println("Estadisticas de los pokemones");
                            System.out.println("Sylveon Vida: 280  Ataque:80  Defensa:15%");
                            System.out.println("Gyarados Vida: 300  Ataque:50  Defensa:10%");
                            System.out.println("Giratina Vida: 300  Ataque:70  Defensa:25%");
                            System.out.println("Dragonite Vida: 250  Ataque:75 Defensa:20%");
                            System.out.println();
                            
                            System.out.println("Ingrese una pelea determinada");
                            System.out.println("1.- Sylveon vrs Dragonite");
                            System.out.println("2.- Gyarados vrs Giratina");
                            System.out.println("3.- Dragonite vrs Giratina");
                            System.out.println("4.- Giratina vrs Sylveon");
                            System.out.println();
                            int pelea1=leer.nextInt();
                            
                            switch (pelea1){
                                case 1:
                                    double pok1=280;
                                    double pok2=250;
                                    for (pok1=280 && pok2=250;pok1,pok2==0;pokpok2){
                                        
                                    }
                                    System.out.println("-------------- Ronda 1 --------------");
                                    System.out.print("Vida de pokemon 1: " + pok1);
                                    System.out.print("Vida de pokemon 2: " + pok2);
                                    System.out.println();
                                    System.out.println("Pokemon 1 Ha atacado!");
                                    System.out.println("Pokemon 2 Ha atacado!");
                                    sout
                                    
                            }
                            
                            
                            break;
                            
                            
                    }
                    */
                    
                    
               case 3:
                   
                   System.out.print("Ingrese el numero de filas: ");
                    int num=leer.nextInt();      
                            if (num%2!=0 && num>7){
                                int col=num;
                                int fila=num;
                                for (int i=1;i<=fila;i++){
                                for(int j=1;j<=col;j++){
                                    if (i==1 || i==fila || j==1 || j==col){
                                   
                                        System.out.print("* ");
                                        
                                    }
                                    else{
                                        if (i==2 || i==fila || j==2 || j==col);
                                        System.out.print(" > ");
                                        System.out.println();
                                    }
                                }

                            }
                                System.out.println();
                                System.out.println();
                            }
                            else {
                                System.out.println("El num debe ser mayor a 7");
                            }
                            break;
                            
                    /*int fila=leer.nextInt();
                    int col=fila; 
                    while (fila%2!=0 && fila>7){
                        for (int i=1; i<=fila;i++){
                            for(int j=1;j<=col;j++){
                                if (i==1 || i==fila || j==1 || j==col){
                                   
                                        System.out.print("*");
                                        
                                    }
                                    
                                }
                        }
                        
                       fila=leer.nextInt();
                    }
                                  break;
                        
                        
                    }
                    System.out.println("Ingrese un nuevo numero");
                        
                              System.out.print("Ingrese el numero de columnas: ");
                              
                              }
                    
}                
              
                    
                    
                    
                    
                    /*for (int x=1;i)
                    if ()
                       System.out.print(inicial"");
                       ini=ini + dif;
                       
                           
                       }*/
                      
                               
                    
            
            
       /* System.out.println();
        System.out.println(" ********** M E N U **********");
        System.out.println("1. Sucesiones y mas sucesiones");
        System.out.println("2. Pocket Monsters");
        System.out.println("3. Asterisco en casa");
        System.out.print("Ingrese una opcion:  ");  
        }
        
    }*/
}
    }
}
}

    


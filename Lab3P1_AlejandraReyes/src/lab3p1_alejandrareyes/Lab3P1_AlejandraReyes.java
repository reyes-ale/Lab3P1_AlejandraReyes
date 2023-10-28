
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
        System.out.println("4. salir del programa");
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
                    
                    
                case 2: 
                    System.out.println("Ingrese que modo de pelea pokemon desea: ");
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
                                    double vidSy=280, defSy=0.15,atSy=80;
                                    double vidDra=250,  defDra=0.2, atDra=75;
                                    
                                    while (vidDra>0 || vidDra>0){
                                        for (int i=1;i<=4;i++){
                                            System.out.println("-------------- Round  "+ i + " --------------");
                                            System.out.println("Vida de pokemon 1: " + vidSy);
                                            System.out.println("Vida de pokemon 2: " + vidDra);
                                            System.out.println();
                                            System.out.println("Pokemon 1 Ha atacado!");
                                            System.out.println("Pokemon 2 Ha atacado!");
                                             vidSy=vidSy-(atDra*(1-defSy));
                                             vidDra=vidDra-(atSy*(1-defDra));
                                             if (vidSy<0){
                                                 vidSy=0;
                                             }
                                             else{
                                                 if(vidDra<0){
                                                     vidDra=0;
                                                     }
                                                }
                                        }
                           
                                            System.out.println("Vida de pokemon 1: " + vidSy);
                                            System.out.println("Vida de pokemon 2: " + vidDra);
                                    }
                                    
                                     System.out.println();
                                     System.out.println("******** Fin de la Batalla ********");
                                    if (vidSy>vidDra){
                                        System.out.println("Pokemon 1 Ha sido el ganador!");
                                    }
                                    else{
                                        System.out.println("Pokemon 2 Ha sido el ganador!");
                                    }
                                    break;
                                    
                                    
                                case 2:
                                    double vidGy=300, defGy=0.1, atGy=50;
                                    double vidGi=300, defGi=0.25, atGi=70;
                                   
                                    while (vidGy>0 || vidGi>0){
                                        for (int i=1;i<=4;i++){
                                            System.out.println("-------------- Round  "+ i + " --------------");
                                            System.out.println("Vida de pokemon 1: " + vidGy);
                                            System.out.println("Vida de pokemon 2: " + vidGi);
                                            System.out.println();
                                            System.out.println("Pokemon 1 Ha atacado!");
                                            System.out.println("Pokemon 2 Ha atacado!");
                                             vidGy=vidGy-(atGi*(1-defGy));
                                             vidGi=vidGi-(atGy*(1-defGi));
                                             if (vidGy<0)
                                                 vidGy=0;
                                             else{
                                                 if(vidGi<0)
                                                     vidGi=0;
                                             }
                                            System.out.println("Vida de pokemon 1: " + vidGy);
                                            System.out.println("Vida de pokemon 2: " + vidGi);
                                        }
                                    }
                                     System.out.println();
                                     System.out.println("******** Fin de la Batalla ********");
                                    if (vidGy>vidGi){
                                        System.out.println("Pokemon 1 Ha sido el ganador!");
                                    }
                                    else{
                                        System.out.println("Pokemon 2 Ha sido el ganador!");
                                    }
                                    break;
                                    
                               case 3:
                                    vidDra=250;
                                    defDra=0.1;
                                    atDra=50;
                                    vidGi=300;
                                    defGi=0.25;
                                    atGi=70;
                                    
                                    while (vidDra>0 || vidGi>0){
                                        for (int i=1;i<=4;i++){
                                            System.out.println("-------------- Round  "+ i + " --------------");
                                            System.out.println("Vida de pokemon 1: " + vidDra);
                                            System.out.println("Vida de pokemon 2: " + vidGi);
                                            System.out.println();
                                            System.out.println("Pokemon 1 Ha atacado!");
                                            System.out.println("Pokemon 2 Ha atacado!");
                                             vidDra=vidDra-(atGi*(1-defDra));
                                             vidGi=vidGi-(atDra*(1-defGi));
                                             if (vidDra<0)
                                                 vidDra=0;
                                             else{
                                                 if(vidGi<0)
                                                     vidGi=0;
                                             }
                                            System.out.println("Vida de pokemon 1: " + vidDra);
                                            System.out.println("Vida de pokemon 2: " + vidGi);
                                        }
                                    }
                                     System.out.println();
                                     System.out.println("******** Fin de la Batalla ********");
                                    if (vidDra>vidGi){
                                        System.out.println("Pokemon 1 Ha sido el ganador!");
                                    }
                                    else{
                                        System.out.println("Pokemon 2 Ha sido el ganador!");
                                    }
                                    break;
                            
                               case 4: 
                                    vidGi=300;
                                    defGi=0.25;
                                    atGi=70;    
                                    vidSy=280;
                                    defSy=0.15; 
                                    atSy=80;

                                         while (vidGi>0 || vidSy>0){
                                             for (int i=1;i<=4;i++){
                                                 System.out.println("-------------- Round  "+ i + " --------------");
                                                 System.out.println("Vida de pokemon 1: " + vidGi);
                                                 System.out.println("Vida de pokemon 2: " + vidSy);
                                                 System.out.println();
                                                 System.out.println("Pokemon 1 Ha atacado!");
                                                 System.out.println("Pokemon 2 Ha atacado!");
                                                  vidGi=vidGi-(atSy*(1-defGi));
                                                  vidSy=vidSy-(atGi*(1-defSy));
                                                  if (vidGi<0)
                                                      vidGi=0;
                                                  else{
                                                      if(vidSy<0)
                                                          vidSy=0;
                                                  }
                                                 System.out.println("Vida de pokemon 1: " + vidGi);
                                                 System.out.println("Vida de pokemon 2: " + vidSy);
                                             }
                                         }
                                          System.out.println();
                                          System.out.println("******** Fin de la Batalla ********");
                                         if (vidGi>vidSy){
                                             System.out.println("Pokemon 1 Ha sido el ganador!");
                                         }
                                         else{
                                             System.out.println("Pokemon 2 Ha sido el ganador!");
                                         }
                                         break;
                            }
                            
                       case 2: 
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
                            int pelea2=leer.nextInt();
                            
                            
                            System.out.print("Ingrese la cantidad de rondas que desea: ");
                            int rond=leer.nextInt();
                            if (rond>10){
                                System.out.println("El numero de rondas debe de ser menor a 10");
                            }
                             else{
                                switch (pelea2){
                                case 1:
                                    double vidSy=280, defSy=0.15,atSy=80;
                                    double vidDra=250,  defDra=0.2, atDra=75;
                                    
                                        for (int i=1;i<=rond;i++){
                                            System.out.println("-------------- Round  "+ i + " --------------");
                                            System.out.println("Vida de pokemon 1: " + vidSy);
                                            System.out.println("Vida de pokemon 2: " + vidDra);
                                            System.out.println();
                                            System.out.println("Pokemon 1 Ha atacado!");
                                            System.out.println("Pokemon 2 Ha atacado!");
                                             vidSy=vidSy-(atDra*(1-defSy));
                                             vidDra=vidDra-(atSy*(1-defDra));
                                             if (vidSy<0){
                                                 vidSy=0;
                                             }
                                             else{
                                                 if(vidDra<0){
                                                     vidDra=0;
                                                     }
                                                }
                                             }
                                             
                                        
                                            System.out.println("Vida de pokemon 1: " + vidSy);
                                            System.out.println("Vida de pokemon 2: " + vidDra);
                                            
                                               
                                            
                                    
                                    
                                     System.out.println();
                                     System.out.println("******** Fin de la Batalla ********");
                                    if (vidSy>vidDra){
                                        System.out.println("Pokemon 1 Ha sido el ganador!");
                                    }
                                    else{
                                        if(vidSy<0 || vidDra<0){
                                            System.out.println("No se pudo llegar a la ronda deseada");
                                        }
                                        else{
                                        System.out.println("Pokemon 2 Ha sido el ganador!");
                                    }
                                    }
                                    break;
                                    
                                case 2:
                                    double vidGy=300, defGy=0.1, atGy=50;
                                    double vidGi=300, defGi=0.25, atGi=70;
                                    
                                        for (int i=1;i<=rond;i++){
                                            System.out.println("-------------- Round  "+ i + " --------------");
                                            System.out.println("Vida de pokemon 1: " + vidGy);
                                            System.out.println("Vida de pokemon 2: " + vidGi);
                                            System.out.println();
                                            System.out.println("Pokemon 1 Ha atacado!");
                                            System.out.println("Pokemon 2 Ha atacado!");
                                             vidGy=vidGy-(atGi*(1-defGy));
                                             vidGi=vidGi-(atGy*(1-defGi));
                                             if (vidGy<0)
                                                 vidGy=0;
                                             else{
                                                 if(vidGi<0)
                                                     vidGi=0;
                                             }
                                            System.out.println("Vida de pokemon 1: " + vidGy);
                                            System.out.println("Vida de pokemon 2: " + vidGi);
                                        }
                                        
                                     System.out.println();
                                     System.out.println("******** Fin de la Batalla ********");
                                    if (vidGy>vidGi){
                                        System.out.println("Pokemon 1 Ha sido el ganador!");
                                    }
                                    else{
                                        System.out.println("Pokemon 2 Ha sido el ganador!");
                                    }
                                    break;
                                    
                           case 3:
                                    vidDra=250;
                                    defDra=0.1;
                                    atDra=50;
                                    vidGi=300;
                                    defGi=0.25;
                                    atGi=70;
                                    
                                        for (int i=1;i<=rond;i++){
                                                System.out.println("-------------- Round  "+ i + " --------------");
                                                System.out.println("Vida de pokemon 1: " + vidDra);
                                                System.out.println("Vida de pokemon 2: " + vidGi);
                                                System.out.println();
                                                System.out.println("Pokemon 1 Ha atacado!");
                                                System.out.println("Pokemon 2 Ha atacado!");
                                                 vidDra=vidDra-(atGi*(1-defDra));
                                                 vidGi=vidGi-(atDra*(1-defGi));
                                                 if (vidDra<0)
                                                     vidDra=0;
                                                 else{
                                                     if(vidGi<0)
                                                         vidGi=0;
                                                 }
                                                System.out.println("Vida de pokemon 1: " + vidDra);
                                                System.out.println("Vida de pokemon 2: " + vidGi);
                                       }
                                    
                                     System.out.println();
                                     System.out.println("******** Fin de la Batalla ********");
                                    if (vidDra>vidGi){
                                        System.out.println("Pokemon 1 Ha sido el ganador!");
                                    }
                                    else{
                                        System.out.println("Pokemon 2 Ha sido el ganador!");
                                    }
                                    break;
                            
                           case 4: 
                               vidGi=300;
                               defGi=0.25;
                               atGi=70;    
                               vidSy=280;
                               defSy=0.15; 
                               atSy=80;
                                    
                                        for (int i=1;i<=rond;i++){
                                            System.out.println("-------------- Round  "+ i + " --------------");
                                            System.out.println("Vida de pokemon 1: " + vidGi);
                                            System.out.println("Vida de pokemon 2: " + vidSy);
                                            System.out.println();
                                            System.out.println("Pokemon 1 Ha atacado!");
                                            System.out.println("Pokemon 2 Ha atacado!");
                                             vidGi=vidGi-(atSy*(1-defGi));
                                             vidSy=vidSy-(atGi*(1-defSy));
                                             if (vidGi<0)
                                                 vidGi=0;
                                             else{
                                                 if(vidSy<0)
                                                     vidSy=0;
                                             }
                                            System.out.println("Vida de pokemon 1: " + vidGi);
                                            System.out.println("Vida de pokemon 2: " + vidSy);
                                        }
                                    
                                     System.out.println();
                                     System.out.println("******** Fin de la Batalla ********");
                                    if (vidGi>vidSy){
                                        System.out.println("Pokemon 1 Ha sido el ganador!");
                                    }
                                    else{
                                        System.out.println("Pokemon 2 Ha sido el ganador!");
                                    }
                                    break;
                                
                            }
                       }
                    }
                                
                                
               case 3:
                   System.out.print("Ingrese un numero impar y mayor que 7: ");
                    int num=leer.nextInt();      
                            if (num%2!=0 && num>7){
                                int col=num;
                                int fila=num;
                                
                                        
                                for (int i=1;i<=fila;i++){
                                    for(int j=1;j<=col;j++){
                                        if (i==1 || i==fila || j==1 || j==col){

                                            System.out.print("* ");

                                        }
                                        else {
                                            if(i==j || j==num-1){
                                                System.out.print(" > ");

                                            } else if (j==col/2+1){
                                                System.out.print("|");
                                            }

                                            System.out.print("   ");
                                        }

                                    }
                                    System.out.println();
                                }
                            }
                             
                            break;
            }
        System.out.println();
        System.out.println(" ********** M E N U **********");
        System.out.println("1. Sucesiones y mas sucesiones");
        System.out.println("2. Pocket Monsters");
        System.out.println("3. Asterisco en casa");
        System.out.println("4. salir del programa");
        System.out.print("Ingrese una opcion:  ");
        opcion=leer.nextInt();
        
       }
   }
}
    
                    
    

        
    

            




    




    


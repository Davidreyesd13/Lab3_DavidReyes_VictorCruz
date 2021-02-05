package lab3_davidreyes_victorcruz;
import java.util.Scanner;
import java.util.ArrayList;

public class Lab3_DavidReyes_VictorCruz {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList lista = new ArrayList();
        int opcion,opc;
        char resp='s';
        while (resp=='s'||resp == 'S') {
            System.out.println("0.Salir\n1.Crear\n2.\n3.");
            opcion= leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("1.Crear\n2.Listar\n3.Modificar\n4.Eliminar");
                    opc = leer.nextInt();
                    switch (opc) {
                        case 1:
                            
                            lista.add(new ArrayList());
                            break;
                        case 2:
                            for (Object o : lista) {
                                System.out.println(lista.indexOf(o)+"-"+o+"\n");
                            }
                            break;
                        case 3:
                            
                            break;
                        case 4:
                            for (Object o: lista) {
                                System.out.println(lista.indexOf(o)+"-"+o+"\n"); 
                            }
                            System.out.println("Que numero desea Eliminar");
                            int ne = leer.nextInt();
                            lista.remove(ne);
                            break;
                        default:
                            System.out.println("opcion no valida");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println("Desea continuar s/n");
            resp = leer.next().charAt(0);
        }
    }
    
}

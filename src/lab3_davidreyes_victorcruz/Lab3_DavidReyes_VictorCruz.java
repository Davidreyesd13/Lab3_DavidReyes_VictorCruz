package lab3_davidreyes_victorcruz;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab3_DavidReyes_VictorCruz {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList coop = new ArrayList(), marca = new ArrayList(), Modelos = new ArrayList(), Fabricas = new ArrayList(), Div_tec = new ArrayList(), general = new ArrayList();
        int opcion, opc;
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println("0.Salir\n1.coorporaciones\n2.Marcas\n3.Modelos\n4.Fabricas\n5. Divisiones tecnologicas\n6. Listar");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("1.Crear\n2.Listar\n3.Modificar\n4.Eliminar");
                    opc = leer.nextInt();
                    switch (opc) {
                        case 1:
                            System.out.println("Ingrese el nombre de la coorporacion");
                            leer.nextLine();
                            String nombre= leer.nextLine();
                            System.out.println("Ingrese el nombre de la sede");
                            String sede= leer.nextLine();
                            System.out.println("Ingrese el año que se creo");
                            int año = leer.nextInt();
                            System.out.println("Ingrese el nombre del ceo / presidente");
                            String np=leer.nextLine();
                            System.out.println("Cantidad de empleados");
                            int cantEmp =leer.nextInt();
                            System.out.println("Cantidad de autos en el inventario");
                            int cantc = leer.nextInt();
                            coop.add(new coorporaciones(nombre, sede, año, np, año, cantc, marca));
                            break;
                        case 2:
                            for (Object o : coop) {
                                System.out.println(coop.indexOf(o) + "-" + o + "\n");
                            }
                            break;
                        case 3:
                            
                            break;
                        case 4:
                            for (Object o : coop) {
                                System.out.println(coop.indexOf(o) + "-" + o + "\n");
                            }
                            System.out.println("Que numero desea Eliminar");
                            int ne = leer.nextInt();
                            coop.remove(ne);
                            break;
                        default:
                            System.out.println("opcion no valida");
                    }
                    break;
                case 2:
                    System.out.println("1.Crear\n2.Listar\n3.Modificar\n4.Eliminar");
                    opc = leer.nextInt();
                    switch (opc) {
                        case 1:
                            System.out.println("Ingrese el nombre de la marca");
                            leer.nextLine();
                            String nombre= leer.nextLine();
                            System.out.println("Ingrese el lema");
                            String lema = leer.nextLine();
                            System.out.println("Ingrese el nombre de la sede");
                            String sede= leer.nextLine();
                            System.out.println("Ingrese el nombre de la fundacion");
                            String fundacion = leer.nextLine();
                            System.out.println("Ingrese el año que se integro");
                            int año = leer.nextInt();
                            System.out.println("Ingrese el nombre del fundador");
                            String fundador = leer.nextLine();
                            System.out.println("Ingrese el total de ventas");
                            double total = leer.nextInt();
                            System.out.println("Ingrese el nombre del ceo / presidente");
                            String ceo=leer.nextLine();
                            System.out.println("Cantidad de modelos");
                            int cantMo =leer.nextInt();
                            marca.add(new Marcas((new marcas_autos(nombre, lema, fundacion, opcion, fundador, total, ceo, opcion))));
                            break;
                        case 2:
                            for (Object o : marca) {
                                System.out.println(marca.indexOf(o) + "-" + o + "\n");
                            }
                            break;
                        case 3:

                            break;
                        case 4:
                            for (Object o : marca) {
                                System.out.println(marca.indexOf(o) + "-" + o + "\n");
                            }
                            System.out.println("Que numero desea Eliminar");
                            int ne = leer.nextInt();
                            marca.remove(ne);
                            break;
                        default:
                            System.out.println("opcion no valida");
                    }
                    break;
                case 3:
                    System.out.println("1.Crear\n2.Listar\n3.Modificar\n4.Eliminar");
                    opc = leer.nextInt();
                    switch (opc) {
                        case 1:
                            System.out.println("Ingrese el nombre de la coorporacion");
                            Modelos.add(new ArrayList());
                            break;
                        case 2:
                            for (Object o : Modelos) {
                                System.out.println(Modelos.indexOf(o) + "-" + o + "\n");
                            }
                            break;
                        case 3:

                            break;
                        case 4:
                            for (Object o : Modelos) {
                                System.out.println(Modelos.indexOf(o) + "-" + o + "\n");
                            }
                            System.out.println("Que numero desea Eliminar");
                            int ne = leer.nextInt();
                            Modelos.remove(ne);
                            break;
                        default:
                            System.out.println("opcion no valida");
                    }
                    break;
                case 4:
                    System.out.println("1.Crear\n2.Listar\n3.Modificar\n4.Eliminar");
                    opc = leer.nextInt();
                    switch (opc) {
                        case 1:
                            System.out.println("Ingrese el nombre de la coorporacion");
                            Fabricas.add(new ArrayList());
                            break;
                        case 2:
                            for (Object o : Fabricas) {
                                System.out.println(Fabricas.indexOf(o) + "-" + o + "\n");
                            }
                            break;
                        case 3:

                            break;
                        case 4:
                            for (Object o : Fabricas) {
                                System.out.println(Fabricas.indexOf(o) + "-" + o + "\n");
                            }
                            System.out.println("Que numero desea Eliminar");
                            int ne = leer.nextInt();
                            Fabricas.remove(ne);
                            break;
                        default:
                            System.out.println("opcion no valida");
                    }
                    break;
                case 5:
                    System.out.println("1.Crear\n2.Listar\n3.Modificar\n4.Eliminar");
                    opc = leer.nextInt();
                    switch (opc) {
                        case 1:
                            System.out.println("Ingrese el nombre de la coorporacion");
                            Div_tec.add(new ArrayList());
                            break;
                        case 2:
                            for (Object o : Div_tec) {
                                System.out.println(Div_tec.indexOf(o) + "-" + o + "\n");
                            }
                            break;
                        case 3:

                            break;
                        case 4:
                            for (Object o : Div_tec) {
                                System.out.println(Div_tec.indexOf(o) + "-" + o + "\n");
                            }
                            System.out.println("Que numero desea Eliminar");
                            int ne = leer.nextInt();
                            Div_tec.remove(ne);
                            break;
                        default:
                            System.out.println("opcion no valida");
                    }
                    break;
                case 6:
                    for (Object o : general) {
                        System.out.println(general.indexOf(o)+"-"+o+"\n");
                    }
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

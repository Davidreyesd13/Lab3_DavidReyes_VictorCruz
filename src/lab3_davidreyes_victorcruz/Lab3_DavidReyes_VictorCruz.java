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
                            String nombre = leer.nextLine();
                            System.out.println("Ingrese el nombre de la sede");
                            String sede = leer.nextLine();
                            System.out.println("Ingrese el año que se creo");
                            int año = leer.nextInt();
                            System.out.println("Ingrese el nombre del ceo / presidente");
                            leer.nextLine();
                            String np = leer.nextLine();
                            System.out.println("Cantidad de empleados");
                            int cantEmp = leer.nextInt();
                            System.out.println("Cantidad de autos en el inventario");
                            int cantc = leer.nextInt();
                                System.out.println("Ingrese el nombre de la marca");
                                leer.nextLine();
                                nombre = leer.nextLine();
                                System.out.println("Ingrese el lema");
                                String lema = leer.nextLine();
                                System.out.println("Ingrese el nombre de la fundacion");
                                String fundacion = leer.nextLine();
                                System.out.println("Ingrese el año que se integro");
                                año = leer.nextInt();
                                System.out.println("Ingrese el nombre del fundador");
                                String fundador = leer.nextLine();
                                System.out.println("Ingrese el total de ventas");
                                double total = leer.nextInt();
                                System.out.println("Ingrese el nombre del ceo / presidente");
                                leer.nextLine();
                                String ceo = leer.nextLine();
                                System.out.println("Cantidad de modelos");
                                int cantMo = leer.nextInt();
                                System.out.println("tipo de marca\n1.Premium\n2.Generalista");
                                int op2 = leer.nextInt();
                                String tipomarca;
                                ArrayList<marcas_autos> mar = new ArrayList();
                                switch (op2) {
                                    case 1:
                                        tipomarca = "Premium";
                                        mar.add(new marcas_autos(nombre, lema, fundacion, año, fundador, total, ceo, cantMo,tipomarca));
                                        marca.add(new Marcas(mar));
                                        general.add(marca);
                                        break;
                                    case 2:
                                        tipomarca = "Generlista";
                                       mar.add(new marcas_autos(nombre, lema, fundacion, año, fundador, total, ceo, cantMo,tipomarca));
                                        marca.add(new Marcas(mar));
                                        general.add(marca);
                                        break;
                                    default:
                                        System.out.println("Opcion no valida");
                                }
                            coop.add(new coorporaciones(nombre, sede, año, ceo, año, año, marca));
                            general.add(coop);
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
                    if (coop.isEmpty()) {
                        System.out.println("Nel perron");
                    } else {
                        System.out.println("1.Crear\n2.Listar\n3.Modificar\n4.Eliminar");
                        opc = leer.nextInt();
                        switch (opc) {
                            case 1:
                                System.out.println("Ingrese el nombre de la marca");
                                leer.nextLine();
                                String nombre = leer.nextLine();
                                System.out.println("Ingrese el lema");
                                String lema = leer.nextLine();
                                System.out.println("Ingrese el nombre de la fundacion");
                                String fundacion = leer.nextLine();
                                System.out.println("Ingrese el año que se integro");
                                int año = leer.nextInt();
                                System.out.println("Ingrese el nombre del fundador");
                                String fundador = leer.nextLine();
                                System.out.println("Ingrese el total de ventas");
                                double total = leer.nextInt();
                                System.out.println("Ingrese el nombre del ceo / presidente");
                                leer.nextLine();
                                String ceo = leer.nextLine();
                                System.out.println("Cantidad de modelos");
                                int cantMo = leer.nextInt();
                                System.out.println("tipo de marca\n1.Premium\n2.Generalista");
                                int op2 = leer.nextInt();
                                String tipomarca;
                                ArrayList<marcas_autos> mar = new ArrayList();
                                switch (op2) {
                                    case 1:
                                        tipomarca = "Premium";
                                        mar.add(new marcas_autos(nombre, lema, fundacion, año, fundador, total, ceo, cantMo,tipomarca));
                                        marca.add(new Marcas(mar));
                                        general.add(marca);
                                        break;
                                    case 2:
                                        tipomarca = "Generlista";
                                       mar.add(new marcas_autos(nombre, lema, fundacion, año, fundador, total, ceo, cantMo,tipomarca));
                                        marca.add(new Marcas(mar));
                                        general.add(marca);
                                        break;
                                    default:
                                        System.out.println("Opcion no valida");
                                }
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
                    }
                    break;
                case 3:
                    if (marca.isEmpty() && coop.isEmpty()) {
                        System.out.println("nel papu por ahi");
                    } else {
                        System.out.println("1.Crear\n2.Listar\n3.Modificar\n4.Eliminar");
                        opc = leer.nextInt();
                        switch (opc) {
                            case 1:
                                System.out.println("Ingrese el nombre del modelo");
                                leer.nextLine();
                                System.out.println("Ingrese el año que se creo");
                                int año = leer.nextInt();
                                String nombrem = leer.nextLine();
                                System.out.println("Ingrese el tipo de motor");
                                String motor = leer.nextLine();
                                System.out.println("Ingrese el cilidraje");
                                String np = leer.nextLine();
                                System.out.println("Cantidad de empleados");
                                int cantEmp = leer.nextInt();
                                System.out.println("Ingrese el precio del modelo");
                                double total = leer.nextInt();
                                System.out.println("Tiene tecnologia");
                                String tec = leer.next();
                                tec = tec.toLowerCase();
                                boolean respuesta;
                                if (tec.equals("si")) {
                                    respuesta = true;
                                } else {
                                    respuesta = false;
                                }
                                System.out.println("");
                                Modelos.add(new Modelos(nombrem, año, motor, motor, total, respuesta));
                                general.add(Modelos);
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
                    }
                    break;
                case 4:
                    System.out.println("1.Crear\n2.Listar\n3.Modificar\n4.Eliminar");
                    opc = leer.nextInt();
                    switch (opc) {
                        case 1:
                            System.out.println("Ingrese el nombre de la fabrica");
                            leer.nextLine();
                            String nombre = leer.nextLine();
                            System.out.println("Ingrese la ubicacion");
                            String ubi = leer.nextLine();
                            System.out.println("Ingrese la cantidad maxima modelos a fabricar");
                            int cantMax = leer.nextInt();
                            System.out.println("Cual es modelo que mas se fabrica\n1.Hatchback\n2.SUV\n3.Sedan");
                            int op3 = leer.nextInt();
                            String tipocar = "";
                            switch (op3) {
                                case 1:
                                    tipocar = "Hatchback";
                                    break;
                                case 2:
                                    tipocar = "SUV";
                                    break;
                                case 3:
                                    tipocar = "Sedan";
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                            }//fin del switch
                            System.out.println("ingrese la cantidad de empleados");
                            int cantempleados = leer.nextInt();
                            System.out.println("Ingrese la cantidad de autos fabricados actualmente");
                            int cantcar = leer.nextInt();
                            Fabricas.add(new fabricas(nombre, ubi, cantMax, tipocar, cantempleados, marca, cantcar));
                            general.add(Fabricas);
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
                            System.out.println("Ingrese nombre de la division tecnologica");
                            leer.nextLine();
                            String nombre = leer.nextLine();
                            System.out.println("Año de creacion");
                            int acrecion = leer.nextInt();
                            System.out.println("Ingrese el campo que se dedica");
                            leer.nextLine();
                            String campo = leer.nextLine();
                            ArrayList<String> prototipos = new ArrayList();
                            boolean s = true;
                            char resp3 = 's';
                            while (s == true) {
                                System.out.println("Ingrese las tecnologias creadas");
                                String nombrept = leer.nextLine();
                                prototipos.add(nombrept);
                                System.out.println("Desea Continuar?[s/n]");
                                resp3 = leer.next().charAt(0);
                                if (resp3 == 's') {
                                    s = true;
                                } else {
                                    s = false;
                                }//fin  del if
                            }//fin del whileres
                            if (!marca.isEmpty()) {
                            for (Object o : marca) {
                                System.out.println(marca.indexOf(o) + "-" + o + "\n");
                            }
                            System.out.println("Ingrese el numero que desea ver si es premium o generalista");
                            int numtm = leer.nextInt();
                            if(numtm ==1){
                                System.out.println("Su precio aumenta un 20%");
                            }else{
                                System.out.println("Su precio aumenta un 15%");
                            }
                            }
                            Div_tec.add(new mat_tec(nombre, acrecion, campo, prototipos));
                            general.add(Div_tec);
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
                        System.out.println(general.indexOf(o) + "-" + o + "\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        System.out.println("Desea continuar s/n");
        resp = leer.next().charAt(0);
    }
}

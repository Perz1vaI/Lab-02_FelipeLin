package lab.pkg02_felipelin;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author felipelinzhao
 */
public class Lab02_FelipeLin {

    public static void main(String[] args) {
        ArrayList<Casas> Lista = new ArrayList();
        ArrayList<Casas> Construccion = new ArrayList();
        ArrayList<Casas> Espera = new ArrayList();
        ArrayList<Casas> Demolicion = new ArrayList();
        Scanner leer = new Scanner(System.in);
        String usuario = "leobanegas";
        String contra = "99";

        System.out.print("Ingrese el usuario: ");
        String user = leer.nextLine();

        System.out.print("Ingrese la contraseña: ");
        String pass = leer.nextLine();

        if (user.equals(usuario) && pass.equals(contra)) {
            int menu;
            System.out.println("1. Registro de clases\n2. Manejo de Estados\n3. Salir");
            menu = leer.nextInt();
            while (menu != 3) {
                switch (menu) {
                    case 1: {

                        int menu2;
                        System.out.println("1. Crear Casas\n2. Listar Casas\n3. Modificar Casas\n4. Borrar Casas");
                        menu2 = leer.nextInt();

                        switch (menu2) {
                            case 1: {
                                System.out.print("Ingrese el numero de la casa: ");
                                int Ncasa = leer.nextInt();
                                while (Ncasa < 0) {
                                    System.out.println("No se aceptan numeros negativos");
                                    System.out.print("Ingrese el numero de la casa: ");
                                    Ncasa = leer.nextInt();
                                }

                                System.out.print("Ingrese el numero del bloque: ");
                                int NBloque = leer.nextInt();
                                while (NBloque < 0) {
                                    System.out.println("No se aceptan numeros negativos");
                                    System.out.print("Ingrese el numero del bloque: ");
                                    NBloque = leer.nextInt();
                                }

                                System.out.print("Ingrese el color: ");
                                leer.nextLine();
                                String Color = leer.nextLine();

                                System.out.print("Ingrese el ancho de la casa: ");
                                int ancho = leer.nextInt();
                                while (ancho < 0) {
                                    System.out.println("No se aceptan numeros negativos");
                                    System.out.print("Ingrese el ancho de la casa: ");
                                    ancho = leer.nextInt();
                                }

                                System.out.print("Ingrese el largo de la casa: ");
                                int largo = leer.nextInt();
                                while (largo < 0) {
                                    System.out.println("No se aceptan numeros negativos");
                                    System.out.print("Ingrese el largo de la casa: ");
                                    largo = leer.nextInt();
                                }

                                System.out.println("Ingrese si fue comprado o no");
                                System.out.println("1. Si fue comprado\n2. No fue comprado");
                                int comprado = leer.nextInt();
                                while (comprado != 1 && comprado != 2) {
                                    System.out.println("No existe esa opcion");
                                    System.out.println("1. Si fue comprado\n2. No fue comprado");
                                    comprado = leer.nextInt();
                                }

                                System.out.print("Ingrese el numero de pisos: ");
                                int pisos = leer.nextInt();
                                while (pisos < 0) {
                                    System.out.println("No se aceptan numeros negativos");
                                    System.out.print("Ingrese el numero de pisos: ");
                                    pisos = leer.nextInt();
                                }

                                System.out.print("Ingrese el numero de baños: ");
                                int banos = leer.nextInt();
                                while (banos < 0) {
                                    System.out.println("No se aceptan numeros negativos");
                                    System.out.print("Ingrese el numero de baños: ");
                                    banos = leer.nextInt();
                                }

                                System.out.print("Ingrese el numero de cuartos: ");
                                int cuartos = leer.nextInt();
                                while (cuartos < 0) {
                                    System.out.println("No se aceptan numeros negativos");
                                    System.out.print("Ingrese el numero de cuartos: ");
                                    cuartos = leer.nextInt();
                                }

                                String landlord = "";
                                if (comprado == 1) {
                                    System.out.print("Ingrese el nombre del dueño: ");
                                    leer.nextLine();
                                    landlord = leer.nextLine();
                                }

                                System.out.println("Ingrese el estado de la casa");
                                System.out.println("\n1. Lista\n2. En construccion \n3. Construccion en espera\n4. Espera de Demolicion");
                                int estado = leer.nextInt();
                                while (estado != 1 && estado != 2 && estado != 3 && estado != 4) {
                                    System.out.println("No esta eso en el menu");
                                    System.out.println("\n1. Lista\n2. En construccion \n3. Construccion en espera\n4. Espera de Demolicion");
                                    estado = leer.nextInt();

                                }

                                System.out.print("Nombre del ingeniero a cargo: ");
                                leer.nextLine();
                                String inge = leer.nextLine();

                                System.out.println("A Creado una casa exitosamente!\n\n");

                                if (estado == 1) {
                                    Lista.add(new Casas(Ncasa, NBloque, Color, largo, ancho, comprado, pisos, banos, cuartos, landlord, estado, inge));
                                } else if (estado == 2) {
                                    if (Construccion.size() > 5) {
                                        System.out.println("No puede agregar mas casas en construccion");
                                        break;
                                    } else {
                                        Construccion.add(new Casas(Ncasa, NBloque, Color, largo, ancho, comprado, pisos, banos, cuartos, landlord, estado, inge));
                                    }
                                } else if (estado == 3) {
                                    Espera.add(new Casas(Ncasa, NBloque, Color, largo, ancho, comprado, pisos, banos, cuartos, landlord, estado, inge));
                                } else if (estado == 4) {
                                    if (Demolicion.size() > 3) {
                                        System.out.println("No puede agregar mas casas en demolicion");
                                        break;
                                    } else {
                                        Demolicion.add(new Casas(Ncasa, NBloque, Color, largo, ancho, comprado, pisos, banos, cuartos, landlord, estado, inge));

                                    }
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("\n\nIngrese cual estado de casa quiere modificar");
                                System.out.println("1. Lista\n2. En construccion \n3. Construccion en espera\n4. Espera de Demolicion");
                                int estado = leer.nextInt();
                                while (estado != 1 && estado != 2 && estado != 3 && estado != 4) {
                                    System.out.println("No existe esa opcion");
                                    System.out.println("1. Lista\n2. En construccion \n3. Construccion en espera\n4. Espera de Demolicion");
                                    estado = leer.nextInt();
                                }
                                System.out.println("\n\nIngrese que desea modificar: ");
                                System.out.println("1. Numero de casa \n2. Numero de bloque\n3. Color\n4. Ancho\n5. Largo\n6. Si ya fue comprado o no\n"
                                        + "7. Numero de pisos\n8. Numero de baños\n9. Numero de cuartos\n10. Nombre del dueño\n11. Estado de la casa\n12. Nombre de ingeniero");
                                int modi = leer.nextInt();
                                if (estado == 1 && Lista.size() > 0) {
                                    switch (modi) {
                                        case 1: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Lista) {
                                                System.out.println("Posicion " + Lista.indexOf(casas) + " " + casas);
                                            }

                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo numero de casa");
                                            int Ncasa = leer.nextInt();
                                            ((Casas) Lista.get(pos)).setNCasa(Ncasa);
                                            break;
                                        }

                                        case 2: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Lista) {
                                                System.out.println("Posicion " + Lista.indexOf(casas) + " " + casas);
                                            }

                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo numero bloque");
                                            int Nbloque = leer.nextInt();
                                            ((Casas) Lista.get(pos)).setNBloque(Nbloque);

                                            break;
                                        }
                                        case 3: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Lista) {
                                                System.out.println("Posicion " + Lista.indexOf(casas) + " " + casas);
                                            }

                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo color");
                                            leer.nextLine();
                                            String color = leer.nextLine();
                                            ((Casas) Lista.get(pos)).setColor(color);

                                            break;
                                        }
                                        case 4: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Lista) {
                                                System.out.println("Posicion " + Lista.indexOf(casas) + " " + casas);
                                            }

                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo ancho");
                                            int ancho = leer.nextInt();
                                            ((Casas) Lista.get(pos)).setAncho(ancho);

                                            break;
                                        }
                                        case 5: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Lista) {
                                                System.out.println("Posicion " + Lista.indexOf(casas) + " " + casas);
                                            }

                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo largo");
                                            int ancho = leer.nextInt();
                                            ((Casas) Lista.get(pos)).setAncho(ancho);

                                            break;
                                        }
                                        case 6: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Lista) {
                                                System.out.println("Posicion " + Lista.indexOf(casas) + " " + casas);
                                            }

                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese si fue comprado o no");
                                            System.out.println("1. Si \n2. No");
                                            int comprado = leer.nextInt();
                                            ((Casas) Lista.get(pos)).setComprado(comprado);

                                            break;
                                        }
                                        case 7: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Lista) {
                                                System.out.println("Posicion " + Lista.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo numero de pisos");
                                            int pisos = leer.nextInt();
                                            ((Casas) Lista.get(pos)).setPiso(pisos);

                                            break;
                                        }
                                        case 8: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Lista) {
                                                System.out.println("Posicion " + Lista.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo numero de baños");
                                            int banos = leer.nextInt();
                                            ((Casas) Lista.get(pos)).setBano(banos);

                                            break;
                                        }
                                        case 9: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Lista) {
                                                System.out.println("Posicion " + Lista.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo numero de cuartos");
                                            int cuarto = leer.nextInt();
                                            ((Casas) Lista.get(pos)).setCuarto(cuarto);

                                            break;
                                        }
                                        case 10: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Lista) {
                                                System.out.println("Posicion " + Lista.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            if (((Casas) Lista.get(pos)).getComprado() == 1) {
                                                System.out.println("Ingrese el nuevo nombre del dueño");
                                                leer.nextLine();
                                                String dueno = leer.nextLine();
                                                ((Casas) Lista.get(pos)).setLandlord(dueno);
                                            } else {
                                                System.out.println("No puede modificar esto no tiene la casa comprada");
                                            }

                                            break;
                                        }
                                        case 11: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Lista) {
                                                System.out.println("Posicion " + Lista.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo estado de la casa");
                                            System.out.println("1. Lista\n2. En construccion \n3. Construccion en espera\n4. Espera de Demolicion");
                                            int estado2 = leer.nextInt();
                                            ((Casas) Lista.get(pos)).setEstado(estado2);

                                            break;
                                        }
                                        case 12: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Lista) {
                                                System.out.println("Posicion " + Lista.indexOf(casas) + " " + casas);
                                            }

                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo Ingeniero");
                                            leer.nextLine();
                                            String inge = leer.nextLine();
                                            ((Casas) Lista.get(pos)).setInge(inge);

                                            break;
                                        }

                                        default:
                                            System.out.println("No existe esa opcion");
                                    }
                                } else if (estado == 2 && Construccion.size() > 0) {
                                    switch (modi) {
                                        case 1: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Construccion) {
                                                System.out.println("Posicion " + Construccion.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo numero de casa");
                                            int Ncasa = leer.nextInt();
                                            ((Casas) Construccion.get(pos)).setNCasa(Ncasa);
                                            break;
                                        }

                                        case 2: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Construccion) {
                                                System.out.println("Posicion " + Construccion.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo numero bloque");
                                            int Nbloque = leer.nextInt();
                                            ((Casas) Construccion.get(pos)).setNBloque(Nbloque);

                                            break;
                                        }
                                        case 3: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Construccion) {
                                                System.out.println("Posicion " + Construccion.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo color");
                                            leer.nextLine();
                                            String color = leer.nextLine();
                                            ((Casas) Construccion.get(pos)).setColor(color);

                                            break;
                                        }
                                        case 4: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Construccion) {
                                                System.out.println("Posicion " + Construccion.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo ancho");
                                            int ancho = leer.nextInt();
                                            ((Casas) Construccion.get(pos)).setAncho(ancho);

                                            break;
                                        }
                                        case 5: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Construccion) {
                                                System.out.println("Posicion " + Construccion.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo largo");
                                            int ancho = leer.nextInt();
                                            ((Casas) Construccion.get(pos)).setAncho(ancho);

                                            break;
                                        }
                                        case 6: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Construccion) {
                                                System.out.println("Posicion " + Construccion.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese si fue comprado o no");
                                            System.out.println("1. Si \n2. No");
                                            int comprado = leer.nextInt();
                                            ((Casas) Construccion.get(pos)).setComprado(comprado);

                                            break;
                                        }
                                        case 7: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Construccion) {
                                                System.out.println("Posicion " + Construccion.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo numero de pisos");
                                            int pisos = leer.nextInt();
                                            ((Casas) Construccion.get(pos)).setPiso(pisos);

                                            break;
                                        }
                                        case 8: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Construccion) {
                                                System.out.println("Posicion " + Construccion.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo numero de baños");
                                            int banos = leer.nextInt();
                                            ((Casas) Construccion.get(pos)).setBano(banos);

                                            break;
                                        }
                                        case 9: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Construccion) {
                                                System.out.println("Posicion " + Construccion.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo numero de cuartos");
                                            int cuarto = leer.nextInt();
                                            ((Casas) Construccion.get(pos)).setCuarto(cuarto);

                                            break;
                                        }
                                        case 10: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Construccion) {
                                                System.out.println("Posicion " + Construccion.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            if (((Casas) Construccion.get(pos)).getComprado() == 1) {
                                                System.out.println("Ingrese el nuevo nombre del dueño");
                                                leer.nextLine();
                                                String dueno = leer.nextLine();
                                                ((Casas) Construccion.get(pos)).setLandlord(dueno);
                                            } else {
                                                System.out.println("No puede modificar esto no tiene la casa comprada");
                                            }

                                            break;
                                        }
                                        case 11: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Construccion) {
                                                System.out.println("Posicion " + Construccion.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo estado de la casa");
                                            System.out.println("1. Lista\n2. En construccion \n3. Construccion en espera\n4. Espera de Demolicion");
                                            int estado2 = leer.nextInt();
                                            ((Casas) Construccion.get(pos)).setEstado(estado2);

                                            break;
                                        }
                                        case 12: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Construccion) {
                                                System.out.println("Posicion " + Construccion.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo Ingeniero");
                                            leer.nextLine();
                                            String inge = leer.nextLine();
                                            ((Casas) Construccion.get(pos)).setInge(inge);

                                            break;
                                        }

                                        default:
                                            System.out.println("No existe esa opcion");
                                    }
                                } else if (estado == 3 && Espera.size() > 0) {
                                    switch (modi) {
                                        case 1: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Espera) {
                                                System.out.println("Posicion " + Espera.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo numero de casa");
                                            int Ncasa = leer.nextInt();
                                            ((Casas) Espera.get(pos)).setNCasa(Ncasa);
                                            break;
                                        }

                                        case 2: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Espera) {
                                                System.out.println("Posicion " + Espera.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo numero bloque");
                                            int Nbloque = leer.nextInt();
                                            ((Casas) Espera.get(pos)).setNBloque(Nbloque);

                                            break;
                                        }
                                        case 3: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Espera) {
                                                System.out.println("Posicion " + Espera.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo color");
                                            leer.nextLine();
                                            String color = leer.nextLine();
                                            ((Casas) Espera.get(pos)).setColor(color);

                                            break;
                                        }
                                        case 4: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Espera) {
                                                System.out.println("Posicion " + Espera.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo ancho");
                                            int ancho = leer.nextInt();
                                            ((Casas) Espera.get(pos)).setAncho(ancho);

                                            break;
                                        }
                                        case 5: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Espera) {
                                                System.out.println("Posicion " + Espera.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo largo");
                                            int ancho = leer.nextInt();
                                            ((Casas) Espera.get(pos)).setAncho(ancho);

                                            break;
                                        }
                                        case 6: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Espera) {
                                                System.out.println("Posicion " + Espera.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese si fue comprado o no");
                                            System.out.println("1. Si \n2. No");
                                            int comprado = leer.nextInt();
                                            ((Casas) Espera.get(pos)).setComprado(comprado);

                                            break;
                                        }
                                        case 7: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Espera) {
                                                System.out.println("Posicion " + Espera.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo numero de pisos");
                                            int pisos = leer.nextInt();
                                            ((Casas) Espera.get(pos)).setPiso(pisos);

                                            break;
                                        }
                                        case 8: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Espera) {
                                                System.out.println("Posicion " + Espera.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo numero de baños");
                                            int banos = leer.nextInt();
                                            ((Casas) Espera.get(pos)).setBano(banos);

                                            break;
                                        }
                                        case 9: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Espera) {
                                                System.out.println("Posicion " + Espera.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo numero de cuartos");
                                            int cuarto = leer.nextInt();
                                            ((Casas) Espera.get(pos)).setCuarto(cuarto);

                                            break;
                                        }
                                        case 10: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Espera) {
                                                System.out.println("Posicion " + Espera.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            if (((Casas) Espera.get(pos)).getComprado() == 1) {
                                                System.out.println("Ingrese el nuevo nombre del dueño");
                                                leer.nextLine();
                                                String dueno = leer.nextLine();
                                                ((Casas) Espera.get(pos)).setLandlord(dueno);
                                            } else {
                                                System.out.println("No puede modificar esto no tiene la casa comprada");
                                            }

                                            break;
                                        }
                                        case 11: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Espera) {
                                                System.out.println("Posicion " + Espera.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo estado de la casa");
                                            System.out.println("1. Lista\n2. En construccion \n3. Construccion en espera\n4. Espera de Demolicion");
                                            int estado2 = leer.nextInt();
                                            ((Casas) Espera.get(pos)).setEstado(estado2);

                                            break;
                                        }
                                        case 12: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Espera) {
                                                System.out.println("Posicion " + Espera.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo Ingeniero");
                                            leer.nextLine();
                                            String inge = leer.nextLine();
                                            ((Casas) Espera.get(pos)).setInge(inge);

                                            break;
                                        }

                                        default:
                                            System.out.println("No existe esa opcion");
                                    }
                                } else if (estado == 4 && Demolicion.size() > 0) {
                                    switch (modi) {
                                        case 1: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Demolicion) {
                                                System.out.println("Posicion " + Demolicion.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo numero de casa");
                                            int Ncasa = leer.nextInt();
                                            ((Casas) Demolicion.get(pos)).setNCasa(Ncasa);
                                            break;
                                        }

                                        case 2: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Demolicion) {
                                                System.out.println("Posicion " + Demolicion.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo numero bloque");
                                            int Nbloque = leer.nextInt();
                                            ((Casas) Demolicion.get(pos)).setNBloque(Nbloque);

                                            break;
                                        }
                                        case 3: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Demolicion) {
                                                System.out.println("Posicion " + Demolicion.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo color");
                                            leer.nextLine();
                                            String color = leer.nextLine();
                                            ((Casas) Demolicion.get(pos)).setColor(color);

                                            break;
                                        }
                                        case 4: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Demolicion) {
                                                System.out.println("Posicion " + Demolicion.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo ancho");
                                            int ancho = leer.nextInt();
                                            ((Casas) Demolicion.get(pos)).setAncho(ancho);

                                            break;
                                        }
                                        case 5: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Demolicion) {
                                                System.out.println("Posicion " + Demolicion.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo largo");
                                            int ancho = leer.nextInt();
                                            ((Casas) Demolicion.get(pos)).setAncho(ancho);

                                            break;
                                        }
                                        case 6: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Demolicion) {
                                                System.out.println("Posicion " + Demolicion.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese si fue comprado o no");
                                            System.out.println("1. Si \n2. No");
                                            int comprado = leer.nextInt();
                                            ((Casas) Demolicion.get(pos)).setComprado(comprado);

                                            break;
                                        }
                                        case 7: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Demolicion) {
                                                System.out.println("Posicion " + Demolicion.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo numero de pisos");
                                            int pisos = leer.nextInt();
                                            ((Casas) Demolicion.get(pos)).setPiso(pisos);

                                            break;
                                        }
                                        case 8: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Demolicion) {
                                                System.out.println("Posicion " + Demolicion.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo numero de baños");
                                            int banos = leer.nextInt();
                                            ((Casas) Demolicion.get(pos)).setBano(banos);

                                            break;
                                        }
                                        case 9: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Demolicion) {
                                                System.out.println("Posicion " + Demolicion.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo numero de cuartos");
                                            int cuarto = leer.nextInt();
                                            ((Casas) Demolicion.get(pos)).setCuarto(cuarto);

                                            break;
                                        }
                                        case 10: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Demolicion) {
                                                System.out.println("Posicion " + Demolicion.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            if (((Casas) Demolicion.get(pos)).getComprado() == 1) {
                                                System.out.println("Ingrese el nuevo nombre del dueño");
                                                leer.nextLine();
                                                String dueno = leer.nextLine();
                                                ((Casas) Demolicion.get(pos)).setLandlord(dueno);
                                            } else {
                                                System.out.println("No puede modificar esto no tiene la casa comprada");
                                            }

                                            break;
                                        }
                                        case 11: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Demolicion) {
                                                System.out.println("Posicion " + Demolicion.indexOf(casas) + " " + casas);
                                            }
                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo estado de la casa");
                                            System.out.println("1. Lista\n2. En construccion \n3. Construccion en espera\n4. Espera de Demolicion");
                                            int estado2 = leer.nextInt();
                                            ((Casas) Demolicion.get(pos)).setEstado(estado2);

                                            break;
                                        }
                                        case 12: {
                                            System.out.println("Casas listas");
                                            for (Casas casas : Demolicion) {
                                                System.out.println("Posicion " + Demolicion.indexOf(casas) + " " + casas);
                                            }

                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo Ingeniero");
                                            leer.nextLine();
                                            String inge = leer.nextLine();
                                            ((Casas) Demolicion.get(pos)).setInge(inge);

                                            break;
                                        }

                                        default:
                                            System.out.println("No existe esa opcion");
                                    }
                                } else {
                                    System.out.println("Ingreso la opcion equivocada o no hay casas en el estado que escojio");
                                }
                                break;
                            }

                            case 2: {
                                System.out.println("Casas listas");
                                for (Casas casas : Lista) {
                                    System.out.println("Posicion " + Lista.indexOf(casas) + " " + casas);
                                }
                                System.out.println("Casas en construccion");
                                for (Casas casas : Construccion) {
                                    System.out.println("Posicion " + Construccion.indexOf(casas) + " " + casas);
                                }
                                System.out.println("Casas contruccion en espera");
                                for (Casas casas : Espera) {
                                    System.out.println("Posicion " + Espera.indexOf(casas) + " " + casas);
                                }
                                System.out.println("Casas en espera de demolicion");
                                for (Casas casas : Demolicion) {
                                    System.out.println("Posicion " + Demolicion.indexOf(casas) + " " + casas);
                                }
                                break;
                            }
                            case 4: {

                                int pos;
                                System.out.println("Ingrese tipo de casa quiere borrar");
                                System.out.println("1. Lista\n2. En construccion \n3. Construccion en espera\n4. Espera de Demolicion");
                                int estado = leer.nextInt();

                                if (estado == 1) {
                                    System.out.println("Casas listas");
                                    for (Casas casas : Lista) {
                                        System.out.println("Posicion " + Lista.indexOf(casas) + " " + casas);
                                    }

                                    System.out.println("Ingrese la posicion que quiere eliminar");
                                    pos = leer.nextInt();

                                    Lista.remove(pos);
                                } else if (estado == 2) {
                                    System.out.println("Casas en construccion");
                                    for (Casas casas : Construccion) {
                                        System.out.println("Posicion " + Construccion.indexOf(casas) + " " + casas);
                                    }

                                    System.out.println("Ingrese la posicion que quiere eliminar");
                                    pos = leer.nextInt();

                                    Construccion.remove(pos);
                                } else if (estado == 3) {
                                    System.out.println("Casas contruccion en espera");
                                    for (Casas casas : Espera) {
                                        System.out.println("Posicion " + Espera.indexOf(casas) + " " + casas);
                                    }

                                    System.out.println("Ingrese la posicion que quiere eliminar");
                                    pos = leer.nextInt();

                                    Espera.remove(pos);

                                } else if (estado == 4) {
                                    System.out.println("Casas en espera de demolicion");
                                    for (Casas casas : Demolicion) {
                                        System.out.println("Posicion " + Demolicion.indexOf(casas) + " " + casas);
                                    }

                                    System.out.println("Ingrese la posicion que quiere eliminar");
                                    pos = leer.nextInt();

                                    Demolicion.remove(pos);
                                }

                                break;
                            }
                            default:
                                System.out.println("No existe esa opcion en el menu!");
                        }

                        break;
                    }

                    case 2: {

                        System.out.println("Ingrese que estado de casa quiere manejar");
                        System.out.println("1. Lista\n2. En construccion \n3. Construccion en espera\n4. Demoler");
                        int estado = leer.nextInt();
                        while (estado != 1 && estado != 2 && estado != 3 && estado != 4) {
                            System.out.println("No existe esa opcion");
                            System.out.println("1. Lista\n2. En construccion \n3. Construccion en espera\n4. Espera de Demolicion");
                            estado = leer.nextInt();
                        }

                        if (estado == 1) {
                            System.out.println("Casas listas");
                            for (Casas casas : Lista) {
                                System.out.println("Posicion " + Lista.indexOf(casas) + " " + casas);
                            }

                            System.out.println("Que posicion quiere modificar");
                            int pos = leer.nextInt();
                            while (pos > Lista.size() && pos < 0) {
                                System.out.println("No existe esa posicion");
                                System.out.println("Que posicion quiere modificar");
                                pos = leer.nextInt();
                            }

                            System.out.println("4. Espera de Demolicion");
                            int estado3 = leer.nextInt();

                            while (estado3 != 4) {
                                System.out.println("No existe otra opcion");
                                System.out.println("4. Espera de Demolicion");
                                estado3 = leer.nextInt();
                            }

                            if (Demolicion.size() > 3) {
                                System.out.println("No puede agregar mas a la espera de demolicion");

                            } else if (estado3 == 4) {
                                ((Casas) Lista.get(pos)).setEstado(estado3);
                                Demolicion.add(Lista.get(pos));
                                Lista.remove(pos);
                            }

                        } else if (estado == 2) {
                            System.out.println("Casas en construccion");
                            for (Casas casas : Construccion) {
                                System.out.println("Posicion " + Construccion.indexOf(casas) + " " + casas);
                            }

                            System.out.println("Que posicion quiere modificar");
                            int pos = leer.nextInt();

                            System.out.println("1. Lista\n3. Construccion en espera");
                            int estado3 = leer.nextInt();
                            while (estado3 != 1 && estado3 != 3) {
                                System.out.println("No existe otra opcion");
                                System.out.println("1. Lista\n3. Construccion en espera");
                                estado3 = leer.nextInt();
                            }

                            if (estado3 == 1) {
                                ((Casas) Construccion.get(pos)).setEstado(estado3);
                                Lista.add(Construccion.get(pos));
                                Construccion.remove(pos);
                            } else if (estado3 == 3) {
                                ((Casas) Construccion.get(pos)).setEstado(estado3);
                                Espera.add(Construccion.get(pos));
                                Construccion.remove(pos);
                            }

                        } else if (estado == 3) {
                            System.out.println("Casas contruccion en espera");
                            for (Casas casas : Espera) {
                                System.out.println("Posicion " + Espera.indexOf(casas) + " " + casas);
                            }

                            System.out.println("Que posicion quiere modificar");
                            int pos = leer.nextInt();

                            System.out.println("2. En construccion ");
                            int estado3 = leer.nextInt();

                            while (estado3 != 3) {
                                System.out.println("No existe otra opcion");
                                System.out.println("2. En construccion ");
                                estado3 = leer.nextInt();
                            }

                            if (Construccion.size() > 5) {
                                System.out.println("No puede agregar mas En construcccion");
                            } else if (estado == 3) {
                                ((Casas) Espera.get(pos)).setEstado(estado3);
                                Construccion.add(Espera.get(pos));
                                Espera.remove(pos);
                            }

                        } else if (estado == 4) {
                            System.out.println("Casas en espera de demolicion");
                            for (Casas casas : Demolicion) {
                                System.out.println("Posicion " + Demolicion.indexOf(casas) + " " + casas);
                            }

                            System.out.println("Que posicion quiere demoler");
                            int pos = leer.nextInt();
                            while (pos > Demolicion.size() && pos < 0) {
                                System.out.println("No puede ingresar esa posicion");
                                System.out.println("Que posicion quiere demoler");
                                pos = leer.nextInt();
                            }

                            Demolicion.remove(pos);

                        }

                        break;
                    }
                    case 3: {
                        System.exit(0);
                        break;
                    }

                    default:
                        System.out.println("No existe esa opcion en el menu!");
                }

                System.out.println("1. Registro de clases\n2. Manejo de Estados\n3. Salir");
                menu = leer.nextInt();
            }
        } else {

            System.out.println("Usuario o contraseña incorrecta!");
        }

    }

}

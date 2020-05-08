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
                                    Lista.add(new Casas(Ncasa, NBloque, Color, largo, ancho, comprado, pisos, banos, cuartos, landlord, usuario, inge));
                                } else if (estado == 2) {
                                    if (Construccion.size() > 5) {
                                        System.out.println("No puede agregar mas casas en construccion");
                                        break;
                                    } else {
                                        Construccion.add(new Casas(Ncasa, NBloque, Color, largo, ancho, comprado, pisos, banos, cuartos, landlord, usuario, inge));
                                    }
                                } else if (estado == 3) {
                                    Espera.add(new Casas(Ncasa, NBloque, Color, largo, ancho, comprado, pisos, banos, cuartos, landlord, usuario, inge));
                                } else if (estado == 4) {
                                    if (Demolicion.size() > 3) {
                                        System.out.println("No puede agregar mas casas en demolicion");
                                        break;
                                    } else {
                                        Demolicion.add(new Casas(Ncasa, NBloque, Color, largo, ancho, comprado, pisos, banos, cuartos, landlord, usuario, inge));

                                    }
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("Ingrese cual estado de casa quiere modificar");
                                System.out.println("1. Lista\n2. En construccion \n3. Construccion en espera\n4. Espera de Demolicion");
                                int estado = leer.nextInt();
                                while (estado != 1 && estado != 2 && estado != 3 && estado != 4) {
                                    System.out.println("No existe esa opcion");
                                    System.out.println("1. Lista\n2. En construccion \n3. Construccion en espera\n4. Espera de Demolicion");
                                    estado = leer.nextInt();
                                }
                                System.out.println("Ingrese que desea modificar: ");
                                System.out.println("1. Numero de casa \n2. Numero de bloque\n3. Color\n4. Ancho\n5. Largo\n6. Si ya fue comprado o no\n"
                                        + "7. Numero de pisos\n8. Numero de baños\n9. Numero de cuartos\n10. Nombre del dueño\n11. Estado de la casa\n12. Nombre de ingeniero");
                                int modi = leer.nextInt();
                                if (estado == 1) {
                                    switch (modi) {
                                        case 1: {
                                            System.out.println("Casas listas");
                                            System.out.println(Lista);

                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo ancho");
                                            int ancho = leer.nextInt();
                                            ((Casas) Lista.get(pos)).setAncho(ancho);
                                            break;
                                        }

                                        case 2: {
                                            System.out.println("Casas listas");
                                            System.out.println(Lista);

                                            System.out.println("Ingrese la posicion que quiere modificar");
                                            int pos = leer.nextInt();
                                            System.out.println("Ingrese el nuevo ancho");
                                            int ancho = leer.nextInt();
                                            ((Casas) Lista.get(pos)).setAncho(ancho);
                                            break;
                                        }
                                        case 3: {

                                            break;
                                        }
                                        case 4: {

                                            break;
                                        }
                                        case 5: {

                                            break;
                                        }
                                        case 6: {

                                            break;
                                        }
                                        case 7: {

                                            break;
                                        }
                                        case 8: {

                                            break;
                                        }
                                        case 9: {

                                            break;
                                        }
                                        case 10: {

                                            break;
                                        }
                                        case 11: {

                                            break;
                                        }
                                        case 12: {

                                            break;
                                        }

                                        default:
                                            System.out.println("No existe esa opcion");
                                    }
                                }
                                break;
                            }

                            case 3: {
                                System.out.println("Casas listas");
                                System.out.println(Lista);
                                System.out.println("Casas en construccion");
                                System.out.println(Construccion);
                                System.out.println("Casas contruccion en espera");
                                System.out.println(Espera);
                                System.out.println("Casas en espera de demolicion");
                                System.out.println(Demolicion);

                                break;
                            }
                            case 4: {
                                int pos;
                                System.out.println("Ingrese tipo de casa quiere borrar");
                                System.out.println("1. Lista\n2. En construccion \n3. Construccion en espera\n4. Espera de Demolicion");
                                int estado = leer.nextInt();

                                if (estado == 1) {
                                    System.out.println("Casas listas");
                                    System.out.println(Lista);

                                    System.out.println("Ingrese la posicion que quiere eliminar");
                                    pos = leer.nextInt();

                                    Lista.remove(pos);
                                } else if (estado == 2) {
                                    System.out.println("Casas en construccion");
                                    System.out.println(Construccion);

                                    System.out.println("Ingrese la posicion que quiere eliminar");
                                    pos = leer.nextInt();

                                    Construccion.remove(pos);
                                } else if (estado == 3) {
                                    System.out.println("Casas contruccion en espera");
                                    System.out.println(Espera);

                                    System.out.println("Ingrese la posicion que quiere eliminar");
                                    pos = leer.nextInt();

                                    Espera.remove(pos);

                                } else if (estado == 4) {
                                    System.out.println("Casas en espera de demolicion");
                                    System.out.println(Demolicion);

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
        }

        {
            System.out.println("Usuario o contraseña incorrecta!");
        }

    }

}

package com.soccer.view;

import java.util.Enumeration;
import java.util.Scanner;

import com.soccer.Controller;
import com.soccer.model.entity.Coach;

public class viewCoach {
    public static Controller controlador;

    public void start() {

        Scanner scanner = new Scanner(System.in);

        

        while (true) {
            System.out.println("1. Crear Couch");
            System.out.println("2. Actualizar Couch");
            System.out.println("3. Buscar Couch");
            System.out.println("4. Eliminar Couch");
            System.out.println("5. Listar todos los Couch");
            System.out.println("6. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Coach entrenador = new Coach();
                    String codigoEntrenador = null;
                    System.out.println("Ingrese el codigo del Entrenador");
                    codigoEntrenador = scanner.nextLine();
                    entrenador.setId(Integer.parseInt(codigoEntrenador));
                    System.out.println("Ingrese el nombre del Entrenador");
                    entrenador.setNombre(scanner.nextLine());
                    System.out.println("Apellido");
                    entrenador.setApellido(scanner.nextLine());
                    System.out.println("Edad");
                    entrenador.setEdad(scanner.nextInt());
                    System.out.println("ID de la federacion");
                    entrenador.setIdFederacion(scanner.nextInt());
                    scanner.nextLine();
                    controlador.entrenadores.put(codigoEntrenador, entrenador);
                    break;
                case 2:

                    entrenador = new Coach();
                    codigoEntrenador = null;
                    System.out.println("Ingrese el codigo del Entrenador");
                    codigoEntrenador = scanner.nextLine();
                    entrenador.setId(Integer.parseInt(codigoEntrenador));
                    System.out.println("Ingrese el nombre del Entrenador");
                    entrenador.setNombre(scanner.nextLine());
                    System.out.println("Apellido");
                    entrenador.setApellido(scanner.nextLine());
                    System.out.println("Edad");
                    entrenador.setEdad(scanner.nextInt());
                    System.out.println("ID de la federacion");
                    entrenador.setIdFederacion(scanner.nextInt());
                    controlador.entrenadores.put(codigoEntrenador, entrenador);

                    break;
                case 3:
                    Coach eab = new Coach();
                    System.out.println("Ingrese el codigo del entrenador");
                    codigoEntrenador = scanner.nextLine();
                    eab = controlador.entrenadores.get(codigoEntrenador);
                    if (eab != null) {
                        System.out.println("El entrenador con codigo " + eab.getId() + " es " + eab.getNombre());

                    } else {
                        System.out.println("No se encontro el Entrenador.");
                    }

                    break;
                case 4:

                    Coach eae = new Coach(); /* eae = entrenador a eliminar */
                    System.out.println("Ingrese el codigo del entrenador a eliminar.");
                    codigoEntrenador = scanner.nextLine();
                    eae = controlador.entrenadores.remove(codigoEntrenador);
                    System.out.println("Se elimino correctamente el entrenador con nombre " + eae.getNombre() + ".");

                    break;

                case 5:
                    System.out.println("Ingresando.");
                    Enumeration<String> teamKeys = controlador.entrenadores.keys();
                    while (teamKeys.hasMoreElements()) {
                        String teamKey = teamKeys.nextElement();
                        System.out.println("Key: " + teamKey + " Nombre del entrenador: " +
                                controlador.entrenadores.get(teamKey).getNombre());
                    }
                    break;

                case 6:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida, intentelo de nuevo");
            }
        }

    }
}

package com.soccer.view;

import java.util.Enumeration;
import java.util.Scanner;

import com.soccer.Controller;
import com.soccer.model.entity.Team;

public class viewTeam {
    public static Controller controlador;

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear Equipo");
            System.out.println("2. Actualizar Equipo");
            System.out.println("3. Buscar Equipo");
            System.out.println("4. Eliminar Equipo");
            System.out.println("5. Listar todos Equipos");
            System.out.println("6. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    Team equipo = new Team();
                    String codigoEquipo = null;
                    System.out.println("Ingrese el codigo del equipo :");
                    codigoEquipo = scanner.nextLine();
                    System.out.println("Ingrese Nombre del equipo :");
                    equipo.setNombre(scanner.nextLine());
                    System.out.println("Ingrese la ciudad :");
                    equipo.setCiudad(scanner.nextLine());
                    controlador.equipos.put(codigoEquipo, equipo);
                    break;

                case 2:

                    equipo = new Team();
                    codigoEquipo = null;
                    System.out.println("Ingrese el codigo del equipo :");
                    codigoEquipo = scanner.nextLine();
                    System.out.println("Ingrese Nombre del equipo :");
                    equipo.setNombre(scanner.nextLine());
                    System.out.println("Ingrese la ciudad :");
                    equipo.setCiudad(scanner.nextLine());
                    controlador.equipos.put(codigoEquipo, equipo);

                    break;

                case 3:
                    Team buscEquipo = new Team();
                    System.out.println("Ingrese el codigo del Equipo");
                    codigoEquipo = scanner.nextLine();
                    buscEquipo = controlador.equipos.get(codigoEquipo);
                    if (buscEquipo != null) {
                        System.out.println("El equipo con nombre " + buscEquipo.getNombre() + " es de la ciudad " + buscEquipo.getCiudad());

                    } else {
                        System.out.println("No se encontro el equipo.");
                    }
                    break;
                case 4:

                    Team tae = new Team(); /* tae = entrenador a eliminar */
                    System.out.println("Ingrese el codigo del equipo a eliminar.");
                    codigoEquipo = scanner.nextLine();
                    tae = controlador.equipos.remove(codigoEquipo);
                    System.out.println("Se elimino correctamente el equipo " + tae.getNombre() + ".");

                    break;

                case 5:
               
                    Enumeration<String> teamKeys = controlador.equipos.keys();
                    while (teamKeys.hasMoreElements()) {
                        String teamKey = teamKeys.nextElement();
                        System.out.println("Key: " + teamKey + " Nombre del equipo: " +
                                controlador.equipos.get(teamKey).getNombre());
                    }
                    break;

                case 6:
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion invalida, intentelo de nuevo.");
            }
        }
    }
}

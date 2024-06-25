package com.soccer.view;

import java.util.Scanner;

import com.soccer.Controller;
import com.soccer.model.entity.Doctor;

public class viewDoctor {

    public static Controller controlador;

    public void start() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear Masajista");
            System.out.println("2. Actualizar Masajista");
            System.out.println("3. Buscar Masajista");
            System.out.println("4. Eliminar Masajista");
            System.out.println("5. Listar a los Masajista");
            System.out.println("6. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Doctor masajista = new Doctor();
                    String codigoMasajista = null;
                    System.out.println("Ingrese el codigo del masajista");
                    codigoMasajista = scanner.nextLine();
                    masajista.setId(Integer.parseInt(codigoMasajista));
                    System.out.println("Ingrese el nombre del Doctor");
                    masajista.setNombre(scanner.nextLine());
                    System.out.println("Apellido");
                    masajista.setApellido(scanner.nextLine());
                    System.out.println("Edad");
                    masajista.setEdad(scanner.nextInt());
                    System.out.println("Titulo");
                    masajista.setTitulo(scanner.nextLine());
                    System.out.println("Años de experiencia");
                    masajista.setExpYear(scanner.nextInt());
                    scanner.nextLine();
                    controlador.doctores.put(codigoMasajista, masajista);

                    break;

                case 2:

                    masajista = new Doctor();
                    codigoMasajista = null;
                    System.out.println("Ingrese el codigo del masajista");
                    codigoMasajista = scanner.nextLine();
                    masajista.setId(Integer.parseInt(codigoMasajista));
                    System.out.println("Ingrese el nombre del Doctor");
                    masajista.setNombre(scanner.nextLine());
                    System.out.println("Apellido");
                    masajista.setApellido(scanner.nextLine());
                    System.out.println("Edad");
                    masajista.setEdad(scanner.nextInt());
                    System.out.println("Titulo");
                    masajista.setTitulo(scanner.nextLine());
                    System.out.println("Años de experiencia");
                    masajista.setExpYear(scanner.nextInt());
                    scanner.nextLine();
                    controlador.doctores.put(codigoMasajista, masajista);

                    break;

                case 3:

                    Doctor docabusc = new Doctor();
                    System.out.println("Ingrese el codigo del Masajista");
                    codigoMasajista = scanner.nextLine();
                    docabusc = controlador.doctores.get(codigoMasajista);
                    if (docabusc != null) {
                        System.out.println("El doctor con codigo " + docabusc.getId() + " es " + docabusc.getNombre()
                                + " y especialista en " + docabusc.getTitulo());

                    }
                    break;
                case 4:

                    Doctor elimdoc = new Doctor();
                    System.out.println("Ingrese el codigo del doctor a Eliminar");
                    codigoMasajista = scanner.nextLine();
                    elimdoc = controlador.doctores.remove(codigoMasajista);
                    System.out.println("Se elimino correctamente al Doctor " + elimdoc.getNombre());

                    break;

                case 5:
                    
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

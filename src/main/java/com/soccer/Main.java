package com.soccer;

import java.util.Scanner;

import com.soccer.view.viewCoach;
import com.soccer.view.viewDoctor;
import com.soccer.view.viewTeam;

public class Main {
    public static void main(String[] args) {
        Controller ctrlTeams = new Controller();
        viewTeam.controlador = ctrlTeams;
        viewTeam vt = new viewTeam();

        Controller ctrlCoach = new Controller();
        viewCoach.controlador = ctrlCoach;
        viewCoach vc = new viewCoach();

        Controller ctrDoctor = new Controller();
        viewDoctor.controlador = ctrDoctor;
        viewDoctor vdoc = new viewDoctor();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1.      Administrar Entrenadores."); 
            System.out.println("2.      Administrar Equipos."); 
            System.out.println("3.      Administrar Doctores.");           
            System.out.println("4.  Salir");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    vc.start();
                    break;
                case 2:
                    vt.start();                    
                    break;
                
                case 3:
                    vdoc.start();
                    break;

                case 4:
                    System.out.println("\"Hasta la vista BABY!\"");
                    System.exit(0);
                default:
                System.out.println("Opcion invalida, intentelo de nuevo");
            }

        }

        
        


       // System.out.println("Jugador"+ eq.getLstJugadores().get(0).getNombre());
    }
}
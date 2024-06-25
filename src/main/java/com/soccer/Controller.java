package com.soccer;


import java.util.Hashtable;

import com.soccer.model.entity.Coach;
import com.soccer.model.entity.Doctor;
import com.soccer.model.entity.Player;
import com.soccer.model.entity.Team;
/*aqui es donde se van a guardar los datos  */
public class Controller {
    public Hashtable <String,Team> equipos = new Hashtable<>();
    public Hashtable <String,Player> jugadores = new Hashtable<>();
    public Hashtable <String,Coach> entrenadores = new Hashtable<>();
    public Hashtable <String,Doctor> doctores = new Hashtable<>();
    public Object masajista;




}

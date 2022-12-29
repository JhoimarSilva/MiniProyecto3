package a.miniproyecto3;

import java.util.ArrayList;

/**
 *
 * @author JHOIMAR
 */
public class Almacenamiento {

    private ArrayList<Paciente> pacientes = new ArrayList();
    private ArrayList<CitaAgendada> citas = new ArrayList();

    public Almacenamiento() {
    }

    public ArrayList<Paciente> getPacientes() {
        return this.pacientes;
    }

    public ArrayList<CitaAgendada> getCitas() {
        return this.citas;
    }
}

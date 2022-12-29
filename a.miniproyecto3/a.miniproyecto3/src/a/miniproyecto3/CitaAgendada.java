package a.miniproyecto3;

/**
 *
 * @author JHOIMAR
 */
public class CitaAgendada {

    int numeroDocumento;
    String nombrePaciente;
    String apellidoPaciente;
    int telefonoPaciente;
    int fechaCita;
    int horaCita;
    String generoPaciente = "";
    String consultorioCita = "";
    String ServicioMedico = "";

    public CitaAgendada(
            int documento, int telefono, int fecha, int hora,
            String nombre, String apellido,
            String genero, String consultorio, String servicio
    ) {
        this.numeroDocumento = documento;
        this.nombrePaciente = nombre;
        this.apellidoPaciente = apellido;
        this.telefonoPaciente = telefono;
        this.fechaCita = fecha;
        this.horaCita = hora;
        this.consultorioCita = consultorio;
        this.ServicioMedico = servicio;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getApellidoPaciente() {
        return apellidoPaciente;
    }

    public void setApellidoPaciente(String apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
    }

    public int getTelefonoPaciente() {
        return telefonoPaciente;
    }

    public void setTelefonoPaciente(int telefonoPaciente) {
        this.telefonoPaciente = telefonoPaciente;
    }

    public int getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(int fechaCita) {
        this.fechaCita = fechaCita;
    }

    public int getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(int horaCita) {
        this.horaCita = horaCita;
    }

    public String getGeneroPaciente() {
        return this.generoPaciente;
    }

    public void setGeneroPaciente(String generoPaciente) {
        this.generoPaciente = generoPaciente;
    }

    public String getConsultorioCita() {
        return this.consultorioCita;
    }

    public void setConsultorioCita(String consultorioCita) {
        this.consultorioCita = consultorioCita;
    }

    public String getServicioMedico() {
        return this.ServicioMedico;
    }

    public void setServicioMedico(String ServicioMedico) {
        this.ServicioMedico = ServicioMedico;
    }
    public String toString() {
        return String.format(
                "%s * %s * %s * %s * %s * %s * %s * %s",
                this.numeroDocumento,
                this.nombrePaciente,
                this.apellidoPaciente,
                this.telefonoPaciente,
                this.fechaCita,
                this.horaCita,
                this.consultorioCita,
                this.ServicioMedico
        );
    }
}

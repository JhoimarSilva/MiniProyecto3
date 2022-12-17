
package a.miniproyecto3;

/**
 *
 * @author JHOIMAR
 */
public class CitaAgendada {
    int Ndocumento;
    String CitaNombre;
    String CitaApellido;
    int CitaTelefono;
    int CitaFecha;
    int CitaHora;
    String CitaGenero = "";
    String CitaConsultorio = "";
    String ServicioMedico = "";

    public int getNdocumento() {
        return Ndocumento;
    }

    public void setNdocumento(int Ndocumento) {
        this.Ndocumento = Ndocumento;
    }

    public String getCitaNombre() {
        return CitaNombre;
    }

    public void setCitaNombre(String CitaNombre) {
        this.CitaNombre = CitaNombre;
    }

    public String getCitaApellido() {
        return CitaApellido;
    }

    public void setCitaApellido(String CitaApellido) {
        this.CitaApellido = CitaApellido;
    }

    public int getCitaTelefono() {
        return CitaTelefono;
    }

    public void setCitaTelefono(int CitaTelefono) {
        this.CitaTelefono = CitaTelefono;
    }

    public int getCitaFecha() {
        return CitaFecha;
    }

    public void setCitaFecha(int CitaFecha) {
        this.CitaFecha = CitaFecha;
    }

    public int getCitaHora() {
        return CitaHora;
    }

    public void setCitaHora(int CitaHora) {
        this.CitaHora = CitaHora;
    }

    public String getCitaGenero() {
        return CitaGenero;
    }

    public void setCitaGenero(String CitaGenero) {
        this.CitaGenero = CitaGenero;
    }

    public String getCitaConsultorio() {
        return CitaConsultorio;
    }

    public void setCitaConsultorio(String CitaConsultorio) {
        this.CitaConsultorio = CitaConsultorio;
    }

    public String getServicioMedico() {
        return ServicioMedico;
    }

    public void setServicioMedico(String ServicioMedico) {
        this.ServicioMedico = ServicioMedico;
    }
    
    public CitaAgendada(int Ndocumento, String CitaNombre, String CitaApellido, int CitaTelefono, int CitaFecha, int CitaHora, String CitaGenero1, String CitaConsultorio1, String CitaHorario, String ServicioMedico1) {
        this.Ndocumento = Ndocumento;
        this.CitaNombre = CitaNombre;
        this.CitaApellido = CitaApellido;
        this.CitaTelefono = CitaTelefono;
        this.CitaFecha = CitaFecha;
        this.CitaHora = CitaHora;
    }
    
    
 }

package a.miniproyecto3;

/**
 *
 * @author JHOIMAR
 */
enum TipoDocumento {
    CedulaCiudadania, TarjetaIdentidad, CedulaExtranjeria;
}

enum Genero {
    Masculino, Femenino, NoBinario;

    public String nombre() {
        switch (this) {
            case Masculino:
                return "Masculino";
            case Femenino:
                return "Femenino";
            case NoBinario:
                return "No Binario";
            default:
                return null;
        }
    }
}

public class Paciente {

    String nombre;
    String apellido;
    int documento;
    TipoDocumento tipoDocumento;
    String genero = "";
    int fecha;
    String direccion;
    String barrio;
    String correo;
    int telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Paciente(
            String nombre1, String apellido1,
            int documento1, TipoDocumento tipoDocumento1,
            String genero1, int fecha1,
            String direccion1, String barrio1,
            String correo1, int telefono1
    ) {
        this.nombre = nombre1;
        this.apellido = apellido1;
        this.documento = documento1;
        this.fecha = fecha1;
        this.direccion = direccion1;
        this.barrio = barrio1;
        this.correo = correo1;
        this.telefono = telefono1;
        this.genero = genero1;
        this.tipoDocumento = tipoDocumento1;
    }

    public String toString() {
        return String.format(
                "%s * %s * %s * %s * %s * %s * %s * %s * %s * %s",
                this.nombre,
                this.apellido,
                this.documento,
                this.fecha,
                this.direccion,
                this.barrio,
                this.correo,
                this.telefono,
                this.genero,
                this.tipoDocumento
        );
    }

}

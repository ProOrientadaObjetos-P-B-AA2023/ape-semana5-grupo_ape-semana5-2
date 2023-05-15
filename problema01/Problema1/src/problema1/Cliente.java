package problema1;

public class Cliente {
    private String nombrescliente;
    private String apellidoscliente;
    private String cedulacliente;

    public Cliente() {
    }

    public Cliente(String nombrescliente, String apellidoscliente, String cedulacliente) {
        this.nombrescliente = nombrescliente;
        this.apellidoscliente = apellidoscliente;
        this.cedulacliente = cedulacliente;
    }

    public void setNombrescliente(String nombrescliente) {
        this.nombrescliente = nombrescliente;
    }

    public void setApellidoscliente(String apellidoscliente) {
        this.apellidoscliente = apellidoscliente;
    }

    public void setCedulacliente(String cedulacliente) {
        this.cedulacliente = cedulacliente;
    }

    public String getNombrescliente() {
        return nombrescliente;
    }

    public String getApellidoscliente() {
        return apellidoscliente;
    }

    public String getCedulacliente() {
        return cedulacliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombrescliente=" + nombrescliente + ", apellidoscliente=" + apellidoscliente + ", cedulacliente=" + cedulacliente + '}';
    }
    
}

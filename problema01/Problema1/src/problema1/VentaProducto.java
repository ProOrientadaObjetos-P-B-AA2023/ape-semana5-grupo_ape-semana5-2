package problema1;

public class VentaProducto {
    private int cantidad;
    private double precioinicial;
    private double descuento;
    private double preciofinal;
    private Cliente cliente;

    public VentaProducto() {
    }

    public VentaProducto(int cantidad, double precioinicial, Cliente cliente) {
        this.cantidad = cantidad;
        this.precioinicial = precioinicial;
        this.cliente = cliente;
    }


    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioinicial(double precioinicial) {
        this.precioinicial = precioinicial;
    }

    public void calcularDescuento() {
        if ((this.precioinicial >= 1000) && (this.cantidad >= 10)) {
            this.descuento = this.precioinicial * 0.10;
        } else if (this.precioinicial < 1000) {
            this.descuento = this.precioinicial * 0.05;
        }
    }

    public void calcularPreciofinal() {
        this.preciofinal = this.precioinicial - this.descuento;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioinicial() {
        return precioinicial;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getPreciofinal() {
        return preciofinal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "VentaProducto{" + "cantidad=" + cantidad + ", precioinicial=" + precioinicial + ", descuento=" + descuento + ", preciofinal=" + preciofinal + ", cliente=" + cliente + '}';
    }

}

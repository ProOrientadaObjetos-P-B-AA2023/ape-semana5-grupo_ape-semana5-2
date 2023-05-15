package problema1;

import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        double precioinicial = 0;
        System.out.print("Ingrese la cantidad de productos: ");
        cantidad = sc.nextInt();
        
        for (int c = 1; c <= cantidad; c++) {
            System.out.print("Ingrese el precio del producto " + c + ": ");
            precioinicial = precioinicial + sc.nextDouble();
        }
        
        Cliente Cliente1 = new Cliente("Pablo","Loja","110457898");
        VentaProducto Venta1 = new VentaProducto(cantidad,precioinicial,Cliente1);
        Venta1.calcularDescuento();
        Venta1.calcularPreciofinal();
        System.out.println(Venta1);
    }
    
}

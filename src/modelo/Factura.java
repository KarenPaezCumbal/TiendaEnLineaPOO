/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class Factura {
    private int kapcIdFactura;
    private Cliente kapcDatosCliente;
    private String kapcMetodoPago;
    private double kapcSubTotal;
    private double kapcIva;
    private double kapcTotalU;
    
    public Factura(){}
    
    public Factura(int kapcIdFactura, Cliente kapcDatosCliente, String kapcMetodoPago, double kapcSubTotal, double kapcIva, double kapcTotalU){
    this.kapcIdFactura = kapcIdFactura;
    this.kapcDatosCliente = kapcDatosCliente;
    this.kapcMetodoPago = kapcMetodoPago;
    this.kapcSubTotal = kapcSubTotal;
    this.kapcIva = kapcIva;
    this.kapcTotalU = kapcTotalU;
    }
    public int getkapcIdFactura(){
        return kapcIdFactura;
    }
    public void setkapcIdFactura(int kapcIdFactura){
        this.kapcIdFactura = kapcIdFactura;
    }
     public Cliente getkapcDatosCliente(){
        return kapcDatosCliente;
    }
    public void setkapcDatosCliente(Cliente kapcDatosCliente){
        this.kapcDatosCliente = kapcDatosCliente;
    }
     public String getkapcMetodoPago(){
        return kapcMetodoPago;
    }
    public void setkapcMetodoPago(String kapcMetodoPago){
        this.kapcMetodoPago = kapcMetodoPago;
    }
     public double getkapcSubTotal(){
        return kapcSubTotal;
    }
    public void setkapcSubTotal(double kapcSubTotal){
        this.kapcSubTotal = kapcSubTotal;
    }
    public double getkapcIva(){
        return kapcIva;
    }
    public void setkapcIva(double kapcIva){
        this.kapcIva = kapcIva;
    }
     public double getkapcTotalU(){
        return kapcTotalU;
    }
    public void kapcTotalU(double kapcTotalU){
        this.kapcTotalU = kapcTotalU;
    }
    
    public void imprimir(){
        System.out.println("*** Factura ***" + 
                "Id: " + kapcIdFactura +
                "Datos Cliente: " + kapcDatosCliente + 
                "Metodo De Pago: " + kapcMetodoPago +
                "Sub Total: " + kapcSubTotal +
                "Iva: " + kapcIva + 
                "Total Unitario: " + kapcTotalU);
    }
                
}

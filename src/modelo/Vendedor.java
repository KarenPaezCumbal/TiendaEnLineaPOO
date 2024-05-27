/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class Vendedor {
    private int kapcIdVendedor;
    private String kapcNombres;
    private String kapcApellidos;
    private int kapcTelefono;
    private String kapcEmail;
    private String kapcDireccion;
    
    public Vendedor (){}
    
    public Vendedor(int kapcIdVendedor, String kapcNombres,String kapcApellidos, int kapcTelefono, String kapcEmail,String kapcDireccion){
        this.kapcIdVendedor=kapcIdVendedor;
        this.kapcNombres=kapcNombres;
        this.kapcApellidos=kapcApellidos;
        this.kapcTelefono=kapcTelefono;
        this.kapcEmail=kapcEmail;
        this.kapcDireccion=kapcDireccion;
       
    }
     public int getkapcIdVendedor(){
        return kapcIdVendedor;
    }
    public void setkapcIdVendedor(int kapcIdVendedor){
        this.kapcIdVendedor = kapcIdVendedor;
    }
     public String getkapcNombres(){
        return kapcNombres;
    }
    public void setkapcNombres(String kapcNombres){
        this.kapcNombres = kapcNombres;
    }
    public String getkapcApellidos(){
        return kapcApellidos;
    }
    public void setkapcApellidos(String kapcApellidos){
        this.kapcApellidos = kapcApellidos;
    }
    public int getkapcTelefono(){
        return kapcTelefono;
     }
    public void setkapcTelefono(int kapcTelefono){
        this.kapcTelefono = kapcTelefono;
    }
     public String getkapcEmail(){
        return kapcEmail;
    }
    public void setkapcEmail(String kapcEmail){
        this.kapcEmail = kapcEmail;
    }
    public String getkapcDireccion(){
        return kapcDireccion;
    }
    public void imprimir(){
        System.out.println("*** DATOS DEL Vendedor ***" + 
                "Id: " + kapcIdVendedor +
                "Nombres: " + kapcNombres + 
                "Apellidos: " + kapcApellidos +
                 "Teléfono: " + kapcTelefono +
                "Correo: " + kapcEmail +
                "Dirección: " + kapcDireccion);
    }
               
               
    
}

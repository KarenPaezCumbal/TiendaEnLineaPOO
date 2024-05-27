/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class Cliente {
    private int kapcIdCliente;
    private String kapcNombres;
    private String kapcApellidos;
    private String kapcEmail;
    private String kapcDireccion;
    private int kapcTelefono;
    private int kapcCedula;
    private boolean kapcCreditoDirecto;
    
    public Cliente (){}
    
    public Cliente(int kapcIdCliente, String kapcNombres,String kapcApellidos, String kapcEmail,String kapcDireccion, int kapcTelefono, int kapcCedula, boolean kapcCreditoDirecto ){
        this.kapcIdCliente=kapcIdCliente;
        this.kapcNombres=kapcNombres;
        this.kapcApellidos=kapcApellidos;
        this.kapcEmail=kapcEmail;
        this.kapcDireccion=kapcDireccion;
        this.kapcTelefono=kapcTelefono;
        this.kapcCedula=kapcCedula;
        this.kapcCreditoDirecto=kapcCreditoDirecto;     
    }
    public int getkapcIdCliente(){
        return kapcIdCliente;
    }
    public void setkapcIdCliente(int kapcIdCliente){
        this.kapcIdCliente = kapcIdCliente;
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
    public String getkapcEmail(){
        return kapcEmail;
    }
    public void setkapcEmail(String kapcEmail){
        this.kapcEmail = kapcEmail;
    }
    public String getkapcDireccion(){
        return kapcDireccion;
    }
    public void setkapcDireccion(String kapcDireccion){
        this.kapcDireccion = kapcDireccion;
    }
     public int getkapcTelefono(){
        return kapcTelefono;
     }
    public void setkapcTelefono(int kapcTelefono){
        this.kapcTelefono = kapcTelefono;
    }
    public int getkapcCedula(){
        return kapcCedula;
    }
    public void setkapcCedula(int kapcCedula){
        this.kapcTelefono = kapcCedula;
    }
    public boolean getkapcCreditoDirecto(){
        return kapcCreditoDirecto;
    }
    public void setkapcCreditoDirecto(boolean kapcCreditoDirecto){
        this.kapcCreditoDirecto = kapcCreditoDirecto;
    }

    public void imprimir(){
        System.out.println("*** DATOS DEL CLIENTE ***" + 
                "Id: " + kapcIdCliente +
                "Nombres: " + kapcNombres + 
                "Apellidos: " + kapcApellidos +
                "Correo: " + kapcEmail +
                "Dirección: " + kapcDireccion + 
                "Teléfono: " + kapcTelefono +
                "Cedula: " + kapcCedula +
                "Credito Directo: " + kapcCreditoDirecto);
    }
  
    
}

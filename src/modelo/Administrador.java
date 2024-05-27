/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class Administrador {
    private int kapcIdAdministrador;
    private String kapcNombres;
    private String kapcApellidos;
    private String kapcEmail;
    private int kapcTelefono;
    
    public Administrador(){}
    
    public Administrador(int kapcIdAdministrador, String kapcNombres,String kapcApellidos, String kapcEmail, int kapcTelefono){
        this.kapcIdAdministrador=kapcIdAdministrador;
        this.kapcNombres=kapcNombres;
        this.kapcApellidos=kapcApellidos;
        this.kapcEmail=kapcEmail;
        this.kapcTelefono=kapcTelefono;
    }
    
    public int getkapcIdAdministrador(){
        return kapcIdAdministrador;
    }
    public void setkapcIdAdministrador(int kapcIdAdministrador){
        this.kapcIdAdministrador = kapcIdAdministrador;
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
    public int getkapcTelefono(){
        return kapcTelefono;
    }
    public void setkapcTelefono(int kapcTelefono){
        this.kapcTelefono = kapcTelefono;
    }
    public void imprimir(){
        System.out.println("*** DATOS DEl Administrador ***" + 
                "Id: " + kapcIdAdministrador +
                "Nombres: " + kapcNombres + 
                "Apellidos: " + kapcApellidos +
                "Correo: " + kapcEmail +
                "Telefono" + kapcTelefono);
    }
}

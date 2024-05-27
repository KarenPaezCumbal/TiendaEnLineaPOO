/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class Producto {
     private int kapcIdProducto;
    private String kapcNombre;
    private String kapcMarca;
    private String kapcTalla;
    private String kapcTipo;
    private String kapcMaterial;
    private String kapcColor;
    private double kapcprecio;
    private int kapcStock;
 
    public Producto(){}
    
    public Producto(int kapcIdProducto, String kapcNombre,String kapcMarca, String kapcTalla, String kapcTipo, String kapcMaterial, String kapcColor, double kapcprecio, int kapcStock){
    this.kapcIdProducto = kapcIdProducto;
    this.kapcNombre = kapcNombre;
    this.kapcMarca = kapcMarca;
    this.kapcTalla = kapcTalla;
    this.kapcTipo = kapcTipo;
    this.kapcMaterial = kapcMaterial;
    this.kapcColor = kapcColor;
    this.kapcprecio = kapcprecio; 
    this.kapcStock = kapcStock;
    }
    
    public int getkapcIdProducto(){
        return kapcIdProducto;
    }
    
    public void setkapcIdProducto(int kapcIdProducto){
        this.kapcIdProducto = kapcIdProducto;
    }
    public String getkapcNombre(){
        return kapcNombre;
    }
    
    public void setkapcNombre(String kapcNombre){
        this.kapcNombre = kapcNombre;
    }
    public String getkapcMarca(){
        return kapcMarca;
    }
    
    public void setkapcMarca(String kapcMarca){
        this.kapcMarca = kapcMarca;
    }
    public String getkapcTalla(){
        return kapcTalla;
    }
    
    public void setkapcTalla(String kapcTalla){
        this.kapcTalla = kapcTalla;
    }
    public String getkapcTipo(){
        return kapcTipo;
    }
    
    public void setkapcTipo(String kapcTipo){
        this.kapcTipo = kapcTipo;
    }
    public String getkapcMaterial(){
        return kapcMaterial;
    }
    
    public void setkapcMateria(String kapcMaterial){
        this.kapcMaterial = kapcMaterial;
    }
    public String getkapcColor(){
        return kapcColor;
    }
    
    public void setkapcColor(String kapcColor){
        this.kapcColor = kapcColor;
    }
    public double getkapcprecio(){
        return kapcprecio;
    }
    
    public void setkapcprecio(double kapcprecio){
        this.kapcprecio = kapcprecio;
    }
    public int getkapcStock(){
        return kapcStock;
    }
    
    public void setkapcStock(int kapcStock){
        this.kapcStock = kapcStock;
    
    }   
public void imprimir(){
        System.out.println("*** DATO DEL PRODUCTO ***" + 
                "Id: " + kapcIdProducto +
                "Nombre: " + kapcNombre +
                "Marca: " + kapcMarca+
                "Talla: " + kapcTalla + 
                "Tipo: " + kapcTipo +
                "Material: " + kapcMaterial +
                "Color: " + kapcColor +
                "Precio: " + kapcprecio +
                "Stock: " + kapcStock);
}
}

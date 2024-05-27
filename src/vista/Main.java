/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Administrador;
import modelo.Factura;
import modelo.Cliente;
import modelo.Producto;
import modelo.Vendedor;

/**
 *
 * @author LENOVO
 */
public class Main {
    
    public static void main(String[] args) {
        final int numObjects = 10;
        
        Scanner es = new Scanner(System.in);
        
        Administrador[] nroAdministrador = new Administrador[numObjects];
        Cliente[]  nroCliente= new Cliente[numObjects];
        Factura[] nroFactura = new Factura[numObjects];
        Producto[] nroProductos = new Producto[numObjects];
        Vendedor[] nroVendedores = new Vendedor[numObjects];
        
        for(int i = 0; i < numObjects; i++){
            System.out.println("Ingrese datos del Administrador " + (i+1) + ": ");
            Administrador a = new Administrador (es.nextInt(), es.next(), es.next(), es.next(), es.nextInt());
            nroAdministrador[i] = a;
            
            System.out.println("Ingrese datos del Cliente " + (i+1) + ": ");
            Cliente b = new Cliente(es.nextInt(), es.next(), es.next(), es.next(), es.next(), es.nextInt(), es.nextInt(), es.nextBoolean());
            nroCliente[i] = b;
        
            System.out.println("Ingrese datos del Factura " + (i+1) + ": ");
            Factura c = new Factura(es.nextInt(), b, es.next(), es.nextInt(), es.nextInt(), es.nextInt());
            nroFactura[i] = c;
            
            System.out.println("Ingrese datos del Producto " + (i+1) + ": ");
            Producto d = new Producto(es.nextInt(), es.next(), es.next(), es.next(), es.next(), es.next(), es.next(), es.nextDouble(), es.nextInt());
            nroProductos[i] = d;
            
            System.out.println("Ingrese datos del Vendedores " + (i+1) + ": ");
            Vendedor e = new Vendedor(es.nextInt(), es.next(), es.next(), es.nextInt(), es.next(), es.next());
            nroVendedores[i] = e;
        }
        
    }
            
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo05;

import java.util.Scanner;

/**
 *
 * @author Jhonathan Sn
 */
public class Ejemplo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int respuestaCateogiraAsiento;
        int indiceAsientoDisponible;
        char respuestaMasPasajeros;
        Vuelo vuelo = new Vuelo();
       
        do{
            System.out.println("seleccione categoria a reservar");
            System.out.println("1.- primera clase");
            System.out.println("2.- economico");
            System.out.println("escriba la seleccion aquí: ");
            respuestaCateogiraAsiento = Integer.valueOf(scan.nextLine());

            Categoria categoria = Categoria.getCategoriaPorCodigo(respuestaCateogiraAsiento);
            indiceAsientoDisponible = vuelo.busacarAsientoDisponible(categoria);
            if (indiceAsientoDisponible != -1) {

                Pasajero pasajero = vuelo.registrarPasajero();
            Asiento asiento = vuelo.asignarPasajeroAAsiento(pasajero, indiceAsientoDisponible);
            vuelo.generarPaseDeAbordo(asiento);
            }
            
            else {
            vuelo.cambiarSeleccionCategoria(categoria);
            }
            
            System.out.println("desea ingresar mas pasajeros (s/n)");
            respuestaMasPasajeros = scan.nextLine().charAt(0);
        
        }while (respuestaMasPasajeros == 's');
        /*Pasajero pasajero1 = new Pasajero();
        pasajero1.setNombres("jonahtnas");
        pasajero1.setApellidos("sequen");
        pasajero1.setNumeroPasaporte("jonahtnas");
        pasajero1.setPaisPasaporte("guatemala");
        
        Pasajero pasajero3 = new Pasajero("jonathan", "sequen", "2323", "Guaetemala");
        System.out.println(pasajero3);*/
    }
   
       
   
}

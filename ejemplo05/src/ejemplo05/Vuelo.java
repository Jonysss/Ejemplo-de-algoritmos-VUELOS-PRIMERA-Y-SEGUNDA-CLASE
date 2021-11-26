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
public class Vuelo {
   
    private Asiento [] asientos = new Asiento[10];

    public Vuelo() {
        
        asientos = new Asiento[10];
        
        for (int i = Categoria.getPrimeraClase().getNumeroAsientoInicial() ; i < Categoria.getPrimeraClase().getNuemeroAsienoFinal(); i++){
            asientos[i] = new Asiento(i, Categoria.getPrimeraClase(), null);
        //System.out.println("indice " + i + ":" + asientos[i]);
        }
        for (int i = Categoria.getEconomico().getNumeroAsientoInicial() ; i < Categoria.getEconomico().getNuemeroAsienoFinal(); i++){
            asientos[i] = new Asiento(i, Categoria.getEconomico(), null);
        //System.out.println("indice " + i + ":" + asientos[i]);
    }
    }
    public int busacarAsientoDisponible(Categoria categoria){
         Asiento asiento;
         int indiceAsientoDisponible;
       for (int contadorAsiento = categoria.getNumeroAsientoInicial(); 
               contadorAsiento < categoria.getNuemeroAsienoFinal();
               contadorAsiento++){
           asiento = asientos[contadorAsiento];
           if (asiento.getPasajero() == null){
           indiceAsientoDisponible = contadorAsiento;
           return indiceAsientoDisponible; 
           }
       
       }
    return -1;
}
    public Pasajero registrarPasajero() {
    Scanner scan = new Scanner(System.in);
    Pasajero pasajero = new Pasajero();
    System.out.println("porfavor ingrese los siguentes datos del pasajer");
    System.out.println("nombres");
    pasajero.setNombres(scan.nextLine());
    System.out.println("apellidos");
    pasajero.setApellidos(scan.nextLine());
    System.out.println("numero de pasaporte");
    pasajero.setNumeroPasaporte(scan.nextLine());
    System.out.println("pais de pasaporte");
    pasajero.setPaisPasaporte(scan.nextLine());
    
    return pasajero;
    }
    
    public Asiento asignarPasajeroAAsiento(Pasajero pasajero, int indiceAsiento){
    
        asientos[indiceAsiento].setPasajero(pasajero);
        
        Asiento asiento = asientos[indiceAsiento];
        
        return asiento;
        
    }
    public void generarPaseDeAbordo(Asiento asiento){
    PaseDeAbordo paseDeAbordo = new PaseDeAbordo(asiento);
    paseDeAbordo.generarPaseDeAbordo();
    }
    public void cambiarSeleccionCategoria(Categoria categoria){
Scanner scan = new Scanner(System.in);
char respuestaCambioCategoria;
int indiceAsientoDisponible = -1;
do{
    System.out.println("no se han encontrado asientos disponibles en las categoria selleccionada " +
            "dedea realizar cambio de categoria (s/n)");
    respuestaCambioCategoria = scan.nextLine().charAt(0);

    if (respuestaCambioCategoria == 's'){
    indiceAsientoDisponible = procesarCambioCategoria(categoria);
    }
    else if (respuestaCambioCategoria == 'n') {

    System.out.println("el proximo vuelo sale en 3 horas");
    }
    
    }while (indiceAsientoDisponible == -1 && respuestaCambioCategoria == 's');
}
    
    private int procesarCambioCategoria (Categoria categoria) {
        
        int indiceAsientoDisponible;
    Categoria nuevaCategoria = Categoria.cambiarCategoria(categoria);
    indiceAsientoDisponible = busacarAsientoDisponible(nuevaCategoria);
    
    if (indiceAsientoDisponible != -1){
   Pasajero pasajero = registrarPasajero();
   Asiento asiento = asignarPasajeroAAsiento(pasajero, indiceAsientoDisponible);
   generarPaseDeAbordo(asiento);
    }
    return indiceAsientoDisponible;
    }
    }

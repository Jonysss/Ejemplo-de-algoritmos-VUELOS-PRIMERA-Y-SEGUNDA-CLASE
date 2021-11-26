/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo05;

/**
 *
 * @author Jhonathan Sn
 */
public class PaseDeAbordo {
private Asiento asiento;  

    public PaseDeAbordo(Asiento asiento) {
        this.asiento = asiento;
    }

public void generarPaseDeAbordo(){
   
       System.out.println("---------pase de abordo---------");
        System.out.println("Categoria del asiento: " + asiento.getCategoria().getNombre());
        System.out.println("numero  del pasajero: " + asiento.getNumero());
        System.out.println("Nombres del pasajero: " + asiento.getPasajero().getNombres());
        System.out.println("apelldios del pasajero: " + asiento.getPasajero().getApellidos());
        System.out.println("Numero de pasaaporte: " + asiento.getPasajero().getNumeroPasaporte());
        System.out.println("paid de origen del pasaporte: " + asiento.getPasajero().getPaisPasaporte());
       
        System.out.println("---------pase de afin---------");
        }
}

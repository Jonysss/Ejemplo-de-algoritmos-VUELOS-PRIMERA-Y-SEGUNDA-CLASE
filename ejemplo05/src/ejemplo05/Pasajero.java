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
public class Pasajero {
    
   private String nombres;
   private String apellidos;
   private String numeroPasaporte;
   private String paisPasaporte;

   public Pasajero() {
   
   }
    public Pasajero(String nombres, String apellidos, String numeroPasaporte, String paisPasaporte) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroPasaporte = numeroPasaporte;
        this.paisPasaporte = paisPasaporte;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroPasaporte() {
        return numeroPasaporte;
    }

    public void setNumeroPasaporte(String numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }

    public String getPaisPasaporte() {
        return paisPasaporte;
    }

    public void setPaisPasaporte(String paisPasaporte) {
        this.paisPasaporte = paisPasaporte;
    }
   @Override
   public String toString() {
   
   return "Nombre: " + this.nombres + "\nApellidos: " + this.apellidos +
           "\nNúmero Pasaporte: " + this.numeroPasaporte +
           "\nPaís Pasaporte: " + this.paisPasaporte;
   }
    
}

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
public class Asiento {
  private int numero;
  private Categoria categoria;
  private Pasajero pasajero;

    public Asiento(int numero, Categoria categoria, Pasajero pasajero) {
        this.numero = numero;
        this.categoria = categoria;
        this.pasajero = pasajero;
    }

  
  
    public int getNumero() {
        return numero + 1;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
  @Override
   public String toString() {
   
   return "Numero de asiento: " + (this.numero + 1) + 
           "\nCategoria: " + this.categoria.getNombre() +
           "\nDatos del pasajero\n: " + pasajero;}
}

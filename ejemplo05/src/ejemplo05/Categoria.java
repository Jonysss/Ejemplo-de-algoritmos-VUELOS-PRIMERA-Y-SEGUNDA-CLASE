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
public class Categoria {
   private int codigo;
   private int NumeroAsientoInicial;
   private int NuemeroAsienoFinal;
   private String nombre;
   private static final Categoria primeraClase = new Categoria(1, 0, 4, "primera clase");
    private static final Categoria economico = new Categoria(2, 5, 9, "Economico");

    private Categoria(int codigo, int NumeroAsientoInicial, int NuemeroAsienoFinal, String nombre) {
        this.codigo = codigo;
        this.NumeroAsientoInicial = NumeroAsientoInicial;
        this.NuemeroAsienoFinal = NuemeroAsienoFinal;
        this.nombre = nombre;
    }
   
   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroAsientoInicial() {
        return NumeroAsientoInicial;
    }

    public void setNumeroAsientoInicial(int NumeroAsientoInicial) {
        this.NumeroAsientoInicial = NumeroAsientoInicial;
    }

    public int getNuemeroAsienoFinal() {
        return NuemeroAsienoFinal;
    }

    public void setNuemeroAsienoFinal(int NuemeroAsienoFinal) {
        this.NuemeroAsienoFinal = NuemeroAsienoFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Categoria getPrimeraClase() {
        return primeraClase;
    }

    public static Categoria getEconomico() {
        return economico;
    }
   
   public static Categoria getCategoriaPorCodigo (int codigo){
   if (codigo == 1){
   return getPrimeraClase();
   }
   else if (codigo ==2){
   return getEconomico();
   }
   return null;
   }
   public static Categoria cambiarCategoria (Categoria categoria){
       if (categoria.getCodigo() == 1) {
       return getEconomico();
       }
       else if (categoria.getCodigo() == 2){
   return getPrimeraClase();
   }
       
       return null;
   }
}

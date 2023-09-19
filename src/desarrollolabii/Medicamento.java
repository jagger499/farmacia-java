/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrollolabii;

/**
 *
 * @author desarrollador
 */
public class Medicamento {
    private String nombre;
    private String tipo;
    private int cantidad;
    private String distribuidor;
    private boolean chkPrincipal;
    private boolean chkSecundario;

    public Medicamento(String nombre, String tipo, int cantidad, String distribuidor, boolean chkPrincipal, boolean chkSecundario) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.distribuidor = distribuidor;
        this.chkPrincipal = chkPrincipal;
        this.chkSecundario = chkSecundario;
    }
    
    public Medicamento() {}
    
      public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public boolean getChkPrincipal() {
        return chkPrincipal;
    }

    public boolean getChkSecundario() {
        return chkSecundario;
    }
       
    public void setChkPrincipal(boolean chkPrincipal) {
        this.chkPrincipal = chkPrincipal;
    }
    
    public void setChkSecundario(boolean chkSecundario) {
        this.chkSecundario = chkSecundario;
    }
    
    public String getTitle() {
        return "Pedido al distribuidor " + distribuidor;
    }
    
    public String getSubtitle() {
        return cantidad + " del medicamento " + tipo + " " + nombre;
    }
    
    public String getAddress() {
        String text = chkPrincipal && chkSecundario 
                ? "Calle de la Rosa n.28 y para la situada en Calle Alcazabilla n.3" :
                chkPrincipal ? "Calle de la Rosa n.28" :
                chkSecundario ? "Calle Alcazabilla n.3" : "";
        String address = "Para la farmacia situada en " + text;
        return address;
    }
}

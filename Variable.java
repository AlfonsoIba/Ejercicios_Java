
package ejercicios;

public class Variable {
    //Variables de la sesion de variables
    private boolean noVista = false;
    public boolean vista = true;
    private String var;
    
    //Variables de la sesion de clases y objetos
    public static String estatica = "Hola mundo";
    public final double finals = 3.14;

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public boolean isNoVista() {
        return noVista;
    }

    public boolean isVista() {
        return vista;
    }
    
    
}

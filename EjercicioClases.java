
package ejercicios;
/*
        Ejercicio 1
        * Crear una clase tipo final y una tipo abstract.
        * En la clase principal hacer una instancia a las clases acabadas de crear. (OK,Error)
        * En la clase principal colocar la palabra reservada extends y el nombre de las clases acabadas de crear. (OK,Error)
    
        Ejercicio 2
        * Crear una variable pública static y una final en la clase variable, explicar el funcionamiento.
    
        Ejercicio 3
        * Crear un método privado, un público y un protegido en la clase tipo final que devuelvan algun valor.
        * Crear un método que sea estático y otro final con cualquier modificador de acceso, que no devuelvan
        algun valor en la clase tipo final.
        * Crear un método que sea abstracto y público que devuelva un entero en la clase abstract.
    
        Ejercicio 4
        * Elegir un método de la clase tipo final, modificarlo para que reciba un párametro, este método será 
        para calcular el área de un cuadrado .
        * Crear una variable de clase en la clase principal.
        * Crear un método en la clase principal el cual servira para llamar al método que calula el área, en este
        mismo colocar el procedimiento para calcular el perimetro de dicha figura.
        * Llamar al método recien creado en el método main.
    
    */
public class EjercicioClases extends ClaseAbstracta{
    private static int lado = 5;
    public void procedimiento(){
        ClaseFinal instancia = new ClaseFinal();
        System.out.println("area: "+instancia.publico(lado));
        System.out.println("perimetro: "+lado*4);
    }

    @Override
    public int abstracto() {
        return 1;
    }
}

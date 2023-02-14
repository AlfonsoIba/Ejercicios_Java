
package ejercicios;
    /*
        
        Ejercicio 1
        * Declarar una variable que servira para guardar su nombre, una para su estatura y una para su IMC;
        * Declarar dos variables a la vez, una que servira para guardar su edad y otra para su peso. Inicializar ambas.
        
        Ejercicio 2
        * Asignar valores a las variables de nombre y estatura
        * Asignar una expresión que calcule el IMC a la variable IMC (para calcular el IMC es: peso/(altura*altura))
        
        Ejercicio 3
        * Declarar una variable tipo float que guardara la conversion de la variable IMC.
        * Declarar una variable y asignar su nombre, edad e IMC concatenados (ejem -> Nombre: Raul, Edad: 26, IMC: 25.34).
        
        Ejercicio 4
        * Declarar un array de tipo String para guardar las variables del ejercicio 1, las varibales que no son del
        mismo tipo deben de convertirlas a tipo String.
        
    */
public class EjercicioVariables {
    
    public void metodo(){
        String nombre;
        double estatura;
        double imc;
        int edad=27, peso=90;
        
        nombre = "Antonio";
        estatura = 1.73;
        imc = peso/(estatura*estatura);
        
        System.out.println("Nombre: "+nombre+" tu estatura es: "+estatura+" indice de masa corporal: "+ imc);
        
        float imc2 =(float) imc;
        String variable = "Nombre: "+nombre+", edad: "+edad+", indice de masa corporal: "+ imc2;
        System.out.println(variable);
        
        float peso2 = peso;
        System.out.println(peso2);
        
       
        String fuente;
        int destino;
        
        fuente = "3";
        destino = Integer.parseInt(fuente);
        System.out.println(destino);
        
        
        //Colocar nombre, estatura, imc
        String arreglo[] = new String[3];   //Declaración de arreglo con un tamaño
        String arreglo2[] = new String[2];  //Declaración de arreglo con un tamaño y llenado de valores a continuación
        arreglo2[0] = "Hola";
        arreglo2[1] = "Listo";
        String arreglo3[] = {"Ana","Juan","Maria"}; //Declaración de arreglo con asignación de valores
        
        //Llenado del primer arreglo mediante un for propuesto por un compañero de clase
        for(int i = 0; i < arreglo.length-1; i++){
            if(i==0){
                arreglo[i] = nombre;
            }else if(i==1)
                arreglo[i] = String.valueOf(estatura);
            else
                arreglo[i] = imc+"";
        }
        
        //imprimir primer arreglo
        
        for(int i = 0; i < arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
        System.out.println(" ");
        //imprimir segundo arreglo
        for(int i = 0; i < arreglo2.length; i++){
            System.out.println(arreglo2[i]);
        }
        System.out.println(" ");
        //imprimir tercer arreglo
        for(int i = 0; i < arreglo3.length; i++){
            System.out.println(arreglo3[i]);
        }
        
        for(int i = 0; i < arreglo.length; i++){
            if(i==0)
                arreglo[i] = nombre;
            if(i==1)
                arreglo[i] = String.valueOf(estatura);
            if(i==2)
                arreglo[i] = imc+"";
        }
        System.out.println(" ");
        for(int i = 0; i < arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
        
        /*
        Variable instancia = new Variable();
        System.out.println(instancia.vista);
        System.out.print(instancia.isNoVista());
        instancia.setVar("Hola");
        System.out.println(instancia.getVar());
        */
    }
}

// Comentario simple - Mi clase en Java
public class Variables {
    public static void main(String args[]){
        //Definición inicial de variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        //Modificación de variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
       
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        // Reasignación valor a variable Cadena
        miVariableCadena = "Adiós";
        System.out.println(miVariableCadena);
        
        //var - Inferencia de tipos en Java
        var miVariableEntera2 = 15;    
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Hola Mundo";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
        // Reglas definición de variables (valores permitidos):
        /*
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        var áVariable = 10; // No se recomienda utilizar
        //var #miVariable = 2; no se permite utilizar caracteres especiales
        */

        // Concatenación
        var usuario = "Juan";
        var titulo = "Ingeniero";
        
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i + j); // Se realiza suma de numeros (no recomendable usar acentos ni en comentarios)
        System.out.println(i + j + usuario);
        System.out.println(usuario + i + j); // Como primero encuentra una cadena, todo lo demás lo toma como una cadena
        System.out.println(usuario + (i + j)); // Los parentesis permiten modificar prioridades
    }
}

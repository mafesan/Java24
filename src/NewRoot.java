
//Programa que calcula la 
//raiz cuadrada de un numero pasado como argumento
//e imprime por pantalla el resultado

class NewRoot{
    public static void main(String[] arguments){
        String number = arguments[0];
        System.out.println("The square root of "
            + number
            + " is "
            + Math.sqrt(0) //¿Cómo convertir a Int un String?
        );
    }
}
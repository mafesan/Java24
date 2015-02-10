
//Programa que calcula la 
//raiz cuadrada de un numero pasado como argumento
//e imprime por pantalla el resultado

class NewRoot{
    public static void main(String[] args){
        int number = 100;
        if (args.length > 0) {
            number = Integer.parseInt(args[0]);
        }
        System.out.println("The square root of "
            + number
            + " is "
            + Math.sqrt(number) //¿Cómo convertir a Int un String?
        );
    }
}
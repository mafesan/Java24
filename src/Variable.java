class Variable {
    public static void main(String[] args) {
        int tops;
        float gradePointAverage;
        char key = 'C';
        String productName = "Larvets";
        byte escapeKey = 27;
        short roomNumber = 222;
        long salary = 264_000_000; //para facilitar legibilidad (segun v. Java)
        boolean gameOver = false;
        
        //Java distingue entre minúsculas y mayúsculas
        
        int allTimeHighScore;
        
        //Mal: int all-TimeHigh Score;
        //Mal: int all Time High Score;
        
        double pi = 3.14;
        int mileage = 300;
        int totalMileage = mileage;
        float nPi = 3.14F; //F indica float, si no Java asume que es un double
       
        //Variables globales:
        final int TOUCHDOWN = 6;
        final int FIELDGOAL = 3;
        final int PAT = 1;
        
        //Operadores: +, -, *, /, %
        double weight = 205;
        weight = weight + 10;
        
        weight = weight - 15;
        weight = weight / 3;
        
        int remainder = 245 % 3; //Calcula el resto (módulo)
        int total = 500 + (totalMileage * 12);
        
        //Incrementar y reducir
        int number = 15;
        number++;
        number--;
        ++number; //otra forma, diferencia entre prefijos y sufijos
        --number;
        /* Ejemplos de las diferencias:
        
        int x = 3;
        int answer = x++ * 10; //Resultado: 30, por ++ es un sufijo
        int answer = x * 10;
        x++; //las ultimas dos lineas son equivalentes a las anteriores
        
        int x = 3;
        int answer = ++x * 10; /(Resultado: 40, porque ++x es prefijo
        x++;
        int answer = x * 10;
        
        Esto son atajos, tambien podemos usar
        x = x + 1;
        y = y + 1;
        
        */
        
        
        
        
        
        
        
        
        
    }
}
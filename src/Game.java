class Game {
    public static void main(String[] arguments) {
        int total = 0;
        int score = 7;
        if (score == 7) {
            System.out.println("You score a touchdown");
        }
        if (score == 3) {
            System.out.println("You kick a field goal");
        }
        total = total + score;
        System.out.println("total score: " + total);
        
        int playerScore = 12000;
        int playerLives = 3;
        int difficultyLevel = 10;
        
        if (playerScore > 9999) {
            playerLives++;
            System.out.println("Extra Life!");
            difficultyLevel += 5;
            System.out.println("New Difficulty: " + difficultyLevel);
            
        /*
            Notas:
            Se pueden usar los operadores == y != con todos los tipos
            de variables menos con cadenas.
            
            Una instrucción if no requiere una instrucción de bloque.
            Puede ocupar una sola línea:
            if (account <= 0) System.out.println("No more money");
            
        */
        }
    }
}

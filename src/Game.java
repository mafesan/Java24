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
        }   
        /*
            Notas:
            Se pueden usar los operadores == y != con todos los tipos
            de variables menos con cadenas.
            
            Una instrucción if no requiere una instrucción de bloque.
            Puede ocupar una sola línea:
            if (account <= 0) System.out.println("No more money");
            
        */
            
         int answer = 17;
         int correctAnswer = 13;
         
         if (answer == correctAnswer) {
             score += 10;
             System.out.println("That's right. You get 10 points");
         } else {
             score -= 5;
             System.out.println("Sorry, that's wrong. You lose 5 points");
         }
         
        char grade = 'B';
         
        if (grade == 'A') {
            System.out.println("You got an A. Great job!");
        } else if (grade == 'B') {
            System.out.println("You got a B. Good work!");
        } else if (grade == 'C') {
            System.out.println("You got a C. What went wrong?");
        } else {
            System.out.println("You got a F. You'll do well in Congress!");
        }
        
         
         //Otra forma: Switch
         
        char grade2 = 'A';
        switch (grade2) {
            case 'A':
                System.out.println("You got an A. Great job!");
                break;
            case 'B':
                System.out.println("You got a B. Good work!");
                break;
            case 'C':
                System.out.println("You got a C. What went wrong?");
                break;
            default:
                System.out.println("You got a F. You'll do well in Congress!");
         }
    }
}

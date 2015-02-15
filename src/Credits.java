class Credits {

    public static void main(String[] args) {
        //Definir información sobre la película
        String name = "credits";
        String title = "Interstellar";
        int year = 2014;
        String director = "Christopher Nolan";
        String role1 = "Cooper";
        String actor1 = "Matthew McGonnahey";
        String role2 = "Brand";
        String actor2 = "Anne Hathaway";
        String role3 = "Murph";
        String actor3 = "Jessica Chastain";
        String role4 = "Professor Brand";
        String actor4 = "Michael Caine";
        //Mostrar información
        String newName = name.toUpperCase();
        //Otra opcion: string.toLowerCase();
        //En Java, las cadenas no cambian de valor una vez creadas
        System.out.println(newName);
        System.out.println(title + " (" + year + ") \n" +
            "A " + director + " film. \n\n"
            + role1 + "\t" + actor1 + "\n"
            + role2 + "\t" + actor2 + "\n"
            + role3 + "\t" + actor3 + "\n"
            + role4 + "\t" + actor4);
        
        System.out.println("\n\nThe name " + title + " has " +
            title.length() + " letters");
        
        char searchChar = 'w';
        System.out.println("\nThe name " + actor1 + " has the letter "
            + searchChar + " in position " + actor1.indexOf(searchChar));
        
        String guess = "Tom Cruise";
        System.out.println("\nIs " + role1 + " role played by " + guess + "?");
        System.out.println("Answer: " + actor1.equals(guess));
    }
}

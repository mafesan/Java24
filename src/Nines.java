class Nines {
    public static void main(String[] arguments) {
        for (int dex = 1; dex <= 200; dex++) {
            int multiple = 9 * dex;
            System.out.print(multiple + " ");
        }
        
        int index = 0;
        while (index <= 1000) {
            index += 5;
            if (index == 400)
                continue;
            System.out.println("The index is " + index);
        }
    }
}
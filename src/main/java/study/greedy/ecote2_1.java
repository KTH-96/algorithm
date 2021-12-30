package study.greedy;

public class ecote2_1 {
    public static void main(String[] args) {
        int size = 5;
        String command = "R R R U D D";

        int x = 1;
        int y = 1;
        String[] commandWord = command.split(" ");
        for (int i = 0; i < commandWord.length; i++) {
            if (commandWord[i].equals("R")) {
                if (y == 5){
                    continue;
                }
                y++;
            } else if (commandWord[i].equals("L")) {
                if (y == 1){
                    continue;
                }
                y--;
            }else if (commandWord[i].equals("U")) {
                if (x == 1){
                    continue;
                }
                x--;
            }else if (commandWord[i].equals("D")) {
                if (x == 5){
                    continue;
                }
                x++;
            }
            System.out.println(x + " " + y);
        }
    }
}

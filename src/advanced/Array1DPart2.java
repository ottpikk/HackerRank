package advanced;

import java.util.Scanner;


public class Array1DPart2 {


    static class Player{
        int currentPosition = 0;
        int[]game;
        int leap;
        boolean winnable = false;
        public Player(int leap, int[]game){
            this.leap = leap;
            this.game = game;
        }

        public void moveForward(){
            if (game[currentPosition + 1] == 0){
                currentPosition++;
                tick();
            }
        }
        public void moveBackwards(){
            if ((currentPosition - 1) >= 0 && game[currentPosition - 1] == 0){
                game[currentPosition] = 1;
                currentPosition--;
                tick();
            }
        }
        public void jump(){
            if ((currentPosition + leap) < game.length){
                if (game[currentPosition + leap] == 0){
                    int oldPosition = currentPosition;
                    currentPosition += leap;
                    tick();
                    currentPosition = oldPosition;
                }
            }
        }
        public void tick(){
            if (currentPosition == (game.length - 1) || ((currentPosition + leap) >= game.length)){
                winnable = true;
            } else {
                this.moveForward();
                if (leap != 0){
                    this.jump();
                }
                this.moveBackwards();
            }
        }
    }

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.

        Player game1 = new Player(leap, game);
        game1.tick();
        return game1.winnable;

    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}


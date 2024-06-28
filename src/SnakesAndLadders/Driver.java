package SnakesAndLadders;

import SnakesAndLadders.Entities.Game;
import SnakesAndLadders.Entities.Player;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Dice");
        int diceCount=sc.nextInt();
        System.out.println("Enter the Dimension of the Board");
        int dim=sc.nextInt();

        Game game=new Game(diceCount,dim);
        System.out.println("Enter the number of players to be added");
        int numPlayers=sc.nextInt();

        System.out.println("Enter the firstname of the players");
        for(int i=0;i<numPlayers;i++){
            String name=sc.next();
            Player player=new Player(name);
            game.addPlayers(player);
        }
        game.launchGame();
    }
}

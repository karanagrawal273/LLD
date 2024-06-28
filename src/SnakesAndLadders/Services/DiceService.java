package SnakesAndLadders.Services;

public class DiceService {

    public static int  rollDice(int diceCount){
        int minNum=1;
        int maxNum=diceCount*6;
        int val= (int)Math.floor(Math.random()*(maxNum-minNum+1))+minNum;
        System.out.println("Dice rolls and get a value "+val);
        return val;
    }
}

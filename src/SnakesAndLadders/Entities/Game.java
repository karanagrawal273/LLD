package SnakesAndLadders.Entities;

import SnakesAndLadders.Services.DiceService;

import java.util.LinkedList;
import java.util.Queue;

public class Game {
    private Queue<Player>players;
    private Queue<Player>winners;
    private int dim,size,diceCount;
    Board board;

    public Game(int diceCount,int dim){
        this.players=new LinkedList<Player>();
        this.winners=new LinkedList<Player>();
        this.diceCount=diceCount;
        this.dim=dim;
        this.size=dim*dim;
        this.board=new Board(dim);
    }

    public void movePlayer(Player player,int diceCount){
        int value= DiceService.rollDice(diceCount);
        int newPos=player.getPos()+value;
        System.out.println(player.getName()+" moves to "+newPos);
        if(newPos<=this.size){
            if(board.isSnakeOrLadder(newPos)){
                BoardEntity boardEntity=board.elements.get(newPos);
                System.out.println(boardEntity.getMessage());
                newPos=boardEntity.getEnd();
                System.out.println(player.getName()+" moves to "+newPos);
            }
            player.setPos(newPos);
        }
        else{
            System.out.println(player.getName()+" ,can't move outside of the board");
        }
    }

    public void addPlayers(Player player){
        this.players.add(player);
    }

    public void launchGame(){
        while(players.size()>1){
            Player currPlayer=players.poll();
            System.out.println("Current player is "+currPlayer.getName());
            movePlayer(currPlayer,diceCount);

            if(currPlayer.getPos()==size){
                System.out.println(currPlayer.getName()+" ,you won the game");
                winners.add(currPlayer);
            }
            else{
                players.add(currPlayer);
            }
        }
    }

}

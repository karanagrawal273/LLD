package SnakesAndLadders.Entities;

public class Player {
    String name;
    int pos;

    public Player(String name){
        this.name=name;
        this.pos=0;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getPos(){
        return pos;
    }

    public void setPos(int pos){
        this.pos=pos;
    }


}
package SnakesAndLadders.Entities;

public class Ladder extends BoardEntity{

    public Ladder(int st,int end){
        super(st,end);
    }

    @Override
    public String getMessage() {
        return "Got a Ladder";
    }
}

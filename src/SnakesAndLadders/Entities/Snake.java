package SnakesAndLadders.Entities;

public class Snake extends BoardEntity{
    public Snake(int st,int end){
        super(st,end);
    }

    @Override
    public String getMessage() {
        return "Got a Snake";
    }
}

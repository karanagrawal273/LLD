package SnakesAndLadders.Entities;

public class BoardEntity {
    private int st,end;

    public BoardEntity(int st,int end){
        this.st=st;
        this.end=end;
    }

    public int getSt(){
        return st;
    }
    public void setSt(int st){
        this.st=st;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getMessage(){
        return null;
    }
}

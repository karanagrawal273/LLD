package SnakesAndLadders.Entities;

import java.util.HashMap;
import java.util.Map;

public class Board {
     int size;
     HashMap<Integer,BoardEntity>elements;

    public int randomValueGenerator(int minNum,int maxNum){
        return (int)Math.floor(Math.random()*(maxNum-minNum+1))+minNum;
    }
    public Boolean isSnakeOrLadder(int pos){
        return elements.containsKey(pos);
    }
    public Board(int dim){
        this.size=dim*dim;
        elements=new HashMap<Integer,BoardEntity>();

        for(int i=0;i<dim;i++){

            //Adding a ladder at random position
            int minNum=2,maxNum=size-1;
            int start=randomValueGenerator(minNum,maxNum);
            minNum=start+1;
            int end=randomValueGenerator(minNum,maxNum);
            if(!isSnakeOrLadder(start)){
                elements.put(start,new Ladder(start,end));
            }

            //Adding a snake at random position
            minNum=2;
            maxNum=size-1;
            start=randomValueGenerator(minNum,maxNum);
            maxNum=start-1;
            end=randomValueGenerator(minNum,maxNum);
            if(!isSnakeOrLadder(start)){
                elements.put(start,new Snake(start,end));
            }
        }
    }
}

public class waterBottle {

    int volume;

    public waterBottle(){
        this.volume = 100;
        }


    public int getVolume(){
        return this.volume;
    }

    public int haveADrink(){
        this.volume -= 10;
        return this.volume;
    }

    public int emptyBottle(){
        this.volume = 0;
        return this.volume;
    }

    public int bottleIsFull(){
        this.volume = 100;
        return this.volume;
    }



}

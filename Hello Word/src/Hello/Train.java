package Hello;

public class Train extends  Transport{
    Train(){
        this.name = "Train";
    }
    void run(){
        System.out.println(this.name + " move on Road");
    }
}

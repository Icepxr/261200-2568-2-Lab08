public class dob implements Runnable {
    public int posx;
    public int posy;
    public String color;
    public int round;

    public dob(int posx,int posy,int round,String color){
        this.posx = posx;
        this.posy = posy;
        this.color = color;
        this.round = round;
    }
    public void run(){
        Turtle job = new Turtle();
        job.width(1);
        job.up();
        job.setPosition(posx,posy);
        job.speed(2);
        job.penColor(color);
        job.down();
        job.width(4);
        for(int i=0;i<round;i++) {
            job.forward(i/25.);
            job.left(5);

        }

    }
}

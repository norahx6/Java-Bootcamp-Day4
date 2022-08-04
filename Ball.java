package Day4;

public class Ball {
    public static void main(String[] args) {


        Ball ball1 = new Ball( '1', '2',6,'5','6');
        System.out.println(ball1.toString());


    }
    private float x;
    private float y;
    private int redius;
    private float xDalta;
    private float yDelta;

    public Ball (float x ,float y , int redius,float xDalta, float yDelta){
    this.x=x;
    this.y=y;
    this.redius=redius;
    this.xDalta=xDalta;
    this.yDelta=yDelta;
    }

    public float getX (){
        return x;
    }
    public void setX(float x){
        this.x=x;
    }

    public float getY(){
        return y;
    }
    public void setY(float y){
        this.y=y;
    }

    public int getRedius(){
        return redius;
    }
    public void setRedius(int redius){
        this.redius=redius;
    }

    public float getxDalta(){
        return xDalta;
    }
    public void setxDalta(float xDalta){
        this.xDalta=xDalta;
    }

    public float getyDelta(){
        return yDelta;
    }
    public void setyDelta(float yDelta){
        this.yDelta=yDelta;
    }

    public void move(){
        x = x + xDalta;
        y= y = yDelta;
    }

    public void reflectHorizontal(){
        xDalta=-xDalta;
    }
    public void reflectVertical(){
        yDelta= -yDelta;
    }
    @Override
    public String toString(){
        return "Ball ("+x+" , "+y+" )"+" "+ "Speed ("+" "+xDalta+" ," + yDelta+ " )";
    }
}


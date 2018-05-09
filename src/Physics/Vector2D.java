package Physics;

public class Vector2D {

    //------------------------------------------------------------------------------------------------------------------
    public float x = 0.0f;
    public float y = 0.0f;
    //------------------------------------------------------------------------------------------------------------------
    public Vector2D() {
    }

    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    //------------------------------------------------------------------------------------------------------------------

    public void printVector(String name){
        //System.out.print( name + "Vector : ( "+ vec.x+" , " + vec.y +" ) ");
        System.out.printf(" %s Vector : ( %7.03f , %7.03f ) ",name,x,y);
    }
}

package Physics;

public class ProblemA {
    final static Vector2D gravity = new Vector2D(0.0f,-9.8f);
    final static float timestep = 0.2f;
    public static void run (){
        Vector2D velocity = new Vector2D(30.0f,0.0f);// Start Velocity
        float startAngle = 60;
        velocity = Vector2DMaths.rotByTheta(velocity,startAngle); // Rotate the start velocity by start angle
        Vector2D position = new Vector2D(0.0f,0.0f);//Start Position

        while(position.y>=0){
            velocity=calcVector(velocity,gravity,timestep);


            position = Vector2DMaths.addVectors(position,velocity);

            if (position.y>=0) {
                velocity.printVector("Velocity");
                position.printVector("position");
                System.out.print("\n");
            } else {
            }
        }

    }

    public static Vector2D calcVector(Vector2D velocity , Vector2D acceleration, float timestep){

        Vector2D ret = new Vector2D();

        // Vret = Vstart + Vaccel * timestep
        acceleration = Vector2DMaths.mulByScaler(acceleration,timestep); // Vaccel * timestep
        ret = Vector2DMaths.addVectors(velocity,acceleration);



        return ret;
    }


}


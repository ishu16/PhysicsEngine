package Physics;

public class Vector2DMaths {

    /**
     * Vector addition
     */
    public static Vector2D addVectors(Vector2D vec1, Vector2D vec2)
    {

        Vector2D vecResult2D = new Vector2D();

        vecResult2D.x = vec1.x + vec2.x;
        vecResult2D.y = vec1.y + vec2.y;

        return vecResult2D;
    }

    /**
     * Vector subtraction
     */
    public static Vector2D subVectors(Vector2D vec1, Vector2D vec2)
    {

        Vector2D vecResult2D = new Vector2D();

        vecResult2D.x = vec1.x - vec2.x;
        vecResult2D.y = vec1.y - vec2.y;

        return vecResult2D;
    }

    /**
     * Dot Product
     */

    public static float dotVectors(Vector2D vec1, Vector2D vec2)
    {
        // calculating the dot product and returning it
        return (vec1.x * vec2.x) + (vec1.y * vec2.y) ;

    }

    /**
     * multiply from a scaler
     */
    public static Vector2D mulByScaler (Vector2D vec , float scaler){

        Vector2D retVector = new Vector2D();

        retVector.x = vec.x * scaler;
        retVector.y = vec.y * scaler;

        return retVector;

    }

    public static Vector2D rotByTheta(Vector2D vec, float angle){

        float angRad =(float) Math.toRadians(angle);
        Vector2D ret = new Vector2D();

        ret.x = vec.x *(float)Math.cos(angRad) - vec.y*(float)Math.sin(angRad);
        ret.y = vec.x*(float)Math.sin(angRad) + vec.y*(float)Math.cos(angRad);

        return ret;
    }



}

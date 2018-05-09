package Physics;

public class Vector3DMaths {

    /**
     * Vector addition
     */
    public static Vector3D addVectors(Vector3D vec1, Vector3D vec2)
    {

        Vector3D vecResult3D = new Vector3D();

        vecResult3D.x = vec1.x + vec2.x;
        vecResult3D.y = vec1.y + vec2.y;
        vecResult3D.z = vec1.z + vec2.z;

        return vecResult3D;
    }

    /**
     * Vector subtraction
     */
    public static Vector3D subVectors(Vector3D vec1, Vector3D vec2)
    {

        Vector3D vecResult3D = new Vector3D();

        vecResult3D.x = vec1.x - vec2.x;
        vecResult3D.y = vec1.y - vec2.y;
        vecResult3D.z = vec1.z - vec2.z;

        return vecResult3D;
    }

    /**
     * Dot Product
     */
    public static float dotVectors(Vector3D vec1, Vector3D vec2)
    {
        // calculating the dot product and returning it
        return (vec1.x * vec2.x) + (vec1.y * vec2.y) + (vec1.z * vec2.z);

    }
}

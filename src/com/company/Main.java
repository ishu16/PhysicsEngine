package com.company;
/*

import Physics.ProblemA;
import Physics.Vector2D;
import Physics.Vector2DMaths;
*/

import java.util.Scanner;

public class Main{

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // write your code here

        //*
        // ProblemA.run();
        //*/
        /*
        Vector2D newVec = new Vector2D(30.0f,0.0f);
        newVec = Vector2DMaths.rotByTheta(newVec,30);
        newVec.printVector("Rotated ");
        //*/
    }

    public static void test(){
        while(true){
            System.out.println("Enter 1 to test 2D Vector Math Functions");
            System.out.println("Enter 2 to test 3D Vector Math functions");
            int in = sc.nextInt();

            if(in == 1){
                //Testing 2D Functions
                System.out.println("Select the function to test");
                System.out.println("1 : 2D Vector Addition");
                System.out.println("2 : 2D Vector Subtraction");
                System.out.println("3 : 2D Vector Dot product");
                System.out.println("4 : 2D Vector Unit normal");
                System.out.println("5 : 2D Vector Rotation");
                System.out.println("6 : 2D Vector Magnitude");
                System.out.println("7 : 2D Vector Scaler Multiple");
                System.out.println("8 : Velocity Vector from speed and launch angle");
                in = sc.nextInt();
                switch (in){
                    case 1 : // 2D Vector Addtion

                        break;
                    case 2 : // 2D Vector Subtraction

                        break;
                    case 3 : // 2D Vector Dot product

                        break;

                    case 4: // 2D Vector Unit normal - vectorX/|vectorX|
                        // |vectorx| - > Magnitude of 2D Vector

                       /* public static Vector2D normalVector(Vector2D vector) {
                        float a = (float)Math.sqrt((vector.x * vector.x) + (vector.y * vector.y));
                        Vector2D normalVector = new Vector2D(vector.x / a,vector.y / a);
                        return normalVector;*/

                         break;

                    case 5: // 2D Vector Rotation
                        break;

                    case 6: // 2D Vector Magnitude
                        break;

                    case 7: // 2D Vector Scaler Multiple
                        break;

                    case 8: // 2D Velocity Vector from speed and launch angle
                       // velocity_X = vlcty*cos(angle)
                        //velocity_Y = vlcty*sin(angle)

                     /*   public static Vector2D velocityVector(Vector2D , double speed, double angle) {
                        double VVX = speed * Math.cos(angle);  //velocity vector x
                        double VVY = speed * Math.sin(angle);  //velocity vector y

                        Vector2D velocityVector = new Vector2D((float)VVX,(float)VVY);
                        return velocityVector;
                    }
                        break;*/
                }

            }else if(in ==2){
                //Testing 3D Functions

                    System.out.println("Select the function to test");
                    System.out.println("1 : 3D Vector Addition");
                    System.out.println("2 : 3D Vector Subtraction");
                    System.out.println("3 : 3D Vector Dot product");
                    System.out.println("4 : 3D Vector Unit normal");
                    System.out.println("5 : 3D Vector Magnitude");
                    System.out.println("6 : 3D Vector Scaler Multiple");
                    in = sc.nextInt();
                    switch (in){
                        case 1 : // 3D Vector Addtion

                            break;
                        case 2 : // 3D Vector substraction

                            break;
                        case 3 : // 3D Vector Dot Product

                            break;
                        case 4: // 3D Vector Unit normal
                            // |vector| - > Magnitude of 3D Vector

                         /*   public static Vector3D normalVector(Vector3D vector) {
                            float i = (float)Math.sqrt((vector_1.x * vector_1.x) + (vector_1.y * vector_1.y) + (vector_1.z * vector_1.z));
                            Vector3D normalVector = new Vector3D(vector_1.x / i,vector_1.y / i,vector_1.z / i);
                            return normalVector;*/

                            break;

                        case 5:   // 3D Vector Magnitude

                            break;

                        case 6:  // 3D Vector Scaler Multiple

                            break;

                    }

                }

        }
    }
}
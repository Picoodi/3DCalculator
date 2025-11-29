import java.lang.Math;
import java.util.Vector;

public class Vector_Functions {

    static double magnitude_of_vector(Vectors vector){
        return java.lang.Math.sqrt(Math.pow(vector.x ,2) + Math.pow(vector.y, 2) + Math.pow(vector.z, 2));
    }

    static void multiply_vector(Vectors vector, double number){
        vector.x = vector.x * number;
        vector.y = vector.y * number;
        vector.z = vector.z * number;
    }

    static void negative_vector(Vectors vector){
        vector.x = vector.x * -1;
        vector.y = vector.y * -1;
        vector.z = vector.z * -1;
    }

    static Vectors add_vectors(Vectors vector1, Vectors vector2, String name){
        return new Vectors(name,
                vector1.x + vector2.x,
                vector1.y + vector2.y,
                vector1.z + vector2.z);
    }

    static Vectors subtract_vectors(Vectors vector1, Vectors vector2, String name){
        return new Vectors(name,
                vector1.x - vector2.x,
                vector1.y - vector2.y,
                vector1.z - vector2.z);
    }
}

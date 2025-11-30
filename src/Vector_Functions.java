import java.lang.Math;


public class Vector_Functions {

    static double magnitude_of_vector(Vectors vector){
        return java.lang.Math.sqrt(Math.pow(vector.x ,2) + Math.pow(vector.y, 2) + Math.pow(vector.z, 2));
    }

    static Vectors vector_between_points(Point point1, Point point2, String name){
        return new Vectors( name,
                point2.x - point1.x,
                point2.y - point1.y,
                point2.z - point1.z);
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

    static double scalar_product(Vectors vector1, Vectors vector2) {
        return vector1.x * vector2.x + vector1.y * vector2.y + vector1.z * vector2.z;
    }

    static Vectors cross_product( Vectors vector1, Vectors vector2, String name){
        return new Vectors(name,
                vector1.y * vector2.z - vector1.z * vector2.y,
                vector1.z * vector2.x - vector1.x * vector2.z,
                vector1.x * vector2.y - vector1.y * vector2.x);
    }
}

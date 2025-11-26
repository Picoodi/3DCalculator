
public class Vectors {
    String name;
    float x;
    float y;
    float z;

    public Vectors(String Name, float x_coordinate, float y_coordinate, float z_coordinate){
        this.name = Name;
        this.x = x_coordinate;
        this.y = y_coordinate;
        this.z = z_coordinate;
    }

    void info(){
        System.out.println("Name:" + this.name + " | Coordinates: " + x + "|" + y + "|" + z + " | Type: Vector");
    }
}

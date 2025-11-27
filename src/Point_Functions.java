import java.util.Objects;

public class Point_Functions {

    static Point mirror_point(String mirror, Point point, Point mirror_point, String new_name){
        // we check which plane it is and change the coordinates accordingly
        // For origin ist the mirror then every coordinate times -1
        if (Objects.equals(mirror, "o")){
            float new_x = point.x * -1;
            float new_y = point.y * -1;
            float new_z = point.z * -1;
            return new Point(new_name, new_x,new_y,new_z);
        }
        else if (Objects.equals(mirror, "xy")) {
            float new_z = point.z * -1;
            return new Point(new_name,point.x,point.y,new_z);
        }
        else if(Objects.equals(mirror, "xz")){
            float new_y = point.y * -1;
            return new Point(new_name, point.x, new_y, point.z);
        }
        else if (Objects.equals(mirror, "yz")) {
            float new_x = point.x * -1;
            return new Point(new_name,new_x,point.y,point.z);

        }
        else if(Objects.equals(mirror, "x")){
            float new_y = point.y * -1;
            float new_z = point.z * -1;
            return new Point(new_name, point.x, new_y, new_z);
        }
        else if(Objects.equals(mirror, "y")){
            float new_x = point.x * -1;
            float new_z = point.z * -1;
            return new Point(new_name, new_x, point.y, new_z);
        }
        else if(Objects.equals(mirror, "z")){
            float new_x = point.x * -1;
            float new_y = point.y * -1;
            return new Point(new_name, new_x, new_y, point.z);
        }
        else if(Objects.equals(mirror, "point") && mirror_point != null){
            //We calculate the vector between the points double it and add it to the point that needs to be mirrored
            float new_x = point.x + (2*(mirror_point.x - point.x));
            float new_y = point.y + (2*(mirror_point.y - point.y));
            float new_z = point.z + (2*(mirror_point.z - point.z));
            return new Point(new_name, new_x, new_y, new_z);
        }
        else{
        System.out.println("Sry your mirror is not defined. See the help page for more infos.");
        return null;
        }
    }

}

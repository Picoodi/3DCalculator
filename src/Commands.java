import java.awt.*;
import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;
import java.util.function.DoubleToIntFunction;

/*
With this class we get the specific user input required for further functions.
And for better reuse of those functions the parameters for those are getting
asked before when we actually need to user to input the parameters
 */

public class Commands {
    static void reset(){
        Main.points_list.clear();
        Main.vectors_list.clear();
    }

    static void point() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("name = ");
            String name = scanner.nextLine();

            System.out.print("x = ");
            float x = Float.parseFloat(scanner.nextLine());

            System.out.print("y = ");
            float y = Float.parseFloat(scanner.nextLine());

            System.out.print("z = ");
            float z = Float.parseFloat(scanner.nextLine());

            //Here we directly create the object
            Point point = new Point(name, x, y, z);
            Main.points_list.add(point);


        } catch (NumberFormatException e) {
            System.out.println("There has been a problem with your input.");
        }
    }

    static void show_point(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("name = ");
        String name = scanner.nextLine();

        for (Point p : Main.points_list){
            if (Objects.equals(p.name, name)){
                p.info();
            }
        }
    }

    static void delete_point(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("name = ");
        String name = scanner.nextLine();

        for (int i = 0; i < Main.points_list.size(); i++){
            Point p = Main.points_list.get(i);
            if (Objects.equals(p.name, name)){
                Main.points_list.remove(p);
                System.out.println("Point got deleted");
            }
        }
    }

    static void rename_point(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("old name = ");
        String old_name = scanner.nextLine();

        System.out.print("new name = ");
        String new_name = scanner.nextLine();

        for (int i = 0; i < Main.points_list.size(); i++){
            Point p = Main.points_list.get(i);
            if (Objects.equals(p.name, old_name)){
                p.name = new_name;
                System.out.println("Point got renamed");
            }
        }
    }

    static void all_points(){
        for (Point p : Main.points_list) {
            p.info();
        }
    }

    static void mirror_point(){
        Scanner scanner = new Scanner(System.in);
        Point point = null;
        Point mirror_point = null;

        try {
            System.out.print("name of point = ");
            String name = scanner.nextLine();

            for (int i = 0; i < Main.points_list.size(); i++){
                Point p = Main.points_list.get(i);
                if (Objects.equals(p.name, name)){
                    point = Main.points_list.get(i);
                }
            }


            System.out.print("new name of mirrored point = ");
            String new_name = scanner.nextLine();

            System.out.print("Mirror = ");
            String mirror = scanner.nextLine();


            if(Objects.equals(mirror, "point")){
                System.out.print("name of the mirror point = ");
                String name_mirror_point = scanner.nextLine();

                for (int i = 0; i < Main.points_list.size(); i++){
                    Point p = Main.points_list.get(i);
                    if (Objects.equals(p.name, name_mirror_point)){
                        mirror_point = Main.points_list.get(i);
                    }
                }

            }
            Point Mirror_Point = Point_Functions.mirror_point(mirror,point,mirror_point, new_name);
            if( Mirror_Point != null)
                Main.points_list.add(Mirror_Point);

        } catch (NumberFormatException e) {
            System.out.println("There has been a problem with your input.");
        }
    }

    static void position_vector(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("name of point = ");
        String point_name = scanner.nextLine();

        System.out.print("name for vector = ");
        String vector_name = scanner.nextLine();

        for (int i = 0; i < Main.points_list.size(); i++){
            Point p = Main.points_list.get(i);
            if (Objects.equals(p.name, point_name)){
                //Here we directly create the object
                Vectors vector = new Vectors(vector_name, p.x, p.y, p.z);
                Main.vectors_list.add(vector);
            }
        }

    }

    static void vector(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("name = ");
            String name = scanner.nextLine();

            System.out.print("x = ");
            float x = Float.parseFloat(scanner.nextLine());

            System.out.print("y = ");
            float y = Float.parseFloat(scanner.nextLine());

            System.out.print("z = ");
            float z = Float.parseFloat(scanner.nextLine());

            //Here we directly create the object
            Vectors vector = new Vectors(name, x, y, z);
            Main.vectors_list.add(vector);


        } catch (NumberFormatException e) {
            System.out.println("There has been a problem with your input.");
        }
    }

    static void vector_points(){
        return;
    }

    static void delete_vector(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("name = ");
        String name = scanner.nextLine();

        for (int i = 0; i < Main.vectors_list.size(); i++){
            Vectors v = Main.vectors_list.get(i);
            if (Objects.equals(v.name, name)){
                Main.vectors_list.remove(v);
                System.out.println("Vector got deleted");
            }
        }
    }

    static void show_vector(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("name = ");
        String name = scanner.nextLine();

        for (Vectors v : Main.vectors_list){
            if (Objects.equals(v.name, name)){
                v.info();
            }
        }
    }

    static void rename_vector(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("old name = ");
        String old_name = scanner.nextLine();

        System.out.print("new name = ");
        String new_name = scanner.nextLine();

        for (int i = 0; i < Main.vectors_list.size(); i++){
            Vectors v = Main.vectors_list.get(i);
            if (Objects.equals(v.name, old_name)){
                v.name = new_name;
                System.out.println("Vector got renamed");
            }
        }
    }

    static void all_vectors(){
        for (Vectors v : Main.vectors_list) {
            v.info();
        }
    }

    static void magnitude_vector(){
        return;
    }

    static void add_vectors(){
        return;
    }

    static void subtract_vectors(){
        return;
    }

    static void negative_vector(){
        return;
    }

    static void multiply_vector(){
        return;
    }

    static void scalar_product(){
        return;
    }

    static void cross_product(){
        return;
    }

}

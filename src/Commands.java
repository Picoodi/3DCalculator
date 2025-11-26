import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

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
        return;
    }

    static void position_vector(){
        return;
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

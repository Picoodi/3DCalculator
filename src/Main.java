import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static ArrayList<Point> points_list = new ArrayList<>();
    public static ArrayList<Vectors> vectors_list = new ArrayList<>();

    static void main() {


        Scanner scanner = new Scanner(System.in); //For reading input
        while (true) {
            Map<String, Runnable> commandMap = new HashMap<>();

            commandMap.put("exit", () -> System.exit(0));
            commandMap.put("help", Help_page::help_page);
            commandMap.put("reset", Commands::reset);
            commandMap.put("point", Commands::point);
            commandMap.put("show point", Commands::show_point);
            commandMap.put("delete point", Commands::delete_point);
            commandMap.put("rename point", Commands::rename_point);
            commandMap.put("all points", Commands::all_points);
            commandMap.put("mirror point", Commands::mirror_point);
            commandMap.put("position vector", Commands::position_vector);
            commandMap.put("vector", Commands::vector);
            commandMap.put("vector points", Commands::vector_between_points);
            commandMap.put("delete vector", Commands::delete_vector);
            commandMap.put("show vector", Commands::show_vector);
            commandMap.put("rename vector", Commands::rename_vector);
            commandMap.put("all vectors", Commands::all_vectors);
            commandMap.put("magnitude vector", Commands::magnitude_vector);
            commandMap.put("add vectors", Commands::add_vectors);
            commandMap.put("subtract vectors", Commands::subtract_vectors);
            commandMap.put("negative vector", Commands::negative_vector);
            commandMap.put("multiply vector", Commands::multiply_vector_by_number);
            commandMap.put("scalar product", Commands::scalar_product);
            commandMap.put("cross product", Commands::cross_product);



            System.out.print(">");
            String input = scanner.nextLine();

            Runnable action = commandMap.get(input);
            if (action != null) {
                action.run();
            }

        }
    }

}
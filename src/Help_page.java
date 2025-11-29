public class Help_page {
    static void help_page(){
        System.out.println();
        System.out.println("Hello Welcome to the help menu");
        System.out.println("The coordinates are");
        System.out.println("     z");
        System.out.println("     |");
        System.out.println("     |");
        System.out.println("     +------ y");
        System.out.println("    /");
        System.out.println("   x");
        System.out.println("The point (0/0/0) is already defined with the name origin");


        System.out.println();
        System.out.println();

        System.out.println("BASIC COMMANDS");
        System.out.println("- exit                                   exit the programm");
        System.out.println("- reset                                  reset all points and vectors");
        System.out.println("- help                                   open this help menu");
        System.out.println();
        System.out.println();

        System.out.println("POINTS");
        System.out.println("- point                                  create a new point");
        System.out.println("- delete point                           deletes a specific point");
        System.out.println("- show point                             gives info about a specific point");
        System.out.println("- rename point                           rename a point that already exists");
        System.out.println("- all points                             gives info about all points");
        System.out.println("- mirror point                           mirror a point on the given plane");
        System.out.println("                                         possible planes are o, x, y, z ,xy, xz ,yz, point");
        System.out.println("- position vector                        creates the position vector of the point");
        System.out.println();
        System.out.println();

        System.out.println("VECTORS");
        System.out.println("- vector                                 create a new vector");
        System.out.println("- vector points                          create a vector with 2 points");
        System.out.println("- delete vector                          deletes a specific vector");
        System.out.println("- show vector                            gives info about a specific vector");
        System.out.println("- rename vector                          rename a vector that already exists");
        System.out.println("- all vectors                            gives info about all vectors");
        System.out.println("- magnitude vector                       magnitude of a specific vector");
        System.out.println("- add vectors                            add two given vectors");
        System.out.println("- subtract vectors                       subtract two given vectors");
        System.out.println("- negative vector                        changes the given vector into its negative");
        System.out.println("- multiply vector                        skalar multiplication of 1 vector");
        System.out.println("- scalar product                         calculates the scalar and angle of two vectors");
        System.out.println("- cross product                          calculates the cross product of two vectors");
        System.out.println();
        System.out.println();

    }

}

package FlightControl;

import java.util.Scanner;
import ui.TEXT.TEXTui;


public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        FlightControl fc = new FlightControl();
        Scanner scanner = new Scanner(System.in) ;
        TEXTui prog = new TEXTui( fc, scanner) ;
        prog.start();
    }
}

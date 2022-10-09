package application;

public class Program {

    public static void main(String[] args) {
        //program goes here
        AverageSensor ka = new AverageSensor();
        ka.addSensor(new StandardSensor(4));
        ka.read();

    }

}

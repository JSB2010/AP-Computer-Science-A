package Week3;

//Initializing Scanner and mai function
import java.util.Scanner;
public class ShapeReporter {
    public static void main(String[] args) {
        //Asking for shape name
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the name of the shape: (Options: sphere, cylinder, cone, and hemisphere) ");
        String shapeName = reader.nextLine();
        //Logic for sphere
        if (shapeName.equals("sphere")){
            System.out.print("Enter the radius of the sphere: ");
            double radiusSphere = reader.nextDouble();
            //Calculating surface area and volume
            double surfaceAreaSphere = 4 * Math.PI * Math.pow(radiusSphere, 2);
            double volumeSphere = ((double) 4 / 3) * Math.PI * Math.pow(radiusSphere, 3);
            System.out.println("The surface area of the sphere is " + surfaceAreaSphere);
            System.out.println("The volume of the sphere is " + volumeSphere);
        }
        //Logic for cylinder
        if (shapeName.equals("cylinder")){
            System.out.print("Enter the radius of the cylinder: ");
            double radiusCylinder = reader.nextDouble();
            System.out.print("Enter the height of the cylinder: ");
            double height = reader.nextDouble();
            //Calculating surface area and volume
            double surfaceAreaCylinder = 2 * Math.PI * radiusCylinder * (radiusCylinder + height);
            double volumeCylinder = Math.PI * Math.pow(radiusCylinder, 2) * height;
            System.out.println("The surface area of the cylinder is " + surfaceAreaCylinder);
            System.out.println("The volume of the cylinder is " + volumeCylinder);
        }
        //Logic for cone
        if (shapeName.equals("cone")){
            System.out.print("Enter the radius of the cone: ");
            double radiusCone = reader.nextDouble();
            System.out.print("Enter the height of the cone: ");
            double heightCone = reader.nextDouble();
            //Calculating surface area and volume
            double surfaceAreaCone = Math.PI * radiusCone * (radiusCone + Math.sqrt(Math.pow(radiusCone, 2) + Math.pow(heightCone, 2)));
            double volumeCone = (double) 1/3 * Math.PI * Math.pow(radiusCone, 2) * heightCone;
            System.out.println("The surface area of the cone is " + surfaceAreaCone);
            System.out.println("The volume of the cone is " + volumeCone);
        }
        //Logic for hemisphere
        if (shapeName.equals("hemisphere")){
            System.out.print("Enter the radius of the hemisphere: ");
            double radiusHemisphere = reader.nextDouble();
            //Calculating surface area and volume
            double surfaceAreaHemisphere = 3 * Math.PI * Math.pow(radiusHemisphere, 2);
            double volumeHemisphere = (double) 2 / 3 * Math.PI * Math.pow(radiusHemisphere, 3);
            System.out.println("The surface area of the hemisphere is " + surfaceAreaHemisphere);
            System.out.println("The volume of the hemisphere is " + volumeHemisphere);
        }
        //Logic for invalid shape
        if (shapeName.isBlank() || !shapeName.matches("sphere|cylinder|cone|hemisphere")){
            System.out.println("Invalid shape name");
        }
        reader.close();
    }
}

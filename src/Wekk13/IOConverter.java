package Wekk13;
//import JOptionPane
import javax.swing.JOptionPane;

public class IOConverter {

	public static void main(String [] args)
	{
		//declare any variable needed here
		int celsius;
		
		//prompt for input
		String inputStr = JOptionPane.showInputDialog("Enter the temperature in Celsius: ","");
		
		//if the user enters nothing, the program ends
		if (inputStr == null)
			return;
		
		//convert the input to an integer
		celsius = Integer.parseInt(inputStr);
        //convert celsius to fahrenheit
        int fahrenheit = (int) (celsius * 1.8 + 32);

        //display the result
		JOptionPane.showMessageDialog(null, "The temperature in Fahrenheit is " + fahrenheit + " degrees.");
	}
}

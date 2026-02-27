package Wekk13;

import javax.swing.*;
import java.awt.*;

public class GUIWindow {
    public static void main (String [] args){
        JFrame theGUI = new JFrame(); //the GUI
        theGUI.setTitle("GUI Checkerboard"); //sets the Title at the top of the GUI
        theGUI.setSize(800,800); //set the size of the GUI in pixels
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets the x button in GUI to close the frame
        
        //using a show Input Dialog to get number of rows, 4 is set as the default number in the pop up
        String inputStr = JOptionPane.showInputDialog("Number of rows","6");
        int rows = Integer.parseInt(inputStr); //parse the string and save the value as rows
        
        //using a show Input Dialog to get number of columns, 4 is set as the default number in the pop up
        inputStr = JOptionPane.showInputDialog("Number of columns","6");
        int cols = Integer.parseInt(inputStr); //parse the string and save the value as columns
        
        Container pane = theGUI.getContentPane(); //the GUI Pane (needed to add panels)
        pane.setLayout(new GridLayout(rows, cols)); //creates a grid with the above rows and columns
        
        //set Color objects
        Color RED_COLOR = new Color(255, 0, 0);
        Color BLUE_COLOR = new Color(0, 0, 255);
        Color GREEN_COLOR = new Color(0, 255, 0);
        Color YELLOW_COLOR = new Color(255, 255, 0);
        Color cellColor = RED_COLOR; //current cellColor
        
        //nested loop to add each cell in the grid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            	if (i % 2 == 0) { //if the row is even
                    if (j % 2 == 0) { //if the column is even
                        cellColor = RED_COLOR; //set cellColor to red
                    } else {
                        cellColor = BLUE_COLOR; //set cellColor to blue
                    }
                } else { //if the row is odd
                    if (j % 2 == 0) { //if the column is even
                        cellColor = GREEN_COLOR; //set cellColor to green
                    } else {
                        cellColor = YELLOW_COLOR; //set cellColor to yellow
                    }
                }
                JPanel cell = new JPanel(); //creates new panel
                cell.setBackground(cellColor); //sets panel color
                pane.add(cell); //adds panel to the GUI container
            }
        }
        theGUI.setVisible(true); //displays the GUI
    }
}
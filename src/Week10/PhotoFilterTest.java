/**
package Week10;

import java.awt.Color;

public class PhotoFilterTest {
  public static void main(String[] args) {
    Picture pic = new Picture("smokey.jpg"); // create image
    pic.show(); //display image

    // grayscale loop…
    for (int x = 0; x < pic.width(); x++) {
      for (int y = 0; y < pic.height(); y++) {
        Color c = pic.get(x, y);
        int gray = (c.getRed()+c.getGreen()+c.getBlue())/3;
        pic.set(x, y, new Color(gray,gray,gray));
      }
    }
    pic.show();
  }
}
 */
import org.code.theater.*;
import org.code.media.*;

public class ImageFilter extends ImagePlus {

  public ImageFilter(String filename) {
    super(filename);
  }

  /*
   * Adjusts contrast by multiplying RGB values
   */
  public void adjustContrast(int multiplier) {
    Pixel[][] pixels = getImagePixels();

    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[row].length; col++) {

        Pixel p = pixels[row][col];

        int newRed = Math.min(255, p.getRed() * multiplier);
        int newGreen = Math.min(255, p.getGreen() * multiplier);
        int newBlue = Math.min(255, p.getBlue() * multiplier);

        p.setRed(newRed);
        p.setGreen(newGreen);
        p.setBlue(newBlue);
      }
    }
  }

  /*
   * Applies sepia tone using weighted color formulas
   */
  public void applySepia() {
    Pixel[][] pixels = getImagePixels();

    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[row].length; col++) {

        Pixel p = pixels[row][col];

        int r = p.getRed();
        int g = p.getGreen();
        int b = p.getBlue();

        int newRed = (int)(0.393 * r + 0.769 * g + 0.189 * b);
        int newGreen = (int)(0.349 * r + 0.686 * g + 0.168 * b);
        int newBlue = (int)(0.272 * r + 0.534 * g + 0.131 * b);

        newRed = Math.min(255, newRed);
        newGreen = Math.min(255, newGreen);
        newBlue = Math.min(255, newBlue);

        p.setRed(newRed);
        p.setGreen(newGreen);
        p.setBlue(newBlue);
      }
    }
  }

  /*
   * Applies simple blur by averaging neighboring pixels
   */
  public void applyBlur() {
    Pixel[][] pixels = getImagePixels();
    Pixel[][] copy = getPixelsFromImage();

    for (int row = 1; row < pixels.length - 1; row++) {
      for (int col = 1; col < pixels[row].length - 1; col++) {

        int totalRed = 0;
        int totalGreen = 0;
        int totalBlue = 0;

        // Loop through 3x3 grid
        for (int r = -1; r <= 1; r++) {
          for (int c = -1; c <= 1; c++) {

            Pixel neighbor = copy[row + r][col + c];
            totalRed += neighbor.getRed();
            totalGreen += neighbor.getGreen();
            totalBlue += neighbor.getBlue();
          }
        }

        int avgRed = totalRed / 9;
        int avgGreen = totalGreen / 9;
        int avgBlue = totalBlue / 9;

        Pixel current = pixels[row][col];
        current.setRed(avgRed);
        current.setGreen(avgGreen);
        current.setBlue(avgBlue);
      }
    }
  }

  /*
   * Converts image to pure black and white using threshold
   */
  public void applyBlackAndWhite() {
    Pixel[][] pixels = getImagePixels();

    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[row].length; col++) {

        Pixel p = pixels[row][col];

        int brightness = (p.getRed() + p.getGreen() + p.getBlue()) / 3;

        if (brightness > 128) {
          p.setRed(255);
          p.setGreen(255);
          p.setBlue(255);
        } else {
          p.setRed(0);
          p.setGreen(0);
          p.setBlue(0);
        }
      }
    }
  }
}

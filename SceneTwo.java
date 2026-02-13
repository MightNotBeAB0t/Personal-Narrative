import org.code.theater.*;
import org.code.media.*;

public class SceneTwo extends Scene {

    /*
     Stores the image filenames and captions for this scene.
     */
    private String[][] sceneData;

    /*
     Constructor
     Initializes SceneTwo with the provided image and caption data
     */
    public SceneTwo(String[][] sceneData) {
        this.sceneData = sceneData;
    }

    /*
     Draws the scene
     Displays each image in its original state, then applies the filter
     */
    public void drawScene() {
        clear("white");  // Clear background
        drawText("Scene 2", 120, 20);  // Scene title

        /*
         Top image with sepia filter
         The image is shown first in its original state, then filtered
         */
        ImageFilter topImage = new ImageFilter(sceneData[0][0]);

        drawImage(topImage, 70, 50, topImage.getWidth());
        drawText(sceneData[0][1], 90, 220);
        pause(1);

        topImage.applySepia();

        drawImage(topImage, 70, 50, topImage.getWidth());
        drawText(sceneData[0][1], 90, 220);
        pause(1);

        /*
         Bottom image with black and white filter
         The image is shown first in its original state, then filtered
         */
        ImageFilter bottomImage = new ImageFilter(sceneData[1][0]);

        drawImage(bottomImage, 70, 250, bottomImage.getWidth());
        drawText(sceneData[1][1], 90, 380);
        pause(1);

        bottomImage.applyBlackAndWhite();

        drawImage(bottomImage, 70, 250, bottomImage.getWidth());
        drawText(sceneData[1][1], 90, 380);
        pause(1);
    }
}

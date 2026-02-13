import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {
    // The 2d Arrays
    /*
     Scene 1 data
     Stores the image filenames and corresponding captions
     for the first scene (top and bottom images)
     */
    String[][] scene1Data = {
      {"happy.jpg", "Man, I hope I have an easy week"},
      {"relax.jpg", "Please have an easy week"}
    };

    /*
     Scene 2 data
     Stores the image filenames and captions for the second scene
     */
    String[][] scene2Data = {
      {"stare.jpeg", "ITS SO OVER... HELP MEEEEE"},
      {"airsoft.JPEG", "I'm done with this..."}
    };

    /*
     Create scene objects
     Instantiate SceneOne and SceneTwo using the data arrays 
     */
    SceneOne scene1 = new SceneOne(scene1Data);
    SceneTwo scene2 = new SceneTwo(scene2Data);

    /* 
     Manual test of drawScene()
     Draws each scene once to check original → filtered image transitions    
     */
    scene1.drawScene();
    scene2.drawScene();

    /* 
     Play all scenes in order
     Uses Theater class to play both scenes sequentially
     */
    Theater.playScenes(scene1, scene2);
  }
}

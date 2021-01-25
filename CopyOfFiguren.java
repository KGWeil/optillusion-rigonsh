
import processing.core.PApplet;

/**
 * Klasse CopyOfFiguren.
 * Beschreibung: Hier sollen mehrere vorgegebene CopyOfFiguren gezeichnet werden.
 *
 * @author Simon Gebert 
 * @version Feb2020
 */
public class CopyOfFiguren extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500, 350); // Festlegen der Fenstergröße
    }        

    public void zeichneBildC() {

        // ***** hier kommen deine Anweisungen hin ************
        rect(100, 100, 100, 100);
        ellipse(150, 150, 75, 75);
        ellipse(150, 150, 50, 50);
        ellipse(150, 150, 25, 25);
        
        ellipse(150, 275, 125, 125);
        rect(112, 237, 75, 75);
        rect(125, 250, 50, 50);
        rect(138, 264, 25, 25);
        
        
        

        // ***** Ende der eigenen Anweisungen **********  
    }

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        zeichneBildC(); // Aufruf deiner Methode
        // zeichneBildA();
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {CopyOfFiguren.class.getName() });
    }

}

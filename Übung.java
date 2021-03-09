
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Übung.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Übung extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,350);
        
    }        
    public void ZeichneBildC()
    {
        rect(125, 125, 175, 175);
        ellipse(212, 212, 175, 175);
        ellipse(212, 212, 150, 150);
        ellipse(212, 212, 125, 125);
        
        
    }
    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup ()
    { 
        ZeichneBildC();//Aufruf deiner Methode
        //zeichneBildA();

    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Übung.class.getName() });
    }

}


import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Wellen1.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellen1 extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(250,150);
    }        
    public int s=25;
    public void zeichneQuadrat(int x, int y, int farbe, boolean links)
    {
        fill(farbe);
        rect(x, y, s, s);

        if (farbe == 255){
            fill(0); 
        }
        else{
            fill(255);   
        }
        ellipseMode(CORNERS);
        noStroke();
        int d = s/4;
        if ( links ) {
            ellipse(x, y,x+d, y+d);
            ellipse(x, y + 3*d, x+d, y+s);
        }
        else{
            ellipse(x + 3*d, y, x+s, y+d);
            ellipse(x + 3*d, y + 3*d, x+s, y+s);
        }
    }

    public int d;
    public void alleQuadrate() {
        noStroke();
        int aktuelleFarbe = 255;
        int d=25;
        boolean pos_aktuell = true;
        for (int j=0; j<=3; j++) {
            for (int i=0; i<=7; i++) {
                zeichneQuadrat(d + i*s, d + j*s, aktuelleFarbe, pos_aktuell);
                if (aktuelleFarbe == 255) {
                    aktuelleFarbe = 0;
                } else {
                    aktuelleFarbe = 255;
                }
            }

            if (aktuelleFarbe == 255) {
                aktuelleFarbe = 0;
            } else {
                aktuelleFarbe = 255;
            }

            if (pos_aktuell == true) {
                pos_aktuell = false;
            } else {
                pos_aktuell = true;
            }
        }
    }

    //Hier werden jetzt Striche gezeichnet

    public void striche(){
      int x1=25;
      int y1=25;
      int x2=125;
      int y2=125;
      
      line(x1, y1, x2, y2);
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {
        background(250, 163, 23);
        alleQuadrate();
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Wellen1.class.getName() });
    }

}

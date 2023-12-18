import java.util.List;
import java.util.Objects;

/**
 * Diese Klasse implementiert einen Briefdrucker
 * 
 * @author tebe
 */
public class Briefdrucker {
  
	// Ihr Code fuer den Briefdrucker
    private Briefdruckstrategie druckStrategie;

    public Briefdrucker(Briefdruckstrategie druckStrategie){
        setDruckStrategie(druckStrategie);
    }

    public void druckenSerienbrief(List<Brief> briefe){
        for(Brief brief : briefe){
            druckeBrief(brief);
        }
    }

    public void druckeBrief(Brief brief){
        druckStrategie.druckeBrief(brief);
    }

    public void setDruckStrategie(Briefdruckstrategie druckStrategie){
        Objects.requireNonNull(druckStrategie);
        this.druckStrategie = druckStrategie;
    }
}


/**
 * Chisom Ndy-Orji
 * Quarter 1 Project
 * Distance Caluculator
 */
public class Distance
{
    // Fields
    private double distanceAu;
    private double distanceMeters;

    //Calacute Distance
    public void calculateDistance(Star starName, Planet planetName)
    {
        double xDifference = planetName.getX() - starName.getX();
        double yDifference = planetName.getY() - starName.getY();
        double zDifference = planetName.getZ() - starName.getZ();
        
        distanceAu = Math.sqrt(xDifference * xDifference 
                            + yDifference * yDifference 
                            + zDifference * zDifference);
        
        double auToMeters = 1.496e11;
        
        distanceMeters = distanceAu * auToMeters;
    }
    
    //Print Gravity and Distance
    public void ShowDistance(Star starName, Planet planetName)
    {
        System.out.println("Distance(m) between " + starName + " and " 
                            + planetName + ": " + distanceMeters);
        System.out.println("Distance(AU) between " + starName + " and " 
                            + planetName + ": " + distanceAu);
    }
}
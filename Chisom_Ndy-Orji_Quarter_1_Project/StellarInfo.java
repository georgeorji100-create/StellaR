
/**
 * Quarter 1 Project
 * 
 */
public class StellarInfo
{
    //x,y,z coordinates
    private String name; 
    private double mass; 
    private double pcentHydrogen; 
    private double pcentHelium; 
    private double pcentHeavyElements; 
    private double xPosition;
    private double yPosition;
    private double zPosition;
    
    //Default Constructor
    /**
     * Constructor for objects of class BodyCoordinates
     */
    public StellarInfo()
    {
        this.name = "Sun";
        this.mass = 1.989e30;
        this.pcentHydrogen = 71.0;
        this.pcentHelium = 27.1;
        this.pcentHeavyElements = 1.9;
        this.xPosition = 0;
        this.yPosition = 0;
        this.zPosition = 0;
    }
    
    //Constructor
    public StellarInfo(String starName, double mass, double pcentHydrogen,
                   double pcentHelium, double pcentHeavyElements,
                   double x, double y, double z)
    {
        this.name = starName;
        this.mass = mass;
        this.pcentHydrogen = pcentHydrogen;
        this.pcentHelium = pcentHelium;
        this.pcentHeavyElements = pcentHeavyElements;
        xPosition = x;
        yPosition = y;
        zPosition = z;
        
    }
    
    //Getter Methods
    public String getName()
    {
        return name;
    }
    
    public double getMass()
    {
        return mass;
    }
    
    public double getHydrogenContent()
    {
        return pcentHydrogen;
    }
    
    public double getHeliumContent()
    {
        return pcentHelium;
    }
    
    public double getHeavyElementContent()
    {
        return pcentHeavyElements;
    }
    
    public double getX()
    {
        return xPosition;
    }
    
    public double getY()
    {
        return yPosition;
    }
    
    public double getZ()
    {
        return zPosition;
    }
    
    //Setter Methods
    public void setX(double newX)
    {
        xPosition = newX;
    }
    
    public void setY(double newY)
    {
        yPosition = newY;
    }
    
    public void setZ(double newZ)
    {
        zPosition = newZ;
    }
    
    //Change Position
    public void changePosition(double newX, double newY, double newZ)
    {
        xPosition = newX;
        yPosition = newY;
        zPosition = newZ;
    }
    
    //Print Position
    public void printPosition()
    {
        System.out.println(name + " coordinates: (" + xPosition + ", " + yPosition + ", " + zPosition + ")");
    }
}
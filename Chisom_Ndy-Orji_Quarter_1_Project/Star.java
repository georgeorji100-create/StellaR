
/**
 * Chisom Ndy-Orji
 * Quarter 1 Project
 * Star Information
 */
public class Star
{
    //Fields
    private String starName; 
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
    public Star()
    {
        this.starName = "Sun";
        this.mass = 1.989e30;
        this.pcentHydrogen = 71.0;
        this.pcentHelium = 27.1;
        this.pcentHeavyElements = 1.9;
        this.xPosition = 0;
        this.yPosition = 0;
        this.zPosition = 0;
    }
    
    //Constructor
    public Star(String name, double mass, double initHydrogen,
                   double initHelium, double initHeavyElements,
                   double x, double y, double z)
    {
        this.starName = name;
        this.mass = mass;
        this.pcentHydrogen = initHydrogen;
        this.pcentHelium = initHelium;
        this.pcentHeavyElements = initHeavyElements;
        xPosition = x;
        yPosition = y;
        zPosition = z;
        
    }
    
    //Getter Methods
    public String getName()
    {
        return starName;
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
    public void setName(String newName)
    {
        starName = newName;
    }
    
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
        System.out.println(starName + " coordinates: (" + xPosition + ", " + yPosition + ", " + zPosition + ")");
    }
}
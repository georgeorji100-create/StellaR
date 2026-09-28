/**
 * Chisom Ndy-Orji
 * Quarter 1 Project
 * Planet Information
 */
public class Planet
{
    //Fields
    private String planetName;
    private double mass;
    private double xPosition;
    private double yPosition;
    private double zPosition;

    // Default Constructor
    public Planet()
    {
        this.planetName = "Earth";
        this.mass = 5.9722e24;
        this.xPosition = 1;
        this.yPosition = 0;
        this.zPosition = 0;
    }

    // Constructor
    public Planet(String name, double mass, double initX, double initY, double initZ)
    {
        this.planetName = name;
        this.mass = mass;
        this.xPosition = initX;
        this.yPosition = initY;
        this.zPosition = initZ;
    }

    // Getter Methods
    public String getName()
    {
        return planetName;
    }
    
    public double getMass()
    {
        return mass;
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

    // Setter Methods
    public void setName(String newName)
    {
        planetName = newName;
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

    // Change Position
    public void changePosition(double newX, double newY, double newZ)
    {
        xPosition = newX;
        yPosition = newY;
        zPosition = newZ;
    }

    // Print Position
    public void printPosition()
    {
        System.out.println("Planet " + planetName + " coordinates: (" + xPosition + ", "
                           + yPosition + ", " + zPosition + ")");
    }
}
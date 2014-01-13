package cs.lesson2.imbored;

public class Stuff
{
    private String string;
    
    /**
     * 
     * @param String you wish to print
     */
    public Stuff(String string)
    {
        this.saveString(string);
        this.printString();
    }
    
    /**
     * 
     * @param String you wish to save
     */
    public void saveString(String string)
    {
        this.string = string;
    }
    
    /**
     * 
     * @return Returns the saved string
     */
    public String getString()
    {
        return this.string;
    }
    
    /**
     * 
     * Prints the saved string
     */
    public void printString()
    {
        System.out.println(this.getString());
    }
}

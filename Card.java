
/**
 * Object class used to represent a Card from the game Chaos Galaxy TCG
 *
 * @author BunsenBurn
 * @version 11/26/2020
 */
public class Card
{
    private String name;
    private String type;
    private String set;
    private String rarity;
    
    private String[] types = {"creature", "resource", "attachment", "activator","combiner","planet"};
    private String[] rarities = {"common","rare", "really rare", "ridiculously rare", "limited edition"};
    
    
    public Card(String name, String type, String set,String rarity){
        this.name = name;
        type = type.toLowerCase();
        switch(type){
            case "creature":
            this.type = "creature";
            break;
            
            case "resource":
            this.type = "resource";
            break;
            
            case "attachment":
            this.type = "attachment";
            break;
            
            case "activator":
            this.type = "activator";
            break;
            
            case "planet":
            this.type = "planet";
            break;
            
            case "combiner":
            this.type = "combiner";
            break;
            
            default:
            this.type = null;
            break;
           
        }
        this.set = set;
        rarity = rarity.toLowerCase();
        switch(rarity){
            
        }
        this.rarity = rarity;
    }
   
    
    public String getName(){
        return name;
    }
    
}

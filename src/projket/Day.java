package projket;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Day implements Serializable{
    
    //properties
    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    Date dateobj = new Date();
    String title = df.format(dateobj)+".." ;
    
    
    String type;
    String content;
    
    public Day()
    {
        
    }
    
    //methods
    
    //title methods
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public String getTitle()
    {
        return this.title;
    }
    
    //content methods
    public void setContent(String text)
    {
        this.content = text;
    }
    
    public String getContent()
    {
        return this.content;
    }
    
    //type methods
    public void setType(String type)
    {
        this.type = type;
    }
    
    public String getType()
    {
        return this.type;
    }
    
    
    
}

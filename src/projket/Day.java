package projket;

import java.io.Serializable;


public class Day implements Serializable{
    
    //properties
    String title;
    int type;
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
    public void setType(int type)
    {
        this.type = type;
    }
    
    public int getType()
    {
        return this.type;
    }
    
    
    
}

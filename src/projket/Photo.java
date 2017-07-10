package projket;

import java.awt.Image;
import java.io.Serializable;
import java.util.Date;


public class Photo implements Serializable{
    
    //properties
    String title;
    String img;
    Date date;
    String explanation;
    
    public Photo()
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
    
    //date methods
    public Date getDate()
    {
        return this.date;
    }
    
    //img methods
    public void changeImage(String i)
    {
        this.img = i;
    }
    
    //explanation methods
    public void changeExplanation(String s)
    {
        this.explanation = s;
    }
    
    
    
    
    
    
    
}

package projket;

import java.io.Serializable;

public class Note implements Serializable{
    
    //properties
    String title;
    String content;
    Photo picture;
    
    public Note()
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
    
    //picture methods
    public void changePicture(Photo p)
    {
        this.picture = p;
    }
    
    public void deletePicture()
    {
        this.picture = null;
    }
    
}

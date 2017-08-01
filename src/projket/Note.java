package projket;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Note implements Serializable{
    
    //properties
    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    Date dateobj = new Date();
    String title = df.format(dateobj)+".." ;
    String content;
    Photo picture = null;
    
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
    
    public Photo getPicture()
    {
        return this.picture;
    }
    
    public void deletePicture()
    {
        this.picture = null;
    }
    
}

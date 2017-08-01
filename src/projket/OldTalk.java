package projket;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OldTalk implements Serializable{
    
    
    //properties
    String content;
    Date date;
    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    Date dateobj = new Date();
    String title = df.format(dateobj)+".." ;
    
    public OldTalk()
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
    
    //date methods
    public Date getDate()
    {
        return this.date;
    }
    
}

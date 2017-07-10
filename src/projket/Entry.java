package projket;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Entry implements Serializable{

    //properties
    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    Date dateobj = new Date();
    String title = df.format(dateobj)+".." ;
    String text;
    ArrayList<Photo> medias = new ArrayList<>();
    
    
    public Entry()
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
    
    //text methods
    public void setText(String text)
    {
        this.text = text;
    }
    
    public String getText()
    {
        return this.text;
    }
    
    //medias methods
    public void addNewPhoto(Photo p)
    {
        this.medias.add(p);
    }
    
    public ArrayList<Photo> getMedia()
    {
        return this.medias;
    }
    
    public boolean deletePhoto(Photo p)
    {
        String pictitle = p.title;
        for(int i=0;i<this.medias.size();i++)
        {
            if(this.medias.get(i).title.equals(pictitle))
            {
                this.medias.remove(i);
                return true;
            }
        }
        return false;
    }
    
}

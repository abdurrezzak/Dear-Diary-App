package projket;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Album implements Serializable{
    
    
    //properties
    String name;
    ArrayList<Photo> photos = new ArrayList<>();
    Date date;
    
    public Album()
    {
        
    }
    
    //name methods
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getname()
    {
        return this.name;
    }
    
    //photos methods
    public void addNewPhoto(Photo p)
    {
        this.photos.add(p);
    }
    
    public ArrayList<Photo> getPhotos()
    {
        return this.photos;
    }
    
    public boolean deletePhoto(Photo p)
    {
        String pictitle = p.title;
        for(int i=0;i<this.photos.size();i++)
        {
            if(this.photos.get(i).title.equals(pictitle))
            {
                this.photos.remove(i);
                return true;
            }
        }
        return false;
    }
    
    //date methods
    public Date getDate()
    {
        return this.date;
    }
    
    
    
    
    
}

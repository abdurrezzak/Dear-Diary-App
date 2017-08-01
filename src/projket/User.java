package projket;
import javax.swing.*;
import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable{
    
    //Properties
    String username; //+
    String password;//+
    String iconUrl="/home/abdurrezzak/NetBeansProjects/Projket/src/projket/propicdefault.png";//+
    ArrayList<Entry> Entries  = new ArrayList<>();//+
    ArrayList<Note> Notes  = new ArrayList<>();//+
    ArrayList<Day> Days  = new ArrayList<>();//+
    ArrayList<OldTalk> OldTalks  = new ArrayList<>();//+
    ArrayList<Album> Albums  = new ArrayList<>(); //+
    
    
    //Constructor
    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    
    public User()
    {
        
    }
    
    //methods
    //username methods
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public String getUsername()
    {
        return this.username;
    }
    
    
    //password methods
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public String getPassword()
    {
        return this.password;
    }
    
    
    //propic methods
    public void changeProfilePicture(String url)
    {
        this.iconUrl = url;
    }
    
    public String getProfilePicture()
    {
        return this.iconUrl;
    }
    
    
    //Entries methods
    public void addNewEntry(Entry e)
    {
        this.Entries.add(e);
    }
    
    public ArrayList<Entry> getEntries()
    {
        return this.Entries;
    }
    
    public Entry getSpecificEntry(Entry e)
    {
        String entrytitle = e.title;
        for(int i=0;i<Entries.size();i++)
            if(Entries.get(i).title.equals(entrytitle))
                return Entries.get(i);
            
        return null;
    }
    
    public boolean deleteEntry(Entry e)
    {
        String entrytitle = e.title;
        for(int i=0;i<Entries.size();i++)
            if(Entries.get(i).title.equals(entrytitle))
            {
                Entries.remove(i);
                return true;
            }
        
        return false;
    }
    
    public boolean updateEntry(Entry e)
    {
        String entrytitle = e.title;
        
        for(int i=0;i<Entries.size();i++)
            if(Entries.get(i).title.equals(entrytitle))
            {
                Entries.remove(i);
                Entries.add(i, e);
                return true;
            }
        
        return false;         
    }
    
    //Notes methods
    public void addNote(Note n)
    {
        this.Notes.add(n);
    }
    
    public ArrayList<Note> getNotes()
    {
        return this.Notes;
    }
    
    public Note getSpecificNote(Note n)
    {
        String notetitle = n.title;
        for(int i=0;i<Notes.size();i++)
            if(Notes.get(i).title.equals(notetitle))
                return Notes.get(i);
            
        return null;
    }
    
    public boolean deleteNote(Note n)
    {
        String notetitle = n.title;
        
        for(int i=0;i<this.Notes.size();i++)
            if(this.Notes.get(i).title.equals(notetitle))
            {
                this.Notes.remove(i);
                return true;
            }
        
        return false;
    }
    
    public boolean updateNote(Note n)
    {
        String notetitle = n.title;
        
        for(int i=0;i<this.Notes.size();i++)
            if(this.Notes.get(i).title.equals(notetitle))
            {
                this.Notes.remove(i);
                this.Notes.add(i, n);
                return true;
            }
        
        return false;         
    }
    
    //Days methods
    
    public void addDay(Day d)
    {
        this.Days.add(d);
    }
    
    public ArrayList<Day> getDays()
    {
        return this.Days;
    }
    
    public Day getSpecificDay(Day d)
    {
        String daytitle = d.title;
        for(int i=0;i<Days.size();i++)
            if(Days.get(i).title.equals(daytitle))
                return Days.get(i);
            
        return null;
    }
    
    public boolean deleteDay(Day d)
    {
        String daytitle = d.title;
        
        for(int i=0;i<this.Days.size();i++)
            if(this.Days.get(i).title.equals(daytitle))
            {
                this.Days.remove(i);
                return true;
            }
        
        return false;
        
    }
    
    public boolean updateDay(Day d)
    {
        String daytitle = d.title;
        
        for(int i=0;i<this.Days.size();i++)
            if(this.Days.get(i).title.equals(daytitle))
            {
                this.Days.remove(i);
                this.Days.add(i, d);
                return true;
            }
        
        return false;         
    }
    
    //OldTalks methods
    public void addTalk(OldTalk t)
    {
        this.OldTalks.add(t);
    }
    
    public ArrayList<OldTalk> getOldTalks()
    {
        return this.OldTalks;
    }
    
    public OldTalk getSpecificOldTalk(OldTalk t)
    {
        String talktitle = t.title;
        for(int i=0;i<OldTalks.size();i++)
            if(OldTalks.get(i).title.equals(talktitle))
                return OldTalks.get(i);
            
        return null;
    }
    
    public boolean deleteOldTalk(OldTalk t)
    {
        String talktitle = t.title;
        
        for(int i=0;i<this.OldTalks.size();i++)
            if(this.OldTalks.get(i).title.equals(talktitle))
            {
                this.OldTalks.remove(i);
                return true;
            }
        
        return false;
        
    }
    
    public boolean updateOldTalk(OldTalk t)
    {
        String talktitle = t.title;
        
        for(int i=0;i<this.OldTalks.size();i++)
            if(this.OldTalks.get(i).title.equals(talktitle))
            {
                this.OldTalks.remove(i);
                this.OldTalks.add(i, t);
                return true;
            }
        
        return false;         
    }
    
    //Albums methods
    public void addAlbum(Album a)
    {
        this.Albums.add(a);
    }
    
    public ArrayList<Album> getAlbums()
    {
        return this.Albums;
    }
    
    public Album getSpecificAlbum(Album a)
    {
        String albumname = a.name;
        for(int i=0;i<this.Albums.size();i++)
            if(this.Albums.get(i).name.equals(albumname))
                return this.Albums.get(i);
            
        return null;
    }
    
    public boolean deleteAlbum(Album a)
    {
        String albumname = a.name;
        for(int i=0;i<this.Albums.size();i++)
            if(this.Albums.get(i).name.equals(albumname))
            {
                this.Albums.remove(i);
                return true;
            }
        
        return false;
        
    }
    
    public boolean updateAlbum(Album a)
    {
        String albumname = a.name;
        for(int i=0;i<this.Albums.size();i++)
            if(this.Albums.get(i).name.equals(albumname))
            {
                this.Albums.remove(i);
                this.Albums.add(i, a);
                return true;
            }
        
        return false;         
    }
    
}

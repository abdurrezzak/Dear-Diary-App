package projket;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class deneme {
    
    
    public static void main(String[] args)
    {
                try {
			User mb = new User("Ghoul", "Ghoul1234");
                        User mb2 = new User("Efe", "aasecond");
                        
                        
			// write object to file
			FileOutputStream fos = new FileOutputStream("dataaaa.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(mb);
			oos.writeObject(mb2);
                        oos.close();

			// read object from file
			FileInputStream fis = new FileInputStream("dataaaa.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
                        ArrayList<User> allUsers =  new ArrayList<>();
                        boolean flag=true;
                        while(flag)
                        {
                            try
                            {
                                User result = (User) ois.readObject();
                                allUsers.add(result);
                        
                            }catch(EOFException e)
                            {
                                flag = false;
                            }
                            
                        }
                        
                        int i=0;
                        while(i< allUsers.size())
                        {
                            System.out.println(allUsers.get(i).getUsername() + ", " + allUsers.get(i).getPassword());
                            i++;
                        }
                        
                        //ois.close();
                        

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
    
}

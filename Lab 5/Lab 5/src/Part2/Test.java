//Niall Martin - 12301341

package Part2;

import java.io.*;

public class Test 
{	
	public static void main(String[] args)
	{
		try
		{
		//initialize array
		Student[] students = new Student[3];
		students[0] = new Student("Niall Martin", "BCT", "12301341");
		students[1] = new Student("John Lennnon", "EEE", "15394373");
		students[2] = new Student("James Bond", "BUS", "90884763");
	
		String file ="C:\\Users\\Niall Martin\\Desktop\\College\\Third Year\\Programming\\Labs\\Lab 5\\studentdataPart2.txt";
		
		Serialize(students,file);
		Deserialize(file);
		
		}
		
		catch (IOException e) 
		{
			System.out.println("Input/output error");
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	
    public static void Serialize(Student[] students, String file) throws IOException 
    {

        System.out.printf("Writing array to file");

        // Create file outputs
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Loop through object array and print them
        for(Student student : students) 
        {
            System.out.printf("Write " + student + " to file.\n");
            oos.writeObject(student);
        }

        System.out.println("Finished writing students. Closing file.");

        //close streams
        oos.flush();
        oos.close();
    }
    
    public static void Deserialize(String file) throws IOException, ClassNotFoundException 
    {
        System.out.printf("Reading file");

        // Create streams
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student student;

        // Print out all students
        while(fis.available() > 0 && (student = ((Student) ois.readObject())) != null) //uses custom readObject and writeObject methods
        {
            System.out.println(student);
        }
        
        //close streams
        ois.close();
    }
	
}

package question2;


import java.io.*;

public class Main {
    public static void main(String[] args) {
        String city = "Mirzapur";
        String state = "Uttar Pradesh";
        String pincode = "231304";
        Student student = new Student(101, new Address(state,city,pincode),"niraj@gmail.com", "India*1947");
        System.out.println("Before Serialization: "+student);
        // writing object data to the file student.txt
        try{
            //serialize student to student.txt
            FileOutputStream fos = new FileOutputStream("DataSet/student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
            oos.close();

            //de-serialize binary data of student.txt file to Student object
            FileInputStream fis = new FileInputStream("DataSet/student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student student1 = (Student) ois.readObject();
            System.out.println("After Serialization: "+student1);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException c){
            c.getException();
        }


    }
}

package question3;

import java.io.*;

public class TransientExp {
    public static void main(String[] args) {
        ABC abc = new ABC();
        try{
            FileOutputStream fos = new FileOutputStream("DataSet/TransientTest.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(abc);
            oos.close();

            FileInputStream fis = new FileInputStream("DataSet/TransientTest.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ABC abc1 = (ABC)ois.readObject();
            System.out.println(abc1.i +"......"+ abc1.j+"......"+abc1.k+"......"+abc1.l+"......"+abc1.m+"......"+abc1.n);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException c){
            c.getException();
        }


    }
}

package chapter6.singleton_7_1;

import java.io.*;

/**
 * @author spencercjh
 * 图6-9 如果不使用readResolve()方法，序列化对象无法保持单例 Page274
 * 图6-10 Page275
 */
public class SaveAndRead {
    public static void main(String[] args) {
        try {
            MyObject myObject = MyObject.getInstance();
            System.out.println(myObject.hashCode());
            FileOutputStream fileOutputStream = new FileOutputStream(new File("myObjectFile.txt"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(myObject);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("myObjectFile.txt"));
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            MyObject myObject = (MyObject) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println(myObject.hashCode());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

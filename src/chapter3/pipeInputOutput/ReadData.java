package chapter3.pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * @author spencercjh
 */
public class ReadData {
    public void readMetod(PipedInputStream inputStream) {
        try {
            System.out.println("read:   ");
            byte[] bytes = new byte[20];
            int readLength = inputStream.read(bytes);
            while (readLength != -1) {
                String newData = new String(bytes, 0, readLength);
                System.out.print(newData);
                readLength = inputStream.read(bytes);
            }
            System.out.println();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

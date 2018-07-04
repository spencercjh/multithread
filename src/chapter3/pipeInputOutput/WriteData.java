package chapter3.pipeInputOutput;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.UnsupportedEncodingException;

/**
 * @author spencercjh
 */
public class WriteData {
    public void writeMethod(PipedOutputStream outputStream) {
        try {
            System.out.println("write:  ");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);
                outputStream.write(outData.getBytes());
                System.out.print(outData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

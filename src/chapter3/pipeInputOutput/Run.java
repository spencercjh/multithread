package chapter3.pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author spencercjh
 * 图3-38 利用管道流让两个线程进行通信 Page174
 */
public class Run {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();
            PipedInputStream inputStream = new PipedInputStream();
            PipedOutputStream outputStream = new PipedOutputStream();
            inputStream.connect(outputStream);
//            outputStream.connect(inputStream);
            ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
            threadWrite.start();
            Thread.sleep(2000);
            ThreadRead threadRead = new ThreadRead(readData, inputStream);
            threadRead.start();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

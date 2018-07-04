package chapter3.pipeInputOutput;

import java.io.PipedInputStream;

/**
 * @author spencercjh
 */
public class ThreadRead extends Thread {
    private ReadData readData;
    private PipedInputStream inputStream;

    public ThreadRead(ReadData readData, PipedInputStream inputStream) {
        this.readData = readData;
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        readData.readMetod(inputStream);
    }
}

package chapter3.pipeReaderWriter;

import java.io.PipedReader;

/**
 * @author spencercjh
 */
public class ThreadRead extends Thread {
    private ReadData readData;
    private PipedReader pipedReader;

    public ThreadRead(ReadData readData, PipedReader pipedReader) {
        this.readData = readData;
        this.pipedReader = pipedReader;
    }

    @Override
    public void run() {
        readData.readMethod(pipedReader);
    }
}

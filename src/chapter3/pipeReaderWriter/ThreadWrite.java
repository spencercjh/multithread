package chapter3.pipeReaderWriter;

import java.io.PipedWriter;

/**
 * @author spencercjh
 */
public class ThreadWrite extends Thread {
    private WriteData writeData;
    private PipedWriter pipedWriter;

    public ThreadWrite(WriteData writeData, PipedWriter pipedWriter) {
        this.writeData = writeData;
        this.pipedWriter = pipedWriter;
    }

    @Override
    public void run() {
        writeData.writeMethod(pipedWriter);
    }
}

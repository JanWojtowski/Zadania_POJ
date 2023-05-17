package Lab8.Ex4;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        OperationOnFile operationOnFile = new OperationOnFile();

        File fileIn = new File("./Lab8/Ex4/inbound");
        File fileOut = new File("./Lab8/Ex4/outbound");

        for(File file: fileIn.listFiles()){
            operationOnFile.magic(file);
        }
    }
}

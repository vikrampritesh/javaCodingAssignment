package org.example.fileread;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.*;

import static org.junit.jupiter.api.Assertions.*;


class FileReaderServiceImplTest {


    @Test
    void readFileContents() throws IOException {
        FileReaderServiceImpl fileReaderInterface = new FileReaderServiceImpl();
        Path tempFile = FileSystems.getDefault().getPath("src","test","resources", "inputfile.txt");
        String filecontent = fileReaderInterface.readFileContents(tempFile);
        assertEquals("CBA",filecontent);
    }
}
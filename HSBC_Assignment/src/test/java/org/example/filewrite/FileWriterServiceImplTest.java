package org.example.filewrite;

import org.example.fileread.FileReaderServiceImpl;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileWriterServiceImplTest {

    @Test
    void writeFileContents() throws IOException {
        FileWriterService fileWriterService = new FileWriterServiceImpl();
        Path tempFile = FileSystems.getDefault().getPath("src","test","resources", "inputfile.txt");
        String filecontent = fileWriterService.writeFileContents(tempFile,"CBA");
        assertEquals("CBA",filecontent);
    }
}
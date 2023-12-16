package org.example.filewrite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriterServiceImpl implements FileWriterService<Path, String> {
    @Override
    public String writeFileContents(Path writerPath, String wordsReadFromFile) throws IOException {

     byte[] strToBytes = wordsReadFromFile.getBytes();

     Files.write(writerPath, strToBytes);

     return wordsReadFromFile;
    }
}

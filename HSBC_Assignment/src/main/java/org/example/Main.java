package org.example;

import org.example.fileread.FileReaderService;
import org.example.fileread.FileReaderServiceImpl;
import org.example.filewrite.FileWriterService;
import org.example.filewrite.FileWriterServiceImpl;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = FileSystems.getDefault().getPath("src","main","resources", "inputfile.txt");
        FileReaderService fileReaderService = new FileReaderServiceImpl();
        String wordsReadFromFile = (String) fileReaderService.readFileContents(path);

        Path writerPath = FileSystems.getDefault().getPath("src","main","resources", "outputfile.txt");
        FileWriterService fileWriterService = new FileWriterServiceImpl();
        System.out.println("Output File content " + fileWriterService.writeFileContents(writerPath,wordsReadFromFile));


    }
}
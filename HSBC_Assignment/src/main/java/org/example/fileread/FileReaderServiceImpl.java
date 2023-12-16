package org.example.fileread;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReaderServiceImpl implements FileReaderService<Path, String> {
    @Override
    public String readFileContents(Path path) throws IOException {
        Stream<String> streamOfStrings = Files.lines(path);

        String wordsReadFromFile = streamOfStrings.map(str -> new StringBuilder(str).reverse())
                .collect(Collectors.joining("\n"));
        streamOfStrings.close();
        return wordsReadFromFile;
    }
}

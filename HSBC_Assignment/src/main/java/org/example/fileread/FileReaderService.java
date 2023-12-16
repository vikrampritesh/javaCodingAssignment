package org.example.fileread;

import java.io.IOException;

public interface FileReaderService<T,U> {
    public U readFileContents(T t) throws IOException;
}

package org.example.filewrite;

import java.io.IOException;

public interface FileWriterService<T, U> {
    public String writeFileContents(T t, U u) throws IOException;
}

package org.example.filewrite;

import java.io.IOException;

public interface FileWriterService<T, U, V> {
    public V writeFileContents(T t, U u) throws IOException;
}

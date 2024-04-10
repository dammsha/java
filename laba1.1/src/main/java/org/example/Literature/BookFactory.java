package org.example.Literature;

import java.io.IOException;

public interface BookFactory {
    Book createEngBook(Book book) throws IOException;
    Book createRusBook(Book book) throws IOException;
}

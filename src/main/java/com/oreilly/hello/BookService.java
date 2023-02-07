package com.oreilly.hello;

public interface BookService {
    String getAuther();
    void queryBookTitle(BookServiceCallback callback);

}

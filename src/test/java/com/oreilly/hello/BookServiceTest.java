package com.oreilly.hello;

import org.junit.jupiter.api.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

/**
 * https://stackoverflow.com/questions/36615330/mockito-doanswer-vs-thenreturn
 */
public class BookServiceTest {

    @Test
    public void testBookServiceCallback() {
        BookServiceCallback callback = new BookServiceCallback() {

            @Override
            public void onSuccess(String bookTitle) {
                assertEquals("Effective java", bookTitle);
            }
        };
        BookService service = mock(BookService.class);
        doAnswer(new Answer() {

            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                BookServiceCallback callback = (BookServiceCallback) invocation.getArguments()[0];
                callback.onSuccess("Effective java");
                return null;
            }
        }).when(service).queryBookTitle(callback);
        service.queryBookTitle(callback);
    }

}

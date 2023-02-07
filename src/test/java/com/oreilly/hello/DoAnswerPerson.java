package com.oreilly.hello;

import org.junit.Test;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DoAnswerPerson {

    /**
     * https://stackoverflow.com/questions/36615330/mockito-doanswer-vs-thenreturn:w
     * @throws Exception
     */
    @Test
    public void testAnswer() throws Exception {
        Person person = mock(Person.class);
        Answer<Integer> answer = invocation -> {
            String str = invocation.getArgument(0, String.class);
            return str.length() * 2;
        };
        when(person.getId()).thenAnswer(answer);
        doAnswer(answer).when(person).getId();

    }
}

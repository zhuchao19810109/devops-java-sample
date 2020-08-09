package io.kubesphere.devops;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldControllerTest {

    @Test
    public void testSayHello() {
        assertEquals("Really appreciate your star, that's the power of our life.", new HelloWorldController().sayHello());
    }
}

package com.tw.wow.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void should_get_name() {
        Person jack = Person.builder().name("Jack").age(20).build();

        assertEquals("Jack", jack.getName());
    }
}
package com.example.robot.entity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SurvivorTest {
//created a reference
    private Survivor survivor;

    @BeforeEach
    void setUp() {
        //creating an object
        survivor=new Survivor();
        survivor.setId(1L);
        survivor.setName("joe");
        survivor. setAge(24);
        survivor.setGender("male");

        survivor.setInfected(true);


    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void getId() {
        assertNotNull(survivor);
        assertEquals(1L,survivor.getId());
    }
    @Test
    void setId() {
        assertNotNull(survivor);
        survivor.setId(1L);
        assertEquals(1L,survivor.getId());
    }
    @Test
    void getName() {
        assertNotNull(survivor);
        assertEquals("joe",survivor.getName());
    }

    @Test
    void setName() {
        assertNotNull(survivor);
        survivor.setName("joe");
        assertEquals("joe",survivor.getName());
    }
    @Test
    void getAge() {
        assertNotNull(survivor);
        assertEquals(24,survivor.getAge());
    }

    @Test
    void setAge() {
        assertNotNull(survivor);
        survivor.setAge(24);
        assertEquals(24,survivor.getAge());
    }
    @Test
    void getGender() {
        assertNotNull(survivor);
        assertEquals("male",survivor.getGender());
    }

    @Test
    void setVendorPhoneNumber() {
        assertNotNull(survivor);
        survivor.setGender("male");
        assertEquals("male",survivor.getGender());
    }





}
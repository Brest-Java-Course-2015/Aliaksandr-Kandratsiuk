package com.epam.brest.course2015.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserTest {

    private User user;

    @Before
    public void setUp() throws Exception {
        user = new User();
    }

    @Test
    public void testGetUserId() throws Exception {
        user.setUserId(159);
        assertEquals((Integer)159, user.getUserId());
    }

    @Test
    public void testGetLogin() throws Exception {
        user.setLogin("LOGIN");
        assertEquals("LOGIN", user.getLogin());
    }

    @Test
    public void testGetPassword() throws Exception {
        user.setPassword("Password");
        assertEquals("Password", user.getPassword());
    }

    @Test
    public void testGetCreateDate() throws Exception {
        Date date = new Date(2010, 10, 10);
        user.setCreatedDate(date);
        assertEquals(date, user.getCreatedDate());
    }
}
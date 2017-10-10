/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package news.model;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class NewsTest {
    
    public NewsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Тест создания News
     */
    @Test
    public void testCreateNews() {
        System.out.println("test News CreateNews");
        Date date = new Date(2017, 9, 26);
        byte[] image = new byte[1024];
        News news = new News(1, "title", "shortDescription", "fullDescription", date, image);
        assertEquals(news.getId(), 1);
        assertEquals(news.getTitle(), "title");
        assertEquals(news.getShortDescription(), "shortDescription");
        assertEquals(news.getFullDescription(),  "fullDescription");
        assertEquals(news.getDate(), date);
        assertEquals(news.getImage(), image);
    }

    /**
     * Тест сравнения двух объектов
     */
    @Test
    public void testEquals() {
        System.out.println("test News equals");
        Date date = new Date(2017, 9, 26);
        byte[] image = new byte[1024];
        News news1 = new News(1, "title", "shortDescription", "fullDescription", date, image);
        News news2 = new News(1, "title", "shortDescription", "fullDescription", date, image);
        News news3= new News(2, "title1", "shortDescription1", "fullDescription2", date, image);
        assertTrue(news1.equals(news2));
        assertFalse(news1.equals(news3));
    }

   
    
}

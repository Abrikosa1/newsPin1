/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package news.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
public class CategoryTest {
    
    public CategoryTest() {
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
     * Тест создания категории
     */
    @Test
    public void testCreateCategory() {
        System.out.println("test Category CreateCategory");
        
        Date date = new Date(2017, 9, 26);
        byte[] image = new byte[1024];
        News news1 = new News(1, "title", "shortDescription", "fullDescription", date, image);
        News news2 = new News(2, "title2", "shortDescription2", "fullDescription2", date, image);
        List<News> news = new ArrayList<>();
        news.add(news1);
        news.add(news2);
        
        Category category = new Category(1, "name", news);
        
        assertEquals(category.getId(), 1);
        assertEquals(category.getName(), "name");
        assertEquals(category.getNews(), news);
    }

    /**
     *Тест проверки равенсва Категорий
     */
    @Test
    public void testEquals() {
        System.out.println("test Category equels");
        
        Date date = new Date(2017, 9, 26);
        byte[] image = new byte[1024];
        News news1 = new News(1, "title", "shortDescription", "fullDescription", date, image);
        News news2 = new News(2, "title2", "shortDescription2", "fullDescription2", date, image);
        List<News> news = new ArrayList<>();
        news.add(news1);
        news.add(news2);
        
        Category category1 = new Category(1, "name", news);
        Category category2 = new Category(1, "name", news);
        Category category3 = new Category(2, "name2", news);
        
        assertTrue(category1.equals(category2));
        assertFalse(category1.equals(category3));
    }

   
    
}

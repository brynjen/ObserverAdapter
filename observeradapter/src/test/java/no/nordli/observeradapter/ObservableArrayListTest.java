package no.nordli.observeradapter;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ObservableArrayListTest {
    private ObservableArrayList<String> array;

    @Before
    public void setUp() {
        array = new ObservableArrayList<>();
    }

    @After
    public void tearDown() {
        array = null;
    }

    @Test
    public void testInitialize() {
        Assert.assertNotNull(array);
    }
}
package no.nordli.observeradapter;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObserverAdapterTest {
    private ObserverAdapter<String, Object> observerAdapter;

    @Before
    public void setUp() {
        observerAdapter = new ObserverAdapter<>();
    }

    @After
    public void tearDown() {
        observerAdapter = null;
    }

    @Test
    public void testInitialize() {
        Assert.assertNotNull(observerAdapter);
    }

    @Test
    public void testAddPreferenceListener() {

    }

    @Test
    public void testRemovePreferenceListener() {

    }

    @Test
    public void testAddCausesAdapterToChange() {

    }

    @Test
    public void testRemoveCausesAdapterToChange() {

    }
}
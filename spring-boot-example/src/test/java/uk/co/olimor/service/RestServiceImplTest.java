package uk.co.olimor.service;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test class for the {@link RestServiceImpl} class.
 * 
 * @author lcmor
 *
 */
public class RestServiceImplTest {

	@Test
	public void testGetAccountSummary() {
		assertEquals("Summary JSON String Changed again.", new RestServiceImpl().getAccountSummary("userId"));		
	}
	
	@Test
	public void testGetStatus() {
		assertEquals("I am running.", new RestServiceImpl().getStatus());
	}
	
}

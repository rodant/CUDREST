/**
 * (c) 2012 Acrolinx GmbH. All rights reserved.
 *
 * Created 31.01.13
 *
 *
 * @author rodriguez
 */

package de.itasesor.client.local.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 */
public class ResourceAppNodeTest {
    @Test
    public void testEquals() {
        final ResourceAppNode resource1 = new ResourceAppNode("service", "url1", null, null);
        final ResourceAppNode resource2 = new ResourceAppNode("service", "url2", null, null);

        assertEquals(resource1, resource2);
        assertFalse(resource1.equals(new ResourceAppNode("service1", "url1", null, null)));
    }

    @Test
    public void testCompareTo() {
        final ResourceAppNode resource1 = new ResourceAppNode("service1", "url1", null, null);
        final ResourceAppNode resource2 = new ResourceAppNode("service2", "url2", null, null);

        assertTrue(resource1.compareTo(resource2) < 0);
    }
}

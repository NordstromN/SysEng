package familyTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * This class is not complete. It should test all
 * important aspects of the Family class
 */
public class FamilyTest {
	private Person fred = new Person("Fred", 1.81, 80);
	private Person ann = new Person("Ann", 1.6, 55);
	private Person john = new Person("John", 1.9, 95);

	@Test
	public void testSize() {
		Family family = new Family(2); // Setup
		assertEquals(0, family.size()); // Should initially be size 0
		
		family.add(fred);
		assertEquals(1, family.size()); // And now size 1
		
		family.add(ann);
		assertEquals(2, family.size()); // And now size 2
		
		family.add(john);
		assertEquals(2, family.size()); // Still size 2 (capacity exceeded)
	}

	@Test
	public void testAdd() {
		Family family = new Family(2); // Setup
		family.add(fred);
		assertTrue(family.isMember(fred)); // Fred should be a member
		assertFalse(family.isMember(ann)); // But Ann is not
	}

	// And lots more possible tests...
}

import static org.junit.Assert.*;

import java.util.List;
import java.util.*;

import org.junit.Test;

public class TestAssignment {

	@Test
	public void test() {
		List<Integer> values = new ArrayList<Integer>(); 
		
		values.add(3);
		values.add(7);
		values.add(3);
		values.add(-1);
		values.add(2);
		values.add(3);
		values.add(7);
		values.add(2);
		values.add(15);
		values.add(15);
		
		List<Integer> empty = new ArrayList<Integer>(); 
		
		
		//book test case
		assertEquals(Assignment3.countUnique(values), 5);
		
		//empty test case
		assertEquals(Assignment3.countUnique(empty), 0);
	}

}

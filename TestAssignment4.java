import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.io.*;

class TestAssignment4 {

	@Test
	void test() 
	{
		//Test to see that the map is not unique and contains two keys with the same value.
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Key1", "Different");
		map.put("Key2", "Different");
		
		assertEquals(Assignment4.isUnique(map), false);
		
		//Test to see that the map is indeed filled with unique values
		Map<String, String> map2 = new HashMap<String, String>();
		
		map2.put("Key1", "Different");
		map2.put("Key2", "DifferentString");
		
		assertEquals(Assignment4.isUnique(map2), true);
		
	}

}

package BST;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

public class BSTTest {
	@Test
	public void should_insert_one_node_into_BST()
	{
		//arrange
		BST sut = new BST();
		
		//act
		sut.insert(50, "50");
		
		//assert
		assertThat(sut.get(50), is("50"));
		
	}
}

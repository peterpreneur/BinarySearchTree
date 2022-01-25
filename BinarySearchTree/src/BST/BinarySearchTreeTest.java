package BST;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTreeTest {
	@Test
	public void should_insert_one_node_into_BST_one_level()
	{
		//arrange
		BinarySearchTree<Integer, String> sut = new BinarySearchTree<Integer, String>();
		
		//act
		sut.insert(50, "50");
		
		//assert
		assertThat(sut.get(50), is("50"));
		
	}

	@Test
	public void should_insert_three_node_into_BST_two_levels()
	{
		//arrange
		BinarySearchTree<Integer, String> sut = new BinarySearchTree<Integer, String>();
		
		//act
		sut.insert(50, "50");
		sut.insert(45, "45");
		sut.insert(55, "55");
		
		//assert
		assertThat(sut.get(50), is("50"));
		assertThat(sut.get(45), is("45"));
		assertThat(sut.get(55), is("55"));
		
	}

	@Test
	public void should_insert_three_node_into_BST_three_levels()
	{
		//arrange
		BinarySearchTree<Integer, String> sut = new BinarySearchTree<Integer, String>();
		
		//act
		sut.insert(50, "50");
		sut.insert(45, "45");
		sut.insert(55, "55");
		sut.insert(40, "40");
		sut.insert(47, "47");
		sut.insert(51, "51");
		sut.insert(60, "60");
		
		//assert
		assertThat(sut.get(50), is("50"));
		assertThat(sut.get(45), is("45"));
		assertThat(sut.get(55), is("55"));
		assertThat(sut.get(40), is("40"));
		assertThat(sut.get(47), is("47"));
		assertThat(sut.get(51), is("51"));
		assertThat(sut.get(60), is("60"));
		
	}	
}

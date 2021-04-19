package project5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MorseCodeTreeTest {
	public MorseCodeTree tree;
	TreeNode<String> tree1, tree2;
	
	@BeforeEach
	void setUp() throws Exception {
		tree = new MorseCodeTree();
		tree1 = new TreeNode<String>("l");
		tree2 = new TreeNode<String> ("z");
	}

	@AfterEach
	void tearDown() throws Exception {
		tree = null;
		tree1 = null;
		tree2 = null;
	}

	@Test
	void nodeTest() {
		assertEquals(tree1.getData(), tree.fetch(".-.."));
		assertEquals(tree2.getData(), tree.fetch("--.."));
	}
	
	@Test
	void testRoot() {
		assertEquals("", tree.getRoot().getData());
	}

}

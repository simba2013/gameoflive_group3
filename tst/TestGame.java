import java.util.Arrays;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestGame {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test//测试每个点周围邻居点是1的个数，测试了3个点
	public void test() {
		int[][] a = { { 0, 1, 0 }, { 1, 0, 1 }, { 0, 1, 0 } };
		Life life=new Life(a);
	    int count=life.getN(0,0);
	    Assert.assertEquals(2, count);
	    count=life.getN(0,1);
	    Assert.assertEquals(2, count);
	    count=life.getN(1,1);
	    Assert.assertEquals(4, count);
	}
	@Test//测试1代生命
	public void testNextOne() {
		int[][] a = { { 0, 1, 0 }, { 1, 0, 1 }, { 0, 1, 0 } };
		int[][]nextOne={{0,1,0},{1,0,1},{0,1,0}};
		Life life=new Life(a);
		int[][]nextGen=life.nextGen();
		Assert.assertTrue(Arrays.deepEquals(nextGen, nextOne));
	}
	
}

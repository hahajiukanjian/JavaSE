import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
	@Test // 测试方法
	public void testPrintNumber() {
		StringUtil.printNumber("admin");
		StringUtil.printNumber("");
		StringUtil.printNumber(null);
	}

	@Test
	public void testGetMaxInteger() {
		int index01 = StringUtil.getMaxInteger("admin");
		int index02 = StringUtil.getMaxInteger("");
		int index03 = StringUtil.getMaxInteger(null);
		Assert.assertEquals("方法内部有BUG", 4, index01);
	}

}

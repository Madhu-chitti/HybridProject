package KeyWords;

import org.testng.Assert;

public class ValidationKeywords extends GenericKeywords {
	
	public void validateTitle(String expTitle)
	{
		Assert.assertEquals(driver.getTitle(), expTitle);
	}

}


package gitsecrets;

import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class TestData {
	
	public Properties properties;
	
	TestData() {
		ClassPathResource resource = new ClassPathResource("data/config.properties");
		
		try {
			properties = PropertiesLoaderUtils.loadProperties(resource);
		}catch(Exception e) {
			
		}
		
	}

}
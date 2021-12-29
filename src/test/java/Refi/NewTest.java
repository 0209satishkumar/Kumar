package Refi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws IOException {
	  
	  Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//All.properties");

		p.load(fi);
	  
	  
  }
}

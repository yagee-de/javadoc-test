package de.yagee.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class JavaDocTestTest{

  @Test
  public void getMessage(){
    assertEquals("Hello World!", JavaDocTest.getMessage());
  }
}

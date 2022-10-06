import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalcuatorTest {

  @Test
  public void stringCalcuatorTest() {

    assertEquals(1, calculate("1"));
    assertEquals(2, calculate("1,1"));
    assertEquals(4, calculate("1,1,2"));
    assertEquals(5, calculate("1,1;2a1"));
    assertEquals(0, calculate("Robin"));
  }


  private int calculate(String value) {

    String[] strings = value.split("\\D");
    int valueInt = 0;
    for (String string : strings) {
      valueInt = valueInt + Integer.parseInt(string);
    }
    return valueInt;
  }
}
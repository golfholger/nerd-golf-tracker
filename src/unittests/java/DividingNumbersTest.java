import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DividingNumbersTest {

@Test
public void fizzBuzzTest(){

  assertEquals("1", fizzBuzz(1));
  assertEquals("2", fizzBuzz(2));
  assertEquals("fizz", fizzBuzz(3));
  assertEquals("4", fizzBuzz(4));
  assertEquals("buzz", fizzBuzz(5));
  assertEquals("fizz", fizzBuzz(6));
  assertEquals("fozz", fizzBuzz(7));
  assertEquals("fizzbuzz",fizzBuzz(15));
  assertEquals("fizzfozz", fizzBuzz(21));
  assertEquals("buzzfozz", fizzBuzz(35));
  assertEquals("fizzbuzzfozz",fizzBuzz(105));
  }


private String fizzBuzz(int value){

    String returnValue="";

    if (value%3 == 0){
      returnValue = "fizz";
    }
    if(value%5==0){
      returnValue += "buzz";
    }
    if(value%7 == 0){
      returnValue+= "fozz";
    }
    if(value%3 > 0 && value%5>0 && value%7>0) {
      returnValue = String.valueOf(value);
    }
    return returnValue;
    
  }
}
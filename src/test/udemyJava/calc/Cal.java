package udemyJava.calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Cal {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    public void canAdd()
    {
        int sum= calc.add(0,0);
assertEquals(0,sum,"error");
}
@Test()
@Disabled //prevent this test from being run (deactivate is)
//@ignore  for previous versions of junit before version 5
public void canAdsd()
{
        int sum=calc.add(Integer.MAX_VALUE,1);
        assertEquals(Integer.MAX_VALUE+1L ,sum,"error");
    }
  @Test
  public void annutiy()
  {
      String answer=calc.annuity("22000",7,"0.06",1);
      assertEquals("$184,664.43",answer);
  }
  @Test
  public void annutiy2()
  {
      String answer=calc.annuity("1200",10,"0.08",4);
      assertEquals("$72,482.38",answer);
  }
}
/*
*
* */
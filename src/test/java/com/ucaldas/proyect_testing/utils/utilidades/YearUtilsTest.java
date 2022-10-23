package com.ucaldas.proyect_testing.utils.utilidades;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
Todos los años divisibles por 400son bisiestos(1600,2000,2400)
Todos los años divisibles por 100pero NO por 400NO son bisiestos(1700,1800,1900)
Todos los años divisibles por 4 son bisiestos(1996,2004,2012)
Todos los años que NO son divisibles por 4 NO son bisiestos(2017,2018,2019)

 */

class YearUtilsTest {

  @Test
  public void return_true_when_number_divisible_by_400() {
      Assertions.assertEquals(true, YearUtils.div_by400(1600));
      Assertions.assertEquals(true, YearUtils.div_by400(2000));
      Assertions.assertEquals(true, YearUtils.div_by400(2400));
  }

  @Test
  public void return_true_when_number_divisibles_by_100_not_400(){
      Assertions.assertEquals(true, YearUtils.div100_not400(1700) );
      Assertions.assertEquals(true, YearUtils.div_by400(1800));
      Assertions.assertEquals(true, YearUtils.div_by400(1900));
  }

  @Test
    public void return_true_number_by_4(){
      Assertions.assertEquals(true, YearUtils.div_by_4(1996));
      Assertions.assertEquals(true, YearUtils.div_by_4(2004));
      Assertions.assertEquals(true, YearUtils.div_by_4(2012));
  }

  @Test
    public void return_false_diferent_by_4() {
      Assertions.assertFalse(YearUtils.div_by_4(1997));
  }

}
package com.math.arithimatic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArithimaticTest {

  public Arithimatic arithimatic;

  @BeforeEach
  public void setUp() {
    arithimatic = new Arithimatic();
  }

  @Test
  public void testSum() {
    int sum = arithimatic.sum(2, 2);
    Assertions.assertEquals(4, sum);
  }

}
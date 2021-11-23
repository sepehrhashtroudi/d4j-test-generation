/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 23 19:30:17 GMT 2021
 */

package org.apache.commons.codec;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.StringEncoderComparator;
import org.apache.commons.codec.language.Metaphone;
import org.apache.commons.codec.net.URLCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringEncoderComparator_ESTest extends StringEncoderComparator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator(metaphone0);
      int int0 = stringEncoderComparator0.compare("_Ya8BF>mp;Y", " encoded content");
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator(uRLCodec0);
      int int0 = stringEncoderComparator0.compare("", "r0%3Dul%3An%24%2Cr%5CX");
      assertEquals((-32), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        stringEncoderComparator0.compare(object0, "FyCo>\"y&o0tn;Mng");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.StringEncoderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator(metaphone0);
      Object object0 = new Object();
      int int0 = stringEncoderComparator0.compare(object0, object0);
      assertEquals(0, int0);
  }
}

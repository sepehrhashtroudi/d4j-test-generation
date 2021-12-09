/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 26 22:16:29 GMT 2021
 */

package org.apache.commons.codec;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.StringEncoderComparator;
import org.apache.commons.codec.language.Caverphone;
import org.apache.commons.codec.language.DoubleMetaphone;
import org.apache.commons.codec.language.RefinedSoundex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringEncoderComparator_ESTest extends StringEncoderComparator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Caverphone caverphone0 = new Caverphone();
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator(caverphone0);
      Integer integer0 = new Integer((-663));
      Object object0 = new Object();
      int int0 = stringEncoderComparator0.compare(integer0, object0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = RefinedSoundex.US_ENGLISH;
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator(refinedSoundex0);
      int int0 = stringEncoderComparator0.compare("W0", "'");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.setMaxCodeLen((-2318));
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator(doubleMetaphone0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        stringEncoderComparator0.compare("MANGER", object0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      char[] charArray0 = new char[4];
      RefinedSoundex refinedSoundex0 = new RefinedSoundex(charArray0);
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator(refinedSoundex0);
      // Undeclared exception!
      try { 
        stringEncoderComparator0.compare("4_h", "4_h");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.codec.language.RefinedSoundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator();
      // Undeclared exception!
      try { 
        stringEncoderComparator0.compare("", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.StringEncoderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Caverphone caverphone0 = new Caverphone();
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator(caverphone0);
      int int0 = stringEncoderComparator0.compare(":", "HYM");
      assertEquals((-16), int0);
  }
}

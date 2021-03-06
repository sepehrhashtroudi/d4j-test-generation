/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 26 22:20:39 GMT 2021
 */

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.StringEncoderComparator;
import org.apache.commons.codec.language.Metaphone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringEncoderComparator_ESTest extends StringEncoderComparator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator(metaphone0);
      int int0 = stringEncoderComparator0.compare("BkltiD|UJT-nb?", "");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator(metaphone0);
      int int0 = stringEncoderComparator0.compare("BKLTTJTNB", "\"e]LZ8[fL");
      assertEquals((-10), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator();
      // Undeclared exception!
      try { 
        stringEncoderComparator0.compare((Object) null, (Object) null);
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
      int int0 = stringEncoderComparator0.compare(metaphone0, metaphone0);
      assertEquals(0, int0);
  }
}

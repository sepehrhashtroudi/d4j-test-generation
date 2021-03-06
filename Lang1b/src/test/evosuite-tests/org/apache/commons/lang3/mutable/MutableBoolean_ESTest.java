/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 09 04:48:35 GMT 2021
 */

package org.apache.commons.lang3.mutable;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MutableBoolean_ESTest extends MutableBoolean_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutableBoolean mutableBoolean0 = new MutableBoolean();
      mutableBoolean0.setValue(true);
      mutableBoolean0.toBoolean();
      assertFalse(mutableBoolean0.isFalse());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      MutableBoolean mutableBoolean0 = new MutableBoolean(boolean0);
      Boolean boolean1 = mutableBoolean0.getValue();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutableBoolean mutableBoolean0 = new MutableBoolean(true);
      boolean boolean0 = mutableBoolean0.booleanValue();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutableBoolean mutableBoolean0 = new MutableBoolean();
      // Undeclared exception!
      try { 
        mutableBoolean0.setValue((Boolean) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableBoolean", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutableBoolean mutableBoolean0 = new MutableBoolean();
      // Undeclared exception!
      try { 
        mutableBoolean0.compareTo((MutableBoolean) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableBoolean", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutableBoolean mutableBoolean0 = null;
      try {
        mutableBoolean0 = new MutableBoolean((Boolean) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.mutable.MutableBoolean", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutableBoolean mutableBoolean0 = new MutableBoolean(false);
      boolean boolean0 = mutableBoolean0.booleanValue();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutableBoolean mutableBoolean0 = new MutableBoolean();
      Boolean boolean0 = Boolean.valueOf(true);
      MutableBoolean mutableBoolean1 = new MutableBoolean();
      mutableBoolean1.setValue(boolean0);
      int int0 = mutableBoolean0.compareTo(mutableBoolean1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutableBoolean mutableBoolean0 = new MutableBoolean();
      int int0 = mutableBoolean0.compareTo(mutableBoolean0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutableBoolean mutableBoolean0 = new MutableBoolean();
      mutableBoolean0.setValue(true);
      MutableBoolean mutableBoolean1 = new MutableBoolean();
      int int0 = mutableBoolean0.compareTo(mutableBoolean1);
      assertFalse(mutableBoolean0.isFalse());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutableBoolean mutableBoolean0 = new MutableBoolean();
      mutableBoolean0.setValue(true);
      mutableBoolean0.hashCode();
      assertTrue(mutableBoolean0.booleanValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutableBoolean mutableBoolean0 = new MutableBoolean(false);
      mutableBoolean0.hashCode();
      assertFalse(mutableBoolean0.getValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      MutableBoolean mutableBoolean0 = new MutableBoolean(boolean0);
      MutableBoolean mutableBoolean1 = new MutableBoolean(false);
      boolean boolean1 = mutableBoolean0.equals(mutableBoolean1);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      MutableBoolean mutableBoolean0 = new MutableBoolean(boolean0);
      boolean boolean1 = mutableBoolean0.equals(mutableBoolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      MutableBoolean mutableBoolean0 = new MutableBoolean(boolean0);
      boolean boolean1 = mutableBoolean0.equals("");
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutableBoolean mutableBoolean0 = new MutableBoolean();
      boolean boolean0 = mutableBoolean0.isFalse();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MutableBoolean mutableBoolean0 = new MutableBoolean(false);
      boolean boolean0 = mutableBoolean0.isTrue();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MutableBoolean mutableBoolean0 = new MutableBoolean();
      String string0 = mutableBoolean0.toString();
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      MutableBoolean mutableBoolean0 = new MutableBoolean(boolean0);
      boolean boolean1 = mutableBoolean0.isTrue();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MutableBoolean mutableBoolean0 = new MutableBoolean();
      mutableBoolean0.setValue(true);
      boolean boolean0 = mutableBoolean0.isFalse();
      assertTrue(mutableBoolean0.booleanValue());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MutableBoolean mutableBoolean0 = new MutableBoolean(false);
      Boolean boolean0 = mutableBoolean0.toBoolean();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MutableBoolean mutableBoolean0 = new MutableBoolean();
      Boolean boolean0 = mutableBoolean0.getValue();
      assertFalse(boolean0);
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 09 03:56:16 GMT 2021
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.builder.StandardToStringStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StandardToStringStyle_ESTest extends StandardToStringStyle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.setUseIdentityHashCode(false);
      boolean boolean0 = standardToStringStyle0.isUseIdentityHashCode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.setUseFieldNames(false);
      boolean boolean0 = standardToStringStyle0.isUseFieldNames();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.setUseClassName(false);
      boolean boolean0 = standardToStringStyle0.isUseClassName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.setDefaultFullDetail(false);
      boolean boolean0 = standardToStringStyle0.isDefaultFullDetail();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.setArrayContentDetail(false);
      boolean boolean0 = standardToStringStyle0.isArrayContentDetail();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.setSummaryObjectStartText("");
      String string0 = standardToStringStyle0.getSummaryObjectStartText();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.setSummaryObjectEndText("");
      String string0 = standardToStringStyle0.getSummaryObjectEndText();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.setSizeStartText("");
      String string0 = standardToStringStyle0.getSizeStartText();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.setSizeEndText("");
      String string0 = standardToStringStyle0.getSizeEndText();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.setNullText("");
      String string0 = standardToStringStyle0.getNullText();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.setFieldSeparator((String) null);
      String string0 = standardToStringStyle0.getFieldSeparator();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.setFieldNameValueSeparator("");
      String string0 = standardToStringStyle0.getFieldNameValueSeparator();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.setContentStart("");
      String string0 = standardToStringStyle0.getContentStart();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.setContentEnd("");
      String string0 = standardToStringStyle0.getContentEnd();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.setArrayStart("");
      String string0 = standardToStringStyle0.getArrayStart();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.setArraySeparator((String) null);
      String string0 = standardToStringStyle0.getArraySeparator();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.setArrayEnd("");
      String string0 = standardToStringStyle0.getArrayEnd();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      String string0 = standardToStringStyle0.getNullText();
      assertEquals("<null>", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      boolean boolean0 = standardToStringStyle0.isUseClassName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      boolean boolean0 = standardToStringStyle0.isFieldSeparatorAtStart();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      String string0 = standardToStringStyle0.getContentStart();
      assertEquals("[", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.setUseShortClassName(true);
      boolean boolean0 = standardToStringStyle0.isUseShortClassName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      String string0 = standardToStringStyle0.getFieldSeparator();
      assertEquals(",", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      String string0 = standardToStringStyle0.getContentEnd();
      assertEquals("]", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      boolean boolean0 = standardToStringStyle0.isUseShortClassName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.setFieldSeparatorAtEnd(true);
      boolean boolean0 = standardToStringStyle0.isFieldSeparatorAtEnd();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      boolean boolean0 = standardToStringStyle0.isUseFieldNames();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      String string0 = standardToStringStyle0.getSummaryObjectStartText();
      assertEquals("<", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.setFieldSeparatorAtStart(true);
      boolean boolean0 = standardToStringStyle0.isFieldSeparatorAtStart();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      String string0 = standardToStringStyle0.getSizeStartText();
      assertEquals("<size=", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      String string0 = standardToStringStyle0.getArrayEnd();
      assertEquals("}", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      String string0 = standardToStringStyle0.getSummaryObjectEndText();
      assertEquals(">", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      String string0 = standardToStringStyle0.getArrayStart();
      assertEquals("{", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      boolean boolean0 = standardToStringStyle0.isUseIdentityHashCode();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      String string0 = standardToStringStyle0.getSizeEndText();
      assertEquals(">", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      String string0 = standardToStringStyle0.getFieldNameValueSeparator();
      assertEquals("=", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      boolean boolean0 = standardToStringStyle0.isFieldSeparatorAtEnd();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      boolean boolean0 = standardToStringStyle0.isArrayContentDetail();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      String string0 = standardToStringStyle0.getArraySeparator();
      assertEquals(",", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      boolean boolean0 = standardToStringStyle0.isDefaultFullDetail();
      assertTrue(boolean0);
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 26 22:26:59 GMT 2021
 */

package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StringReader;
import org.apache.commons.csv.CSVFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CSVFormat_ESTest extends CSVFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[1];
      CSVFormat cSVFormat0 = new CSVFormat('5', 'b', ';', 'L', true, true, "bfyu", stringArray0);
      StringReader stringReader0 = new StringReader("");
      cSVFormat0.parse(stringReader0);
      assertTrue(cSVFormat0.isCommentingEnabled());
      assertTrue(cSVFormat0.isEmptyLinesIgnored());
      assertEquals('b', cSVFormat0.getEncapsulator());
      assertEquals('5', cSVFormat0.getDelimiter());
      assertEquals(';', cSVFormat0.getCommentStart());
      assertTrue(cSVFormat0.isSurroundingSpacesIgnored());
      assertEquals('L', cSVFormat0.getEscape());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[5];
      CSVFormat cSVFormat0 = new CSVFormat('T', '\"', 'E', '\"', false, false, (String) null, stringArray0);
      cSVFormat0.validate();
      assertFalse(cSVFormat0.isSurroundingSpacesIgnored());
      assertEquals('\"', cSVFormat0.getEncapsulator());
      assertEquals('\"', cSVFormat0.getEscape());
      assertEquals('T', cSVFormat0.getDelimiter());
      assertEquals('E', cSVFormat0.getCommentStart());
      assertFalse(cSVFormat0.isEmptyLinesIgnored());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withDelimiter('v');
      StringReader stringReader0 = new StringReader("");
      cSVFormat1.parse(stringReader0);
      assertFalse(cSVFormat1.isCommentingEnabled());
      assertEquals('\\', cSVFormat1.getEscape());
      assertEquals('\uFFFE', cSVFormat1.getEncapsulator());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals('v', cSVFormat1.getDelimiter());
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVFormat cSVFormat1 = cSVFormat0.withEscape('\t');
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertTrue(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals('\"', cSVFormat1.getEncapsulator());
      assertEquals('\t', cSVFormat1.getEscape());
      assertTrue(cSVFormat1.isEmptyLinesIgnored());
      assertFalse(cSVFormat1.isCommentingEnabled());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart('(');
      CSVFormat cSVFormat2 = cSVFormat1.withSurroundingSpacesIgnored(true);
      assertEquals(',', cSVFormat2.getDelimiter());
      assertEquals('(', cSVFormat1.getCommentStart());
      assertEquals('\"', cSVFormat1.getEncapsulator());
      assertEquals(',', cSVFormat1.getDelimiter());
      assertEquals('(', cSVFormat2.getCommentStart());
      assertTrue(cSVFormat1.isEmptyLinesIgnored());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals('\"', cSVFormat2.getEncapsulator());
      assertEquals('\uFFFE', cSVFormat1.getEscape());
      assertTrue(cSVFormat2.isSurroundingSpacesIgnored());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat0 = new CSVFormat('q', 'q', 'z', 'q', true, true, "No header was specified, the record values can't be accessed by name", stringArray0);
      CSVFormat cSVFormat1 = cSVFormat0.withLineSeparator("No header was specified, the record values can't be accessed by name");
      assertEquals('q', cSVFormat0.getDelimiter());
      assertTrue(cSVFormat0.isSurroundingSpacesIgnored());
      assertEquals('q', cSVFormat0.getEscape());
      assertEquals('q', cSVFormat0.getEncapsulator());
      assertTrue(cSVFormat0.isEmptyLinesIgnored());
      assertEquals('z', cSVFormat1.getCommentStart());
      assertEquals('q', cSVFormat1.getEscape());
      assertEquals('q', cSVFormat1.getEncapsulator());
      assertEquals('z', cSVFormat0.getCommentStart());
      assertEquals('q', cSVFormat1.getDelimiter());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.TDF.withLineSeparator("No header was specified, the record values can't be accessed by name");
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat2 = cSVFormat1.withHeader(stringArray0);
      assertEquals('\t', cSVFormat2.getDelimiter());
      assertEquals('\"', cSVFormat1.getEncapsulator());
      assertTrue(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertEquals('\uFFFE', cSVFormat1.getEscape());
      assertEquals('\uFFFE', cSVFormat1.getCommentStart());
      assertEquals('\"', cSVFormat2.getEncapsulator());
      assertTrue(cSVFormat1.isEmptyLinesIgnored());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat0 = new CSVFormat('V', '^', 'q', 'g', false, true, "sGfKE", stringArray0);
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      assertEquals('g', cSVFormat0.getEscape());
      assertFalse(cSVFormat0.isSurroundingSpacesIgnored());
      assertEquals('q', cSVFormat0.getCommentStart());
      assertEquals('q', cSVFormat1.getCommentStart());
      assertEquals('^', cSVFormat1.getEncapsulator());
      assertEquals('^', cSVFormat0.getEncapsulator());
      assertTrue(cSVFormat0.isEmptyLinesIgnored());
      assertEquals('V', cSVFormat1.getDelimiter());
      assertEquals('g', cSVFormat1.getEscape());
      assertEquals('V', cSVFormat0.getDelimiter());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart('(');
      CSVFormat cSVFormat2 = cSVFormat1.withEscape('(');
      assertEquals(',', cSVFormat2.getDelimiter());
      assertTrue(cSVFormat2.isCommentingEnabled());
      assertEquals(',', cSVFormat1.getDelimiter());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals('(', cSVFormat1.getCommentStart());
      assertEquals('\uFFFE', cSVFormat1.getEscape());
      assertEquals('\"', cSVFormat1.getEncapsulator());
      assertTrue(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('\"', cSVFormat2.getEncapsulator());
      assertEquals('(', cSVFormat2.getEscape());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withEncapsulator('');
      assertEquals('\\', cSVFormat1.getEscape());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('', cSVFormat1.getEncapsulator());
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertEquals('\uFFFE', cSVFormat1.getCommentStart());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat0 = new CSVFormat('q', 'q', 'z', 'q', true, true, "No header was specified, the record values can't be accessed by name", stringArray0);
      CSVFormat cSVFormat1 = cSVFormat0.withEncapsulator('z');
      assertTrue(cSVFormat0.isEmptyLinesIgnored());
      assertEquals('q', cSVFormat1.getEscape());
      assertEquals('q', cSVFormat1.getDelimiter());
      assertEquals('q', cSVFormat0.getEscape());
      assertEquals('z', cSVFormat0.getCommentStart());
      assertEquals('z', cSVFormat1.getEncapsulator());
      assertTrue(cSVFormat0.isSurroundingSpacesIgnored());
      assertEquals('q', cSVFormat0.getDelimiter());
      assertEquals('q', cSVFormat0.getEncapsulator());
      assertTrue(cSVFormat1.isCommentingEnabled());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVFormat cSVFormat1 = cSVFormat0.withSurroundingSpacesIgnored(true);
      CSVFormat cSVFormat2 = cSVFormat1.withEmptyLinesIgnored(false);
      assertTrue(cSVFormat1.isSurroundingSpacesIgnored());
      assertFalse(cSVFormat2.isEmptyLinesIgnored());
      assertTrue(cSVFormat2.isSurroundingSpacesIgnored());
      assertEquals('\"', cSVFormat1.getEncapsulator());
      assertEquals(',', cSVFormat2.getDelimiter());
      assertEquals(',', cSVFormat1.getDelimiter());
      assertEquals('\"', cSVFormat2.getEncapsulator());
      assertFalse(cSVFormat1.isCommentingEnabled());
      assertEquals('\uFFFE', cSVFormat1.getEscape());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.EXCEL.withEmptyLinesIgnored(true);
      assertEquals('\"', cSVFormat1.getEncapsulator());
      assertEquals(',', cSVFormat1.getDelimiter());
      assertEquals('\uFFFE', cSVFormat1.getCommentStart());
      assertEquals('\uFFFE', cSVFormat1.getEscape());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertTrue(cSVFormat1.isEmptyLinesIgnored());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart('(');
      CSVFormat cSVFormat2 = cSVFormat1.withEmptyLinesIgnored(false);
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals('\"', cSVFormat1.getEncapsulator());
      assertEquals(',', cSVFormat1.getDelimiter());
      assertEquals('\"', cSVFormat2.getEncapsulator());
      assertEquals('(', cSVFormat1.getCommentStart());
      assertTrue(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('\uFFFE', cSVFormat1.getEscape());
      assertEquals(',', cSVFormat2.getDelimiter());
      assertEquals('(', cSVFormat2.getCommentStart());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVFormat cSVFormat1 = cSVFormat0.RFC4180.withCommentStart('t');
      CSVFormat cSVFormat2 = cSVFormat1.withDelimiter('<');
      assertEquals('\"', cSVFormat2.getEncapsulator());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals(',', cSVFormat1.getDelimiter());
      assertEquals('\"', cSVFormat1.getEncapsulator());
      assertEquals('t', cSVFormat2.getCommentStart());
      assertEquals('\uFFFE', cSVFormat1.getEscape());
      assertEquals('t', cSVFormat1.getCommentStart());
      assertEquals('<', cSVFormat2.getDelimiter());
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart('\uFFFE');
      assertEquals('\uFFFE', cSVFormat1.getEncapsulator());
      assertEquals('\\', cSVFormat1.getEscape());
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertEquals('\uFFFE', cSVFormat1.getCommentStart());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      boolean boolean0 = cSVFormat0.isSurroundingSpacesIgnored();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      boolean boolean0 = cSVFormat0.isEscaping();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      boolean boolean0 = cSVFormat0.isEscaping();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      boolean boolean0 = cSVFormat0.isEncapsulating();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      boolean boolean0 = cSVFormat0.isEncapsulating();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVFormat cSVFormat1 = cSVFormat0.withEmptyLinesIgnored(false);
      boolean boolean0 = cSVFormat1.isEmptyLinesIgnored();
      assertEquals('\"', cSVFormat1.getEncapsulator());
      assertEquals(',', cSVFormat1.getDelimiter());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals('\uFFFE', cSVFormat1.getEscape());
      assertFalse(cSVFormat1.isCommentingEnabled());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[6];
      CSVFormat cSVFormat0 = new CSVFormat('S', '+', '+', 'o', true, true, (String) null, stringArray0);
      cSVFormat0.getLineSeparator();
      assertEquals('S', cSVFormat0.getDelimiter());
      assertTrue(cSVFormat0.isSurroundingSpacesIgnored());
      assertTrue(cSVFormat0.isEmptyLinesIgnored());
      assertEquals('o', cSVFormat0.getEscape());
      assertEquals('+', cSVFormat0.getCommentStart());
      assertEquals('+', cSVFormat0.getEncapsulator());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVFormat cSVFormat1 = cSVFormat0.withLineSeparator("");
      cSVFormat1.getLineSeparator();
      assertEquals(',', cSVFormat1.getDelimiter());
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('\"', cSVFormat1.getEncapsulator());
      assertEquals('\uFFFE', cSVFormat1.getEscape());
      assertEquals('\uFFFE', cSVFormat1.getCommentStart());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      String[] stringArray0 = cSVFormat0.getHeader();
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[7];
      CSVFormat cSVFormat0 = new CSVFormat('O', 'O', 'G', 'O', false, false, "7m>V]3r~<11rg", stringArray0);
      cSVFormat0.getHeader();
      assertEquals('G', cSVFormat0.getCommentStart());
      assertEquals('O', cSVFormat0.getEncapsulator());
      assertFalse(cSVFormat0.isEmptyLinesIgnored());
      assertFalse(cSVFormat0.isSurroundingSpacesIgnored());
      assertEquals('O', cSVFormat0.getDelimiter());
      assertEquals('O', cSVFormat0.getEscape());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat0 = new CSVFormat('q', 'q', 'z', 'q', true, true, "No header was specified, the record values can't be accessed by name", stringArray0);
      cSVFormat0.getHeader();
      assertEquals('q', cSVFormat0.getDelimiter());
      assertTrue(cSVFormat0.isEmptyLinesIgnored());
      assertTrue(cSVFormat0.isSurroundingSpacesIgnored());
      assertEquals('z', cSVFormat0.getCommentStart());
      assertEquals('q', cSVFormat0.getEscape());
      assertEquals('q', cSVFormat0.getEncapsulator());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat0 = new CSVFormat('&', '&', '&', '6', false, false, (String) null, stringArray0);
      char char0 = cSVFormat0.getEscape();
      assertEquals('&', cSVFormat0.getDelimiter());
      assertFalse(cSVFormat0.isEmptyLinesIgnored());
      assertEquals('&', cSVFormat0.getEncapsulator());
      assertEquals('6', char0);
      assertFalse(cSVFormat0.isSurroundingSpacesIgnored());
      assertEquals('&', cSVFormat0.getCommentStart());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat0 = new CSVFormat('q', 'q', 'z', 'q', true, true, "No header was specified, the record values can't be accessed by name", stringArray0);
      char char0 = cSVFormat0.getEscape();
      assertEquals('q', char0);
      assertEquals('q', cSVFormat0.getEncapsulator());
      assertTrue(cSVFormat0.isSurroundingSpacesIgnored());
      assertEquals('q', cSVFormat0.getDelimiter());
      assertEquals('z', cSVFormat0.getCommentStart());
      assertTrue(cSVFormat0.isEmptyLinesIgnored());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVFormat cSVFormat1 = cSVFormat0.withEncapsulator('3');
      CSVFormat cSVFormat2 = cSVFormat1.withLineSeparator("");
      char char0 = cSVFormat2.getEncapsulator();
      assertTrue(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('\uFFFE', cSVFormat1.getEscape());
      assertEquals('\uFFFE', cSVFormat1.getCommentStart());
      assertEquals('3', cSVFormat1.getEncapsulator());
      assertEquals('\t', cSVFormat2.getDelimiter());
      assertTrue(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals('3', char0);
      assertEquals('\t', cSVFormat1.getDelimiter());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[1];
      CSVFormat cSVFormat0 = new CSVFormat('(', 'S', '+', '?', true, true, "a", stringArray0);
      char char0 = cSVFormat0.getEncapsulator();
      assertEquals('S', char0);
      assertTrue(cSVFormat0.isEmptyLinesIgnored());
      assertEquals('?', cSVFormat0.getEscape());
      assertEquals('+', cSVFormat0.getCommentStart());
      assertEquals('(', cSVFormat0.getDelimiter());
      assertTrue(cSVFormat0.isSurroundingSpacesIgnored());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withDelimiter('8');
      char char0 = cSVFormat1.getDelimiter();
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals('\uFFFE', cSVFormat1.getEncapsulator());
      assertFalse(cSVFormat1.isCommentingEnabled());
      assertEquals('\\', cSVFormat1.getEscape());
      assertEquals('8', char0);
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String[] stringArray0 = new String[3];
      CSVFormat cSVFormat0 = new CSVFormat('c', '6', '6', '6', true, true, "QYS?'", stringArray0);
      char char0 = cSVFormat0.getDelimiter();
      assertEquals('6', cSVFormat0.getCommentStart());
      assertTrue(cSVFormat0.isSurroundingSpacesIgnored());
      assertEquals('c', char0);
      assertEquals('6', cSVFormat0.getEncapsulator());
      assertEquals('6', cSVFormat0.getEscape());
      assertTrue(cSVFormat0.isEmptyLinesIgnored());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      char char0 = cSVFormat0.getCommentStart();
      assertEquals('\uFFFE', char0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart('u');
      char char0 = cSVFormat1.getCommentStart();
      assertEquals(',', cSVFormat1.getDelimiter());
      assertEquals('u', char0);
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertTrue(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('\uFFFE', cSVFormat1.getEscape());
      assertEquals('\"', cSVFormat1.getEncapsulator());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      String[] stringArray0 = new String[3];
      String string0 = cSVFormat0.format(stringArray0);
      assertEquals("\"\",,", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      // Undeclared exception!
      try { 
        cSVFormat0.EXCEL.parse((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVFormat cSVFormat1 = cSVFormat0.withEscape(',');
      StringReader stringReader0 = new StringReader("8=ZH+^FzkQ333");
      // Undeclared exception!
      try { 
        cSVFormat1.parse(stringReader0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The escape character and the delimiter cannot be the same (\",\")
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      // Undeclared exception!
      try { 
        cSVFormat0.TDF.format((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.csv.CSVPrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      boolean boolean0 = cSVFormat0.isCommentingEnabled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      boolean boolean0 = cSVFormat0.isSurroundingSpacesIgnored();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      char char0 = cSVFormat0.getEscape();
      assertEquals('\uFFFE', char0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      String string0 = cSVFormat0.getLineSeparator();
      assertEquals("\r\n", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      char char0 = cSVFormat0.getEncapsulator();
      assertEquals('\"', char0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      boolean boolean0 = cSVFormat0.isEmptyLinesIgnored();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String[] stringArray0 = new String[3];
      CSVFormat cSVFormat0 = new CSVFormat('c', '6', '6', '6', true, true, "QYS?'", stringArray0);
      char char0 = cSVFormat0.getCommentStart();
      assertEquals('6', cSVFormat0.getEscape());
      assertEquals('6', char0);
      assertEquals('6', cSVFormat0.getEncapsulator());
      assertEquals('c', cSVFormat0.getDelimiter());
      assertTrue(cSVFormat0.isSurroundingSpacesIgnored());
      assertTrue(cSVFormat0.isEmptyLinesIgnored());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      char char0 = cSVFormat0.getDelimiter();
      assertEquals('\t', char0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String[] stringArray0 = new String[32];
      CSVFormat cSVFormat0 = new CSVFormat('H', 'H', 'H', 'H', true, true, "L", stringArray0);
      String string0 = cSVFormat0.toString();
      assertEquals("Delimiter=<H> Escape=<H> Encapsulator=<H> CommentStart=<H> EmptyLines:ignored SurroundingSpaces:ignored", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String[] stringArray0 = new String[3];
      CSVFormat cSVFormat0 = new CSVFormat('v', '1', '1', 'v', true, false, "e^Q3khO+}/F", stringArray0);
      boolean boolean0 = cSVFormat0.isCommentingEnabled();
      assertEquals('1', cSVFormat0.getEncapsulator());
      assertEquals('v', cSVFormat0.getDelimiter());
      assertFalse(cSVFormat0.isEmptyLinesIgnored());
      assertEquals('v', cSVFormat0.getEscape());
      assertTrue(cSVFormat0.isSurroundingSpacesIgnored());
      assertTrue(boolean0);
      assertEquals('1', cSVFormat0.getCommentStart());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      String string0 = cSVFormat0.TDF.toString();
      assertEquals("Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVFormat cSVFormat1 = cSVFormat0.withEscape('*');
      CSVFormat cSVFormat2 = cSVFormat1.withCommentStart('*');
      try { 
        cSVFormat2.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The comment start and the escape character cannot be the same (\"*\")
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVFormat cSVFormat1 = cSVFormat0.withEncapsulator('e');
      CSVFormat cSVFormat2 = cSVFormat1.withCommentStart('e');
      try { 
        cSVFormat2.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The comment start character and the encapsulator cannot be the same (\"e\")
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat1 = cSVFormat0.withDelimiter('@');
      CSVFormat cSVFormat2 = cSVFormat1.withCommentStart('@');
      // Undeclared exception!
      try { 
        cSVFormat2.format(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The comment start character and the delimiter cannot be the same (\"@\")
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVFormat cSVFormat1 = cSVFormat0.withDelimiter('a');
      CSVFormat cSVFormat2 = cSVFormat1.withEscape('a');
      try { 
        cSVFormat2.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The escape character and the delimiter cannot be the same (\"a\")
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String[] stringArray0 = new String[32];
      CSVFormat cSVFormat0 = new CSVFormat('H', 'H', 'H', 'H', true, true, "L", stringArray0);
      try { 
        cSVFormat0.validate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The encapsulator character and the delimiter cannot be the same (\"H\")
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      assertEquals('\uFFFE', cSVFormat1.getEncapsulator());
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertFalse(cSVFormat1.isCommentingEnabled());
      assertEquals('\\', cSVFormat1.getEscape());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withEmptyLinesIgnored(false);
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('\\', cSVFormat1.getEscape());
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertEquals('\uFFFE', cSVFormat1.getEncapsulator());
      assertEquals('\uFFFE', cSVFormat1.getCommentStart());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.MYSQL.withSurroundingSpacesIgnored(false);
      assertEquals('\\', cSVFormat1.getEscape());
      assertEquals('\uFFFE', cSVFormat1.getEncapsulator());
      assertFalse(cSVFormat1.isCommentingEnabled());
      assertFalse(cSVFormat1.isSurroundingSpacesIgnored());
      assertFalse(cSVFormat1.isEmptyLinesIgnored());
      assertEquals('\t', cSVFormat1.getDelimiter());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      String[] stringArray0 = new String[0];
      String string0 = cSVFormat0.format(stringArray0);
      assertEquals("", string0);
  }
}

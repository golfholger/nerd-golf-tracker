package de.itagile.golf.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArabicToRomanNumber {

  @Test
  public void testZahlenKonverter() {
    assertEquals("I", konvertiereArabischZuRoemisch(1));
    assertEquals("II", konvertiereArabischZuRoemisch(2));
    assertEquals("III", konvertiereArabischZuRoemisch(3));
    assertEquals("IV", konvertiereArabischZuRoemisch(4));
    assertEquals("V", konvertiereArabischZuRoemisch(5));
    assertEquals("VI", konvertiereArabischZuRoemisch(6));
    assertEquals("VII", konvertiereArabischZuRoemisch(7));
    assertEquals("VIII", konvertiereArabischZuRoemisch(8));
    assertEquals("X", konvertiereArabischZuRoemisch(10));
    assertEquals("XI", konvertiereArabischZuRoemisch(11));
    assertEquals("XII", konvertiereArabischZuRoemisch(12));
    assertEquals("XIII", konvertiereArabischZuRoemisch(13));
    assertEquals("XVIII", konvertiereArabischZuRoemisch(18));
    assertEquals("XX", konvertiereArabischZuRoemisch(20));
  }

  public String konvertiereArabischZuRoemisch(int arabisch) {

    if (arabisch == 4) {
      return "IV";
    }

    if (arabisch >= 10) {
      return "X" + konvertiereArabischZuRoemisch(arabisch - 10);
    }

    if (arabisch >= 5) {
      return "V" + konvertiereArabischZuRoemisch(arabisch - 5);
    }

    if (arabisch > 1) {
      return "I" + konvertiereArabischZuRoemisch(arabisch - 1);
    }

    if (arabisch == 1) {
      return "I";
    }

    return "";
  }
}
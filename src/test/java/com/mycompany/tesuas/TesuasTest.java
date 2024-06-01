/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tesuas;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RizkiMr
 */
public class TesuasTest {

@Test
    public void testBEqualsZero() {
        assertEquals(1, Tesuas.CariNilaiPangkat(2, 0));
        assertEquals(1, Tesuas.CariNilaiPangkat(0, 0));
    }

    @Test
    public void testBNegative() {
        assertEquals(-1, Tesuas.CariNilaiPangkat(2, -3));
    }

    @Test
    public void testBGreaterThanTen() {
        assertEquals(-2, Tesuas.CariNilaiPangkat(2, 11));
    }

    @Test
    public void testAGreaterThanHundred() {
        assertEquals(-2, Tesuas.CariNilaiPangkat(101, 3));
    }

    @Test
    public void testValidPangkat() {
        assertEquals(8, Tesuas.CariNilaiPangkat(2, 3));
        assertEquals(16, Tesuas.CariNilaiPangkat(2, 4));
    }
    
}

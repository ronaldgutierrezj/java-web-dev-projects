package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void disordedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void singleBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void textAndExternalBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void textAndInternalBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launc[hCo]de"));
    }
    @Test
    public void textAndInternalDisorderBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("lau]nc[h"));
    }


    @Test
    public void emptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void noBracketsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("launch"));
    }
    @Test
    public void singleBracketFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[launch"));
    }
    @Test
    public void disorderBracketInTextFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]launch["));
    }
    @Test
    public void text_setbracket_singlebracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("l[au]nc[h"));
    }


}
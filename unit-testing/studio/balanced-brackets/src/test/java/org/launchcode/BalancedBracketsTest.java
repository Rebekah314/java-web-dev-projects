package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTestReturnsTrue() {
        assertEquals(true, true);
    }

    @Test
    public void testZeroBracketsreturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Bekah can code!"));
    }

    @Test
    public void testOpenCloseBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void testCloseBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void testCloseOpenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testTooManyOpenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(("[[]")));
    }

    @Test
    public void testTooManyCloseBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void testBracketsAroundTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void testBracketsBeforeCodeReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void testBracketsBeforeCodeReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][LaunchCode"));
    }

    @Test
    public void testBracketsAfterCodeReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }

    @Test
    public void testBracketsAfterCodeReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]["));
    }

}
package com.ucaldas.proyect_testing.utils.utilidades;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtils2Test {

    @Nested
    @DisplayName("isEmpty method")
    class IsEmpty {

        @Test
        @DisplayName("when string is null")
        void trueWhenNull() {
            assertTrue(StringUtils2.isEmpty(null));
        }

        @Test
        @DisplayName("when string just has spaces")
        void trueWhenEmptySpace() {
            assertTrue(StringUtils2.isEmpty("  "));
        }

        @Test
        @DisplayName("when string is empty")
        void trueWhenEmpty() {
            assertTrue(StringUtils2.isEmpty(""));
        }

        @Test
        @DisplayName("when has chars")
        void falseWhenHasChars() {
            assertFalse(StringUtils2.isEmpty("hello"));
        }

    }

}
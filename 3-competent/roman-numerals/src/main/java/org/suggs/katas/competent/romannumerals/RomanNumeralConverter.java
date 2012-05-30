package org.suggs.katas.competent.romannumerals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementation class for the roman numerals kata.
 * User: suggitpe
 * Date: 21/05/12
 * Time: 11:23
 */
public class RomanNumeralConverter {

    private static Logger LOG = LoggerFactory.getLogger(RomanNumeralConverter.class);
    private Map<Character, Integer> values;

    public RomanNumeralConverter() {
        values = new HashMap<Character, Integer>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
    }

    public Integer convertRomanNumeral(String romanNumeral) {
        int total = 0;
        char[] chars = romanNumeral.toCharArray();
        for (int i = 0; i < chars.length; ++i) {
            if (i + 1 != chars.length && valueOf(chars[i + 1]) > valueOf(chars[i])) {
                total -= valueOf(chars[i]);
            } else {
                total += valueOf(chars[i]);
            }
        }
        return total;
    }

    public int valueOf(char aNumeral) {
        return values.get(aNumeral);
    }
}

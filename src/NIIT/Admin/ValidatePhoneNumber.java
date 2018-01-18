/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIIT.Admin;

/**
 *
 * @author AGARWAL-PC
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {

    private final Pattern pattern;
    private Matcher matcher;

    private static final String CONTACT_PATTERN ="\\d{10}";

    public ValidatePhoneNumber() {
        pattern = Pattern.compile(CONTACT_PATTERN);
    }

    /**
     * Validate hex with regular expression
     * 
     * @param hex
     *            hex for validation
     * @return true valid hex, false invalid hex
     */
    public boolean validate(final String hex) {

        matcher = pattern.matcher(hex);
        return matcher.matches();

    }
}

//
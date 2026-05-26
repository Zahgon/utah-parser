package com.sonalake.utah.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import org.apache.commons.lang3.StringUtils;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

/**
 * Defines the configuration of the plain text parser
 */
@JacksonXmlRootElement(localName = "config")
public class Config {

    /**
     * Each record must be delimited by at least one regex
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "delim")
    protected List<Delimiter> delimiters;

    /**
     * The list of searches that are to be used by  values section to find values using a regex
     */
    @JacksonXmlElementWrapper(localName = "searches")
    @JacksonXmlProperty(localName = "search")
    protected List<NameValue> searches;

    @JacksonXmlProperty(localName = "header-delim")
    protected HeaderDelimiter headerDelimiter;

    /**
     * The list of values in the document header
     */
    @JacksonXmlProperty(localName = "header")
    protected List<ValueRegex> headers;

    /**
     * The list of values in the document
     */
    @JacksonXmlProperty(localName = "values")
    protected List<ValueRegex> values;

    /**
     * Precompile the patterns, but only do it the once.
     */
    void compilePatterns() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Compile the given patterns
     *
     * @param sourceRegexes the source regexes, applied in this order
     */
    private void compilePatterns(List<ValueRegex> sourceRegexes) {
        if (null != sourceRegexes) {
            for (ValueRegex value : sourceRegexes) {
                value.compile(searches);
            }
        }
    }

    /**
     * Build a record from the header text
     *
     * @param headerText the header text
     * @return a map of field name-&gt; value
     */
    public Map<String, String> buildHeader(String headerText) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Build a record from the record text
     *
     * @param recordText the record text
     * @return a map of field name-&gt; value
     */
    public Map<String, String> buildRecord(String recordText) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Build a map of name/values from the record text
     *
     * @param text The candidate text for parsing
     * @return the map of fields -&gt; names
     */
    private Map<String, String> buildMap(List<ValueRegex> values, String text) {
        if (null != values) {
            // skoot through the each of the values in turn, and parse out the fields
            // from the record. We only store the value if the group matches.
            Map<String, String> result = new TreeMap<>();
            for (ValueRegex valueRegex : values) {
                Matcher matcher = valueRegex.buildMatcher(text);
                if (matcher.matches()) {
                    String valueText = matcher.group(valueRegex.getGroup());
                    result.put(valueRegex.getId(), valueText);
                } else if (valueRegex.hasDefaultValue()) {
                    result.put(valueRegex.getId(), valueRegex.getDefaultValue());
                }
            }
            return result;
        } else {
            return Collections.emptyMap();
        }
    }

    /**
     * Does the candidate text match the header?
     *
     * @param candidate the candidate text
     * @return true, if the header delimiter matches the text
     */
    public boolean matchesHeaderDelim(String candidate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Validates if the delimiters are valid. Checks all the delimiters to see if they are well-forrmed
     *
     * @return true if the delimiters are valid
     */
    public boolean isDelimiterValid() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get the applicable delimiter for the candidate. The first delimiter that matches the  text as used.
     *
     * @param candidate the candidate text
     * @return the applicable delimiter, or null if there are none.
     */
    public Delimiter getApplicableDelim(String candidate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Checks if the candidate text matches any of the delimiters
     *
     * @param candidate the candidate text
     * @return true if any of the delimiters match the text, or false otherwise
     */
    public boolean matchesRecordDelim(String candidate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Checks if there is a header delimiter defined
     *
     * @return true if there is a header, or false otherwise.
     */
    public boolean hasHeaderDelim() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getHeaderNames() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

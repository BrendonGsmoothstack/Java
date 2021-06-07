package Smoothstack;

import java.time.Month;
import java.time.Year;
import java.time.LocalDate;
import java.time.DateTimeException;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.ChronoField;
import java.io.PrintStream;
import java.lang.Boolean;

public class JB5_A7 implements TemporalQuery<Boolean> {
    
    // Returns TRUE if the date occurs on Friday the 13th.
    public Boolean queryFrom(TemporalAccessor date) {
        
        return ((date.get(ChronoField.DAY_OF_MONTH) == 13) &&
                (date.get(ChronoField.DAY_OF_WEEK) == 5));
    }
}
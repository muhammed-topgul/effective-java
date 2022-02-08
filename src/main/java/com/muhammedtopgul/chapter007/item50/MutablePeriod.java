package com.muhammedtopgul.chapter007.item50;

import java.util.Date;

/**
 * @author muhammed-topgul
 * @since 08.02.2022 21:29
 */

public final class MutablePeriod {

    private final Date start;
    private final Date end;

    public MutablePeriod(Date start, Date end) {
        if (start.compareTo(end) > 0) {
            throw new IllegalArgumentException(start + " after " + end);
        }

        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Period{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}

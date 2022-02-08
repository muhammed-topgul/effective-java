package com.muhammedtopgul.chapter007.item50;

import java.util.Date;

/**
 * @author muhammed-topgul
 * @since 08.02.2022 21:29
 */

public final class ImmutablePeriod {

    private final Date start;
    private final Date end;

    public ImmutablePeriod(Date start, Date end) {
        if (start.compareTo(end) > 0) {
            throw new IllegalArgumentException(start + " after " + end);
        }

        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
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

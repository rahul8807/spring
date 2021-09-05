package com.apps.poc.datepoc;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * y   = year   (yy or yyyy)
 * M   = month  (MM)
 * d   = day in month (dd)
 * h   = hour (0-12)  (hh)
 * H   = hour (0-23)  (HH)
 * m   = minute in hour (mm)
 * s   = seconds (ss)
 * S   = milliseconds (SSS)
 * z   = time zone  text        (e.g. Pacific Standard Time...)
 * Z   = time zone, time offset (e.g. -0800)
 *
 */
public class SimpleFormatter {

    public static void main ( String[] args ) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat ( "dd/MMM/yyyy" );
        System.out.println (simpleDateFormat.format ( new Date (  ) ) );

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss.SSS Z " );
        System.out.println (simpleDateFormat1.format ( new Date (  ) ) );

    }
}

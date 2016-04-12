package com.lobo;

/**
 * Created by lobochu on 4/12/16.
 */
public class PhoneClock {

    private CityClock cityClock;
    private int utcOffset;

    public PhoneClock(int utcOffset) {
        this.utcOffset = utcOffset;
    }

    public void setCityClock(CityClock cityClock) {
        this.cityClock = cityClock;
    }

    public void setTime(int time) {
        cityClock.setUtcZeroTime(time - this.utcOffset);
    }
}

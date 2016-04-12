package com.lobo;

/**
 * Created by lobochu on 4/12/16.
 */
public class CityClock {
    private int utcOffset;
    private int utcZeroTime;

    public CityClock(int utcOffset) {
        this.utcOffset = utcOffset;
    }

    public int getTime() {
        // TODO: 4/12/16 The fake value with the production code and the expected test value in the test code are duplicated.
        return this.utcOffset + this.utcZeroTime;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
    }
}

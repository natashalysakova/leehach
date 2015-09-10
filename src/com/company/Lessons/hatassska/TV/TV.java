package com.company.Lessons.hatassska.TV;

/**
 * Created by natas on 07.09.2015.
 */
public class TV {
    private boolean IsOn = false;
    private int CurrentChannel = 1;
    private int Volume = 50;

    @Override
    public String toString() {
        if (IsOn) {
            return "TV is on. It set on " + CurrentChannel + ". Volume set on " + Volume;
        } else {
            return "TV is off";
        }
    }

    public String onOffTv() {
        IsOn = !IsOn;
        if (IsOn) {
            return "TV is on.";
        } else {
            return "TV is off.";
        }
    }

    public String upCurrentChannel() {

        if (!IsOn)
            return this.toString();

        CurrentChannel += 1;
        if (CurrentChannel > 100) {
            CurrentChannel = 1;
        }

        return "Current channel is " + CurrentChannel;
    }

    public String downCurrentChannel() {
        if (!IsOn)
            return this.toString();

        CurrentChannel -= 1;
        if (CurrentChannel < 1) {
            CurrentChannel = 100;
        }

        return "Current channel is " + CurrentChannel;
    }

    public String upVolume() {
        if (!IsOn)
            return this.toString();

        Volume += 1;
        if (Volume > 100) {
            Volume = 100;
        }

        return "Current volume is " + Volume;
    }

    public String downVolume() {
        if (!IsOn)
            return this.toString();

        Volume -= 1;
        if (Volume < 0) {
            Volume = 0;
        }

        return "Current volume is " + Volume;
    }
}
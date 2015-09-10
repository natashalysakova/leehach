package com.company.Lessons;

public class TV {

    public boolean Power = false;
    public int Channel = 0;
    public int Volume = 0;

    public void ChangePower() {

        Power =!Power;

        System.out.println("Power is " + Power);
    }

    public void ChannelUp() {

        if (!Power) {
            Power = true;
        }

        Channel += 1;
        System.out.println("Channel Now: " + Channel);

        if (Channel > 99) {
            Channel = 0;
        }
    }

    public void ChannelDown() {

        if (!Power) {
            Power = true;
        }
        Channel -= 1;
        System.out.println("Channel Now: " + Channel);

        if (Channel < 0) {
            Channel = 99;
        }
    }

    public void VolumeUp() {

        if (Power) {

            Volume += 1;

            if (Volume > 100) {
                Volume = 100;
                System.out.println("This is Max");
            }
            System.out.println("Volume Now: " + Volume);
        }
    }

    public void VolumeDown() {

        if (Power) {

            Volume -= 1;

            if (Volume < 1) {
                Volume = 0;

            }
            System.out.println("Volume Now: " + Volume);
        }
    }

    @Override
    public String toString() {
        if (Power) {
            return "TV is on. Channel is: " + Channel + "Volume is: " + Volume;
        } else {
            return "TV OFF";
        }
    }
}
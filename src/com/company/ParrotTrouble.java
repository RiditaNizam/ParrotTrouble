package com.company;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        if ((talking == true) && (hour >= 0 && hour < 7)) {
            return true;
        } else if ((talking == true) && (hour > 20 && hour <= 23)) {
            return true;
        } else {
            return false;
        }
    }
}

package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

class TelevisionClient {
    public static void main(String[] args) {
        Television TV1 = new Television("Sony", 150, DisplayType.LED);
        Television TV2 = new Television("SHARP", -30);
        TV1.powerSwitch();
        TV2.powerSwitch();
        TV1.powerSwitch();
        TV2.powerSwitch();

        String string = "Doc";
    }
}

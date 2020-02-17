package com.mode.Adapter.MAIN1;

public class Clienter {

    public static void main(String[] args) {
        Ps2 p = new Adapter(new Usber());
        p.isPs2();
    }

}

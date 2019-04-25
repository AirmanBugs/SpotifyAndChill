package com.netcompany.spotifyandchill.businesslogic;

public class ExcusePrinterLogic {

    public boolean printExcuseAboutHenrikNotCallingBackEvenThoughISaidIWasGoingTo() {
        System.out.println("Forgot to call back even though i said i was going to. \n Sorry about that.");
        return true;
    }

    public void printResponseToResponseOfExcuse(boolean excuseIsAccepted) {
        if (excuseIsAccepted) {
            System.out.println("I should have called you back, thanks. I'll call you tomorrow.");
        } else {
            System.out.println("Whatever... Hope you like my pull-request.");
        }
    }
}

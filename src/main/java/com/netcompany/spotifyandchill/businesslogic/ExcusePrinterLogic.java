package com.netcompany.spotifyandchill.businesslogic;

import org.springframework.stereotype.Component;

@Component
public class ExcusePrinterLogic {

    private final String excuseMessage = "Forgot to call back even though i said i was going to. \n Sorry about that.";
    private final String positiveResponseToReplyOfExcuse = "I should have called you back, thanks. I'll call you tomorrow.";
    private final String negativeResponseToReplyOfExcuse = "Whatever... Hope you like my pull-request.";

    public boolean printExcuseAboutHenrikNotCallingBackEvenThoughISaidIWasGoingTo() {
        System.out.println(excuseMessage);
        return true;
    }

    public String getExcuseMessage() {
        return excuseMessage;
    }

    public String getResponseToReplyOfExcuse(boolean excuseIsAccepted) {
        if (excuseIsAccepted) {
            return positiveResponseToReplyOfExcuse;
        }
        return negativeResponseToReplyOfExcuse;
    }

    public void printResponseToReplyOfExcuse(boolean excuseIsAccepted) {
        String response = getResponseToReplyOfExcuse(excuseIsAccepted);
        System.out.println(response);
    }
}

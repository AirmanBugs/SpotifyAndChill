package com.netcompany.spotifyandchill.controller;

import com.netcompany.spotifyandchill.businesslogic.ExcusePrinterLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("excuse")
public class ExcuseController {

    @Autowired
    private ExcusePrinterLogic excusePrinterLogic;

    @RequestMapping(method = RequestMethod.GET)
    public String getExcuse() {
        return excusePrinterLogic.getExcuseMessage();
    }

    @RequestMapping(method = RequestMethod.POST)
    public String replyToExcuse(@RequestParam(value = "excuseAccepted") boolean excuseIsAccepted) {
        return excusePrinterLogic.getResponseToReplyOfExcuse(excuseIsAccepted);
    }

}

package com.netcompany.spotifyandchill.controller;

import com.netcompany.spotifyandchill.businesslogic.ExcuseLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("excuse")
public class ExcuseController {

    @Autowired
    private ExcuseLogic excuseLogic;

    @RequestMapping(method = RequestMethod.GET)
    public String getExcuse() {
        return excuseLogic.getExcuseMessage();
    }

    @RequestMapping(method = RequestMethod.POST)
    public String replyToExcuse(@RequestParam(value = "excuseAccepted") boolean excuseIsAccepted) {
        return excuseLogic.getResponseToReplyOfExcuse(excuseIsAccepted);
    }

}

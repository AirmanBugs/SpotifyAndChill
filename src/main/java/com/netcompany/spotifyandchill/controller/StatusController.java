package com.netcompany.spotifyandchill.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ifttt/v1/status")
public class StatusController {

    static final String IFTTT_CHANNEL_KEY = "rm0wXsfvCgtpQa8UgRlUOjHq5cqHggTil0FOSBOXhHM-gwRmkbjxXUrgdekgb0sz";

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getStatus(@RequestHeader(value = "IFTTT-Channel-Key") String iftttChannelKey) {
        if (iftttChannelKey.equals(IFTTT_CHANNEL_KEY)) {
            return new ResponseEntity(HttpStatus.OK);
        }
        else {
             return new ResponseEntity(HttpStatus.UNAUTHORIZED);
        }
    }
}

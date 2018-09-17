package com.ubank.vab.fundtransferservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bhavi on 9/17/2018.
 */

@RestController
public class TransferController {

    @RequestMapping(path = "/transfer",method = RequestMethod.GET , produces = "application/json")
    public String transfer(){
        return "Funds Transferred";
    }
}

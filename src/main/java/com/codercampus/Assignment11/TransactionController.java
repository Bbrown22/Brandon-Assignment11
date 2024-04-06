package com.codercampus.Assignment11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TransactionController {

    @GetMapping("/transactions")
    public String getTransactions  () {
        return "transactions";
    }

}

package com.cdfmsv.inventa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class SiteController {
    @Autowired
    private TransactionRepository transactionRepository;
    @GetMapping({"/", "/transactionform"})
    public String index(Model model)
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        DateFormat dateFormat2 = new SimpleDateFormat("yyyyMMddhhmmss");
        String currentDateTime = dateFormat.format(new Date());
        String transactionNo = dateFormat2.format(new Date());
        model.addAttribute("transactionNo", transactionNo);
        model.addAttribute("currentdatetime", currentDateTime);
        return "transactionform";
    }
    @PostMapping("/save")
    public String save(@RequestParam String transactionnumber, @RequestParam String transactiondate, @RequestParam String customername, @RequestParam String order, @RequestParam Integer priceperquantity, @RequestParam Integer quantity, @RequestParam Integer totalprice, @RequestParam Integer payment, @RequestParam Integer change)
    {
        Transaction transaction = new Transaction();
        transaction.setTr_transactionnumber(transactionnumber);
        transaction.setTr_transactiondate(transactiondate);
        transaction.setTr_customername(customername);
        transaction.setTr_order(order);
        transaction.setTr_priceperquantity(priceperquantity);
        transaction.setTr_quantity(quantity);
        transaction.setTr_totalprice(totalprice);
        transaction.setTr_payment(payment);
        transaction.setTr_change(change);
        transactionRepository.save(transaction);
        return "redirect:/simplesalesreport";
    }
    @GetMapping("/simplesalesreport")
    public @ResponseBody Iterable<Transaction> getAllSavedEntries()
    {
        return transactionRepository.findAll();
    }

    @GetMapping("/get-all-transactions")
    public List<Transaction> getAllTransactions() {
        return (List<Transaction>) transactionRepository.findAll();
    }

    @GetMapping("/dashboard")
    public String getSalesReport(Model model) {
        Iterable<Transaction> transactions = transactionRepository.findAll();
        model.addAttribute("transactions", transactions);
        return "dashboard";
    }
}

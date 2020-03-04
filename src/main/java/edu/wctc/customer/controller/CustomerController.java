package edu.wctc.customer.controller;

import edu.wctc.customer.entity.Customer;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/validation")
public class CustomerController {
    @InitBinder
    public void trimWhiteSpace(WebDataBinder dataBinder){
        StringTrimmerEditor ste = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, ste);
    }
    @RequestMapping("/form")
    public String showForm(Model model){
        model.addAttribute("theCustomer", new Customer());
        return "customer/customer-form";
    }
    @RequestMapping("/orderTickets")
    public String processForm(@Valid @ModelAttribute("theCustomer") Customer theCustomer, BindingResult bindingResult){
        System.out.println(theCustomer.toString());
        if(bindingResult.hasErrors()){
            return "customer/customer-form";
        }else {
            return "customer/confirmation";
        }
    }

}

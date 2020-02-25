package edu.wctc.card;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Card")
public class CardController {
    @RequestMapping("/")
    public String cardHome(){
        return "card/home";
    }
    @RequestMapping("/process")
    public String processCardInfo(@RequestParam String CardNum, @RequestParam  String CardHolder, @RequestParam String ExpDate, @RequestParam String Security, Model model){

        model.addAttribute("CardNum", CardNum);
        model.addAttribute("CardHolder", CardHolder);
        model.addAttribute("ExpDate", ExpDate);
        model.addAttribute("Security", Security);

        return "card/confirm";
    }
}

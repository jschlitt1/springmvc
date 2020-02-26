package edu.wctc.travel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/travel")
public class travelController {

    @Value("#{gradeLevelProp}")
    private Map<String, String> gradeLevelMap;

    @RequestMapping("/showForm")
    public String showForm(Model model){
        ExchangeStudent es = new ExchangeStudent();
        model.addAttribute("exchStudent", es);
        model.addAttribute("countries", new CountryOptions());
        model.addAttribute("gradeLevels", gradeLevelMap);
        model.addAttribute("travelMethods", TravelMethod.values());
        return"travelOutput/form";
    }
    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("exchStudent") ExchangeStudent es){
        return "travelOutput/confirm";
    }
}

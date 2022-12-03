package by.bsuir.management.controller;

import by.bsuir.management.models.*;
import by.bsuir.management.security.CustomUserDetail;
import by.bsuir.management.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/Employee")
@RestController
public class EmployeeController {

    @Autowired
    private PromotionService promotionService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private WorkStatisticService workStatisticService;
    @Autowired
    private TypeFinancialMotivationService typeFinancialMotivationService;
    @Autowired
    private TypeNonFinancialMotivationService typeNonFinancialMotivationService;
    @Autowired
    private MethodOfMotivationInvolvedService methodOfMotivationInvolvedService;
    @PreAuthorize("hasAnyRole('CLIENT')")
    @GetMapping("/showYourMotivation")
    public List showYourBonuses(@AuthenticationPrincipal CustomUserDetail currUser, Model model){
        return (List) methodOfMotivationInvolvedService.getMethodsByEmployeeId(currUser.getId());
    }
    @GetMapping("/allMotivations")
    public String allBonuses(Model model){
        List<TypeFinancialMotivation> typeFinancialMotivationList = typeFinancialMotivationService.findALL();
        model.addAttribute("typesFinancialMotivation", typeFinancialMotivationList.size() != 0 ? typeFinancialMotivationList : null);
        List<TypeNonFinancialMotivation> typeNonFinancialMotivationList = typeNonFinancialMotivationService.findALL();
        model.addAttribute("typesNonFinancialMotivation", typeNonFinancialMotivationList.size() != 0 ? typeNonFinancialMotivationList : null);
        return "/motivation/allMotivations";
    }
    @GetMapping("/yourWorkStatistics")
    public Object yourWorkStatistics(@AuthenticationPrincipal CustomUserDetail currUser, Model model){
        return workStatisticService.getWorkStatisticsByEmployeeId(currUser.getId());
    }
    @GetMapping("/workingDay")
    public String showYourBonuses(Model model){
        return "/yourself/work";
    }

    @GetMapping("/careerLadder")
    public String careerLadder(@AuthenticationPrincipal CustomUserDetail currUser, Model model){
        List<Promotion> promotion = promotionService.findAll();
        model.addAttribute("promotion", promotion);
        int number = employeeService.findNumberOfPointsById(currUser.getId());
        model.addAttribute("number", number);
        return "analysis/careerLadder";
    }
    @GetMapping("/menu")
    public String menu(){
        return "redirect:/";
    }
}

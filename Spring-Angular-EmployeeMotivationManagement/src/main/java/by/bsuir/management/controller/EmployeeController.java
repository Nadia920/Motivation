package by.bsuir.management.controller;

import by.bsuir.management.models.*;
import by.bsuir.management.security.CustomUserDetail;
import by.bsuir.management.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
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
    private EmployeesService employeesService;
    @Autowired
    private WorkStatisticsService workStatisticsService;
    @Autowired
    private TypesFinancialMotivationService typesFinancialMotivationService;
    @Autowired
    private TypesNonFinancialMotivationService typesNonFinancialMotivationService;
    @Autowired
    private MethodsOfMotivationInvolvedService methodsOfMotivationInvolvedService;
    @PreAuthorize("hasAnyRole('CLIENT')")
    @GetMapping("/showYourMotivation")
    public List showYourBonuses(@AuthenticationPrincipal CustomUserDetail currUser, Model model){
        return (List) methodsOfMotivationInvolvedService.getMethodsByEmployeeId(currUser.getId());
    }
    @GetMapping("/allMotivations")
    public String allBonuses(Model model){
        List<TypesFinancialMotivation> typesFinancialMotivationList = typesFinancialMotivationService.findALL();
        model.addAttribute("typesFinancialMotivation", typesFinancialMotivationList.size() != 0 ? typesFinancialMotivationList : null);
        List<TypesNonFinancialMotivation> typesNonFinancialMotivationList = typesNonFinancialMotivationService.findALL();
        model.addAttribute("typesNonFinancialMotivation", typesNonFinancialMotivationList.size() != 0 ? typesNonFinancialMotivationList : null);
        return "/motivation/allMotivations";
    }
    @GetMapping("/yourWorkStatistics")
    public Object yourWorkStatistics(@AuthenticationPrincipal CustomUserDetail currUser, Model model){
        return workStatisticsService.getWorkStatisticsByEmployeeId(currUser.getId());
    }
    @GetMapping("/workingDay")
    public String showYourBonuses(Model model){
        return "/yourself/work";
    }

    @GetMapping("/careerLadder")
    public String careerLadder(@AuthenticationPrincipal CustomUserDetail currUser, Model model){
        List<Promotion> promotion = promotionService.findAll();
        model.addAttribute("promotion", promotion);
        int number = employeesService.findNumberOfPointsById(currUser.getId());
        model.addAttribute("number", number);
        return "analysis/careerLadder";
    }
    @GetMapping("/menu")
    public String menu(){
        return "redirect:/";
    }
}

package by.bsuir.management.controller;

import by.bsuir.management.models.*;
import by.bsuir.management.services.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/Admin")
@RestController
@AllArgsConstructor
public class AdminController {

    @Autowired
    private TypesFinancialMotivationService typesFinancialMotivationService;
    @Autowired
    private TypesNonFinancialMotivationService typesNonFinancialMotivationService;
    @Autowired
    private EventService eventService;
    @Autowired
    private WorkStatisticsService workStatisticsService;
    @Autowired
    private MethodsOfMotivationInvolvedService methodsOfMotivationInvolvedService;
    @Autowired
    private PunishmentService punishmentService;
    @Autowired
    private ApartmentsService apartmentsService;
    @Autowired
    private CryptocurrencyService cryptocurrencyService;
    @Autowired
    private BonusService bonusService;
    @Autowired
    private PaymentsService paymentsService;
    @Autowired
    private EmployeesService employeesService;
    @Autowired
    private HRManagersService hrManagersService;
    @Autowired
    private SharesService sharesService;

    @GetMapping("finMotivation")
    public List finMotivation(Model model){
        return (List) typesFinancialMotivationService.findALL();
    }
    @GetMapping("non-finMotivation")
    public List nonFinMotivation(Model model){
        return (List) typesNonFinancialMotivationService.findALL();
    }
    @GetMapping("event")
    public List allEvent(Model model){
        return (List) eventService.findAll();
    }
    @GetMapping("employeePerformanceAnalysis")
    public List employeePerformanceAnalysis(Model model){
        return (List) workStatisticsService.findAll();
    }
    @GetMapping("methodsMotivation")
    public List methodsMotivation(Model model){
        return (List)  methodsOfMotivationInvolvedService.findAll();
    }
    @GetMapping("punishment")
    public List punishment(Model model){
        return (List) punishmentService.findAll();

    }
    @GetMapping("apartments")
    public List apartments(Model model){
        return (List) apartmentsService.findAll();

    }
    @GetMapping("cryptocurrency")
    public List cryptocurrency(Model model){
        return (List) cryptocurrencyService.findAll();
    }
    @GetMapping("bonus")
    public List bonus(Model model){
        return (List) bonusService.findAll();
    }
    @GetMapping("payments")
    public List payments(Model model){
        return (List) paymentsService.findAll();
    }
    @GetMapping("shares")
    public List shares(Model model){
        return (List) sharesService.findAll();
    }
    @GetMapping("/event")
    public List event(Model model){
        return (List) eventService.findAll();
    }
    @GetMapping("/addEvent")
    public String addEvent(Model model) {
        return "/addEvent";
    }
    @PostMapping("/saveMethods")
    public void saveEvent(Event obj, Model model){
        eventService.save(obj);
    }
    @GetMapping("/addMethodsOfMotivation")
    public String addMethodsOfMotivation(Model model){
        List<Employees> employessList = employeesService.findAll();
        model.addAttribute("employes", employessList.size() != 0 ? employessList : null);
        List<HRManagers> hrManagersList = hrManagersService.findAll();
        model.addAttribute("hrManagers", hrManagersList.size() != 0 ? hrManagersList : null);
        List<TypesFinancialMotivation> typesFinancialMotivationList = typesFinancialMotivationService.findALL();
        model.addAttribute("typesFinancialMotivation", typesFinancialMotivationList.size() != 0 ? typesFinancialMotivationList : null);
        List<TypesNonFinancialMotivation> typesNonFinancialMotivationList = typesNonFinancialMotivationService.findALL();
        model.addAttribute("typesFinancialMotivation", typesNonFinancialMotivationList.size() != 0 ? typesNonFinancialMotivationList : null);
        return "/addMethodsOfMotivation";
    }
    @PostMapping("/saveMethods")
    public void saveMethods(MethodsOfMotivationInvolved obj, Model model) {
        methodsOfMotivationInvolvedService.save(obj);
    }
}

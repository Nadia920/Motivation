package by.bsuir.management.controller;

import by.bsuir.management.models.*;
import by.bsuir.management.services.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping({"/Admin"})
public class AdminController {

    @Autowired
    private TypeFinancialMotivationService typeFinancialMotivationService;
    @Autowired
    private TypeNonFinancialMotivationService typeNonFinancialMotivationService;
    @Autowired
    private EventService eventService;
    @Autowired
    private WorkStatisticService workStatisticService;
    @Autowired
    private MethodOfMotivationInvolvedService methodOfMotivationInvolvedService;
    @Autowired
    private PunishmentService punishmentService;
    @Autowired
    private ApartmentService apartmentService;
    @Autowired
    private CryptocurrencyService cryptocurrencyService;
    @Autowired
    private BonusService bonusService;
    @Autowired
    private PaymentService paymentService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private HRManagerService hrManagerService;
    @Autowired
    private ShareService shareService;

    @GetMapping(path = {"/finMotivation"})
    public List finMotivation(Model model){
        return (List) typeFinancialMotivationService.findALL();
    }

    @GetMapping(path = {"/non-finMotivation"})
    public List nonFinMotivation(Model model){
        return (List) typeNonFinancialMotivationService.findALL();
    }

    @GetMapping(path = {"/event"})
    public List allEvent(Model model){
        return (List) eventService.findAll();
    }

    @GetMapping(path = {"/employeePerformanceAnalysis"})
    public List employeePerformanceAnalysis(Model model){
        return (List) workStatisticService.findAll();
    }

    @GetMapping(path = {"/methodsMotivation"})
    public List methodsMotivation(Model model){
        return (List)  methodOfMotivationInvolvedService.findAll();
    }

    @GetMapping(path = {"/punishment"})
    public List punishment(Model model){
        return (List) punishmentService.findAll();

    }

    @GetMapping(path = {"/apartments"})
    public List apartments(Model model){
        return (List) apartmentService.findAll();

    }

    @GetMapping(path = {"/cryptocurrency"})
    public List cryptocurrency(Model model){
        return (List) cryptocurrencyService.findAll();
    }

    @GetMapping(path = {"/bonus"})
    public List bonus(Model model){
        return (List) bonusService.findAll();
    }

    @GetMapping(path = {"/payments"})
    public List payments(Model model){
        return (List) paymentService.findAll();
    }

    @GetMapping(path = {"/shares"})
    public List shares(Model model){
        return (List) shareService.findAll();
    }

    /*@GetMapping(path = {"/event"})
    public List event(Model model){
        return (List) eventService.findAll();
    }*/

    @GetMapping(path = {"/addEvent"})
    public String addEvent(Model model) {
        return "/addEvent";
    }
   /* @PostMapping(path = {"/saveMethods"})
    public void saveEvent(@RequestBody Event obj, Model model){
        eventService.save(obj);
    }*/

    @GetMapping(path = {"/addMethodsOfMotivation"})
    public String addMethodsOfMotivation(Model model){
        List<Employee> employessList = employeeService.findAll();
        model.addAttribute("employes", employessList.size() != 0 ? employessList : null);
        List<HRManager> hrManagerList = hrManagerService.findAll();
        model.addAttribute("hrManagers", hrManagerList.size() != 0 ? hrManagerList : null);
        List<TypeFinancialMotivation> typeFinancialMotivationList = typeFinancialMotivationService.findALL();
        model.addAttribute("typesFinancialMotivation", typeFinancialMotivationList.size() != 0 ? typeFinancialMotivationList : null);
        List<TypeNonFinancialMotivation> typeNonFinancialMotivationList = typeNonFinancialMotivationService.findALL();
        model.addAttribute("typesFinancialMotivation", typeNonFinancialMotivationList.size() != 0 ? typeNonFinancialMotivationList : null);
        return "/addMethodsOfMotivation";
    }
    @PostMapping(path = {"/saveMethods"})
    public void saveMethods(@RequestBody MethodOfMotivationInvolved obj, Model model) {
        methodOfMotivationInvolvedService.save(obj);
    }
}

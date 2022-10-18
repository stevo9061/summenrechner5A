package at.fhtw.summenrechner5A.controller;

import at.fhtw.summenrechner5A.service.SummenrechnerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SummenrechnerController {

    private final SummenrechnerService sumService;

    public SummenrechnerController(SummenrechnerService sumService) {
        this.sumService = sumService;
    }

    @GetMapping("/summe")
        Long calculateSum() {
//            return 2+5;
            return sumService.getSum();
        }

    @GetMapping("/summe/{number}")
    void addToSum(@PathVariable Long number) {
        sumService.incrementSumBy(number);
    }


}


// http://localhost:8080/summe/1
// http://localhost:8080/summe/1
// http://localhost:8080/summe ----> 2
//editor.swagger.io -> Vorlage für API bereitstellen
// yaml file für projekt erstellen ?
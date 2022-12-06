package fhtw.imperialAPI.controller;

import fhtw.imperialAPI.dto.NumberImperial;
import fhtw.imperialAPI.service.ServiceImperial;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerImperial
{

    private ServiceImperial service = new ServiceImperial();


    @GetMapping("/centimeter?inch/{zahl}")
    double calcInch(@PathVariable double zahl)
    {
        service.calcInch(zahl);
        return service.getInchZahl();
    }

    @GetMapping("/meter?yard/{zahl}")
    double calcYard(@PathVariable int zahl)
    {
        service.calcYard(zahl);
        return service.getYardZahl();
    }

}

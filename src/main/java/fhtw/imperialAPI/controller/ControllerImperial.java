package fhtw.imperialAPI.controller;

import fhtw.imperialAPI.dto.NumberImperial;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerImperial
{

    private NumberImperial service = new NumberImperial();


    @GetMapping("/centimeter?inch/{zahl}")
    int calcInch(@PathVariable int zahl)
    {
        //service.
        //return service.
        return 0;
    }

    @GetMapping("/meter?yard/{zahl}")
    int calcYard(@PathVariable int zahl)
    {
        //service.
        //return service.
        return 0;
    }

}

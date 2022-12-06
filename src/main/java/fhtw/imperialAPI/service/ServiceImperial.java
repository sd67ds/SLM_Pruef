package fhtw.imperialAPI.service;

import fhtw.imperialAPI.dto.NumberImperial;
import org.springframework.stereotype.Service;

@Service
public class ServiceImperial
{
    NumberImperial rechner = new NumberImperial();

    public void setZahl(int newZahl) {rechner.setZahl(newZahl);}

    public int getZahl() {return rechner.getZahl();}




}

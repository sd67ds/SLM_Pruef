package fhtw.imperialAPI.service;

import fhtw.imperialAPI.dto.NumberImperial;
import org.springframework.stereotype.Service;

@Service
public class ServiceImperial
{
    NumberImperial rechner = new NumberImperial();

    public void setZahl(double newZahl) {rechner.setZahl(newZahl);}

    public double getZahl() {return rechner.getZahl();}

    public void calcInch(double zahl)
    {
        rechner.setZahl(zahl);
        rechner.setInch(zahl*2.54);
    }

    public double getInchZahl() {return rechner.getInch();}

    public void calcYard(double zahl)
    {
        rechner.setZahl(zahl);
        rechner.setYard(zahl/1.094);
    }

    public double getYardZahl() {return rechner.getYard();}

}

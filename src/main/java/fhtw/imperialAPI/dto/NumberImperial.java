package fhtw.imperialAPI.dto;

public class NumberImperial
{
    private double zahl;
    private double inch;
    private double yard;

    public NumberImperial()
    {
        this.zahl = 0;
        this.inch = 0;
        this.yard = 0;
    }

    public double getZahl()
    {
        return zahl;
    }

    public void setZahl(double zahl)
    {
        this.zahl = zahl;
    }

    public double getInch()
    {
        return inch;
    }

    public void setInch(double inch)
    {
        this.inch = inch;
    }

    public double getYard()
    {
        return yard;
    }

    public void setYard(double yard)
    {
        this.yard = yard;
    }
}

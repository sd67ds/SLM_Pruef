package fhtw.imperialAPI.dto;

public class NumberImperial
{
    private int zahl;
    private float inch;
    private float yard;

    public NumberImperial()
    {
        this.zahl = 0;
        this.inch = 0;
        this.yard = 0;
    }

    public int getZahl()
    {
        return zahl;
    }

    public void setZahl(int zahl)
    {
        this.zahl = zahl;
    }

    public float getInch()
    {
        return inch;
    }

    public void setInch(float inch)
    {
        this.inch = inch;
    }

    public float getYard()
    {
        return yard;
    }

    public void setYard(float yard)
    {
        this.yard = yard;
    }
}

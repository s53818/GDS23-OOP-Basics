package org.campus02.bank;

public class Gehaltskonto
{
    // Inhaber : String, IBAN : String, BIC : String, Kontostand : double
    private String Inhaber;
    private String IBAN;
    private String BIC;
    private double Kontostand;

    public Gehaltskonto(String Inhaber, String IBAN, String BIC)
    {
        this.Inhaber = Inhaber;
        this.IBAN = IBAN;
        this.BIC = BIC;
        this.Kontostand = 0.0;
    }

    public void aufbuchen(double wert)
    {
        this.Kontostand+=wert;
    }

    public void abbuchen(double wert)
    {
        if(this.Kontostand-wert < 0)
            System.out.println("Saldo zu klein, kann nicht verbucht werden.");
        else
            this.Kontostand-=wert;
    }

    public double getKontostand()
    {
        return Kontostand;
    }
}

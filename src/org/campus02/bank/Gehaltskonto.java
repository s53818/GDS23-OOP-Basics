package org.campus02.bank;

public class Gehaltskonto
{
    // Inhaber : String, IBAN : String, BIC : String, Kontostand : double
    private String inhaber;
    private String iban;
    private String bic;
    private double kontostand;
    //eindeutige und globale Zaehlervariable, um Id's fuer Kontos zu vergeben
    public static int id=0;
    // number ist die eigentliche id eines kontos
    private int number;

    public Gehaltskonto(String inhaber, String iban, String bic)
    {
        this.inhaber = inhaber;
        this.iban = iban;
        this.bic = bic;
        this.kontostand = 0.0;
        id++;
        this.number=id;
    }
    // return von number, um die Id eines Kontos zu bekommen (nicht die letzte Id)
    public int getId()
    {
        return number;
    }

    public String toString()
    {
        return "Gehaltskonto{" +
                "Inhaber='" + inhaber + '\'' +
                ", IBAN='" + iban + '\'' +
                ", BIC='" + bic + '\'' +
                ", Kontostand=" + kontostand +
                '}';
    }

    public void aufbuchen(double wert)
    {
        this.kontostand +=wert;
    }

    public void abbuchen(double wert)
    {
        if(this.kontostand -wert < 0)
            System.out.println("Saldo zu klein, kann nicht verbucht werden.");
        else
            this.kontostand -=wert;
    }

    public double getKontostand()
    {
        return kontostand;
    }
}

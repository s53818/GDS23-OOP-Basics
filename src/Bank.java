public class Bank
{
    public static void main(String[] args)
    {
        Gehaltskonto konto1 = new Gehaltskonto("Max Mustermann","AT026000000001349870","OPSKATWW");
        Gehaltskonto konto2 = new Gehaltskonto("Susi Sorglos","AT023200000000641605","RLNWATWW");
        Gehaltskonto konto3 = new Gehaltskonto("Lassmiranda Dennsiewillja","AT023400000002613800","RZOOAT2L");

        konto1.aufbuchen(100.00);
        konto2.aufbuchen(323.56);
        konto3.aufbuchen(584.32);

        konto1.abbuchen(12.44);
        konto2.abbuchen(124.87);
        konto3.abbuchen(321.67);

        Gehaltskonto[] gehaltskontos = {konto1, konto2, konto3}; //new Gehaltskonto[3];

        for(int i = 0; i < gehaltskontos.length; i++)
        {
            System.out.println("Konto"+i + " Kontostand: "+gehaltskontos[i].getKontostand());
        }
    }
}

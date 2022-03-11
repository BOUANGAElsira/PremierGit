package pratiquegit;

public class Complexe 
{
    private double reel;
    private double imaginaire;

    public Complexe(double reel, double imaginaire) {
        this.reel = reel;
        this.imaginaire = imaginaire;
    }

    public Complexe() {
    }

    public double getReel() {
        return reel;
    }

    public double getImaginaire() {
        return imaginaire;
    }

    @Override
    public String toString() {
        return "Complexe{" + "reel=" + reel + ", imaginaire=" + imaginaire + '}';
    }
    public Complexe opposer(Complexe z)
    {
        return new Complexe(-z.reel, -z.imaginaire);
    }
    public Complexe addition(Complexe h1 , Complexe h2)
    {
        return new Complexe(h1.reel+h2.reel, h1.imaginaire+h2.imaginaire);
    }
}

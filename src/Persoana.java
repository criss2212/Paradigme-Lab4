public class Persoana {
    String prenume;
    String nume;
    int varsta;

    public Persoana(String prenume, String nume, int varsta) {
        this.prenume = prenume;
        this.nume = nume;
        this.varsta=varsta;
    }

    @Override
    public String toString() {
        return prenume + ' '+ nume + ' ' + varsta;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNume() {
        return nume;
    }

    public Integer getVarsta() {
        return varsta;
    }

}


package cz.czechitas.java2webapps.ukol3.entity;

public class Vizitka {
    private String meno;
    private String spolocnost;
    private String ulica;
    private String pscObec;
    private String celaAdresa;
    private String email;
    private String telefon;
    private String web;

    public Vizitka() {
    }

    public Vizitka(String meno, String spolocnost, String ulica, String pscObec, String email, String telefon, String web) {
        this.meno = meno;
        this.spolocnost = spolocnost;
        this.ulica = ulica;
        this.pscObec = pscObec;
        this.email = email;
        this.telefon = telefon;
        this.web = web;
        this.celaAdresa = ulica + ", " + pscObec;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getSpolocnost() {
        return spolocnost;
    }

    public void setSpolocnost(String spolocnost) {
        this.spolocnost = spolocnost;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getPscObec() {
        return pscObec;
    }

    public void setPscObec(String pscObec) {
        this.pscObec = pscObec;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getCelaAdresa() {
        return celaAdresa;
    }
}

package bitkibakimi;

public abstract class Bitki {
    private String isim;
    private String bilimselIsim;

    public Bitki(String isim, String bilimselIsim) {
        this.isim = isim;
        this.bilimselIsim = bilimselIsim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getBilimselIsim() {
        return bilimselIsim;
    }

    public void setBilimselIsim(String bilimselIsim) {
        this.bilimselIsim = bilimselIsim;
    }

    
    public String getAd() {
        return getIsim();
    }

    public String getGenelBilgi() {
        return getDetayliBilgi();
    }

    public String getGorsel() {
        return getGorselYolu();
    }

    
    public abstract String getBakimBilgisi();

    public abstract String getDetayliBilgi();

    public abstract String getGorselYolu();
}

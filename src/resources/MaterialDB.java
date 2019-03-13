package resources;

public class MaterialDB {
    private String materialName;
    private String density;
    private String priceKG;

    public MaterialDB(String materialName, String density, String priceKG) {
        this.materialName = materialName;
        this.density = density;
        this.priceKG = priceKG;
    }

    public String getMaterialName() {
        return materialName;
    }

    public String getDensity() {
        return density;
    }

    public String getPriceKG() {
        return priceKG;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public void setDensity(String density) {
        this.density = density;
    }

    public void setPriceKG(String priceKG) {
        this.priceKG = priceKG;
    }
}
package resources;

public class OpenLens {
    private int id;
    private String nameLens;
    private String materialLens;
    private String priceLens;
    private String creationDate;

    public OpenLens(int id, String nameLens, String materialLens, String priceLens, String creationDate) {
        this.id = id;
        this.nameLens = nameLens;
        this.materialLens = materialLens;
        this.priceLens = priceLens;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public String getNameLens() {
        return nameLens;
    }

    public String getMaterialLens() {
        return materialLens;
    }

    public String getPriceLens() {
        return priceLens;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameLens(String nameLens) {
        this.nameLens = nameLens;
    }

    public void setMaterialLens(String materialLens) {
        this.materialLens = materialLens;
    }

    public void setPriceLens(String priceLens) {
        this.priceLens = priceLens;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}

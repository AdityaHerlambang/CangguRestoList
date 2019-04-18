package com.herlambang.unicornlist.model;

public class Startup {

    String name, image, founder, founderimage, type, overview, valuation, investors, logo;

    public Startup() {
    }

    public Startup(String name, String image, String founder, String founderimage, String type, String overview, String valuation, String investors, String logo) {
        this.name = name;
        this.image = image;
        this.founder = founder;
        this.founderimage = founderimage;
        this.type = type;
        this.overview = overview;
        this.valuation = valuation;
        this.investors = investors;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String getFounderimage() {
        return founderimage;
    }

    public void setFounderimage(String founderimage) {
        this.founderimage = founderimage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getValuation() {
        return valuation;
    }

    public void setValuation(String valuation) {
        this.valuation = valuation;
    }

    public String getInvestors() {
        return investors;
    }

    public void setInvestors(String investors) {
        this.investors = investors;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}

package com.example.repairwala;

public class ServiceOrder {
    public void setOservice(String oservice) {
        this.oservice = oservice;
    }

    public void setNounit(String nounit) {
        this.nounit = nounit;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSerprovider(String serprovider) {
        this.serprovider = serprovider;
    }

    public void setSertype(String sertype) {
        this.sertype = sertype;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    private String oservice;
    private String nounit;
    private String location;
    private String serprovider;
    private String sertype;
    private String datetime;
    private String price;

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    private String iD;

    public String getOservice() {
        return oservice;
    }

    public String getNounit() {
        return nounit;
    }

    public String getLocation() {
        return location;
    }

    public String getSerprovider() {
        return serprovider;
    }

    public String getSertype() {
        return sertype;
    }

    public String getiD() {
        return iD;
    }

    public ServiceOrder() {

    }



}

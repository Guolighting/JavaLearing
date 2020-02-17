package com.mode.BuilderPatterns;
public class Role {
    private String name;
    private String sex;
    private String feature;
    private String clothes;
    private String hairstyle;
    public void setName(String name){
        this.name=name;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
    public void setFeature(String feature){
        this.feature=feature;
    }
    public void setClothes(String clothes){
        this.clothes=clothes;
    }
    public void setHairstyle(String hairstyle){
        this.hairstyle=hairstyle;
    }
    public String getName(){
        return (this.name);
    }
    public String getSex(){
        return (this.sex);
    }
    public String getFeature(){
        return (this.feature);
    }
    public String getClothes(){
        return (this.clothes);
    }
    public String getHairstyle(){
        return (this.hairstyle);
    }
}

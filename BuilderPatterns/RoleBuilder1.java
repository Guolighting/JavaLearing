package com.mode.BuilderPatterns;

public class RoleBuilder1 extends RoleBuilder{
    public void buildName(){
        role.setName("曹操");
    }
    public void buildSex(){
        role.setSex("男");
    }
    public void buildFeature(){
        role.setFeature("白脸");
    }
    public void buildClothes(){
        role.setClothes("色彩鲜艳的长袍");
    }
    public void buildHairstyle(){
        role.setHairstyle("长发");
    }
}

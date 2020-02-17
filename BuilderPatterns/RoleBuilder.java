package com.mode.BuilderPatterns;

public abstract class RoleBuilder {
    protected Role role=new Role();
    public abstract void buildName();
    public abstract void buildSex();
    public abstract  void buildFeature();
    public abstract  void buildClothes();
    public abstract void buildHairstyle();
    public Role getRole(){
        return role;
    }
}

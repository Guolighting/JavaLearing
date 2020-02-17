package com.mode.BuilderPatterns;

public class GameDesigner {
private RoleBuilder rb;

    public void setRoleBuilder(RoleBuilder rb) {
       this.rb=rb;
    }
    public Role construct()
    {
        rb.buildName();
        rb.buildSex();
        rb.buildFeature();
        rb.buildClothes();
        rb.buildHairstyle();
        return rb.getRole();
    }
}

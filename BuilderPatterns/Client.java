package com.mode.BuilderPatterns;

public class Client {
    public static void main(String[] args) {
        RoleBuilder rb=new RoleBuilder1();
        GameDesigner designer= new GameDesigner();
        designer.setRoleBuilder(rb);
        Role role=designer.construct();
        System.out.println("人物角色");
        System.out.println(role.getName());
        System.out.println(role.getSex());
        System.out.println(role.getFeature());
        System.out.println(role.getClothes());
        System.out.println(role.getHairstyle());
}
}

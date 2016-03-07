package com.company;

import java.io.Console;

/**
 * Created by kuzzm on 05.03.2016.
 */
public abstract class SecureObjectRoot implements ISecureObj{
    public final void create(){
        System.out.println(this.toString()+" "+this.fullName()+" was created");
    }

    public final void delete(){
        System.out.println(this.toString()+" was deleted");
    }

    public final void update(){
        System.out.println(this.toString()+" was changed");
    }
}

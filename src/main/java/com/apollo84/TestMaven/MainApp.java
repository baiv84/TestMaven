package com.apollo84.TestMaven;

import com.apollo84.TestMaven.tools.SomeClass;
import com.apollo84.TestMaven.utils.PrintUtil;


//Feature 1 Main App version!
public class MainApp {
    public static void main(String[] args) {
        SomeClass obj = new SomeClass();
        obj.echo();
        PrintUtil.print();
    }
}

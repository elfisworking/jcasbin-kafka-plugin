package org.casbin.jcasbin.kafka.auth;

import org.casbin.jcasbin.main.Enforcer;

public class JcasbinTest {
    public static void main(String[] args) {
        Enforcer e = new Enforcer("examples/basic_model.conf", "examples/basic_policy.csv");
        String sub = "alice"; // 想要访问资源的用户
        String obj = "data1"; // 将要被访问的资源
        String act = "read"; // 用户对资源进行的操作

        if (e.enforce(sub, obj, act) == true) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }


    }
}

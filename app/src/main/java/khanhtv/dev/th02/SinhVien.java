package khanhtv.dev.th02;

import java.io.Serializable;

public class SinhVien implements Serializable {
    public String name;
    public String age;

    public SinhVien(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

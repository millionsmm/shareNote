
package com.aoliao.notebook.utils.entity;

public class MainTag {
    private String name;
    private Class<?> activity;

    public MainTag(String name) {
        this.name = name;
    }

    public MainTag(String name, Class<?> activity) {
        this.name = name;
        this.activity = activity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class<?> getActivity() {
        return activity;
    }

    public void setActivity(Class<?> activity) {
        this.activity = activity;
    }
}

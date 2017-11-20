package com.rainway.sachiel.messages;

import java.util.Arrays;

public class Folder {

    private String name;
    private File[] files;
    private File[] childFoldes;

    public Folder() {
    }

    public Folder(String name, File[] files, File[] childFoldes) {
        this.name = name;
        this.files = files;
        this.childFoldes = childFoldes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File[] getFiles() {
        return files;
    }

    public void setFiles(File[] files) {
        this.files = files;
    }

    public File[] getChildFoldes() {
        return childFoldes;
    }

    public void setChildFoldes(File[] childFoldes) {
        this.childFoldes = childFoldes;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "name='" + name + '\'' +
                ", files=" + Arrays.toString(files) +
                ", childFoldes=" + Arrays.toString(childFoldes) +
                '}';
    }
}

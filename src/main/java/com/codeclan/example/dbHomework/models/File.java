package com.codeclan.example.dbHomework.models;

import java.util.ArrayList;
import java.util.List;

public class File {

    private Long id;
    private String name;
    private String extension;
    private int size;
    private List<Folder> folders;

    public File(String name, String extension, int size) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folders = new ArrayList<>();
    }

    public File() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

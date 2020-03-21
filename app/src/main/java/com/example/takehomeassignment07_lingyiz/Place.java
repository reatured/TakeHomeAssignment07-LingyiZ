package com.example.takehomeassignment07_lingyiz;

class Place {
    String name;
    String description;
    int photoID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }

    public Place(String name, String description, int photoID) {
        this.name = name;
        this.description = description;
        this.photoID = photoID;
    }
}

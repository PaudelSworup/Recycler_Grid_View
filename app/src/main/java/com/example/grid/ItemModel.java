package com.example.grid;

public class ItemModel {
   private String name;
   private  int imgId;

    public ItemModel(String name, int imgId) {
        this.name = name;
        this.imgId = imgId;
    }

    public int getImgId() {
        return imgId;
    }
    public void setImgId(int imgId){
        this.imgId = imgId;
    }

    public String getName(){
        return name;
    }

    public  void  setName(String name){
        this.name = name;
    }
}

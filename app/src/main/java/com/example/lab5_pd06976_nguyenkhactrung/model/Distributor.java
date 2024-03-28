package com.example.lab5_pd06976_nguyenkhactrung.model;

import com.google.gson.annotations.SerializedName;

public class Distributor {
    //Có thể dùng Annotations của gson để đổi tên cho các trường nhận vào
    //Ví dụ trường _id nhận từ api, thay vì đặt tên trường trong object là _id
    //Có thể đặt là id và thêm vào Annotations @serializedName("_id")
    @SerializedName("_id")
    private String id;
    private String name, createdAt, updatedAt;

    public Distributor() {
    }

    public Distributor(String id, String name, String createdAt, String updatedAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}

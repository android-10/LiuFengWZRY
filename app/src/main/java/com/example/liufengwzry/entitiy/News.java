package com.example.liufengwzry.entitiy;

import java.io.Serializable;

public class News implements Serializable {

    /**
     * userId : 1
     * id : 1
     * title : sunt aut facere repellat provident occaecati excepturi optio reprehenderit
     * body : quia et suscipit
     suscipit recusandae consequuntur expedita et cum
     reprehenderit molestiae ut ut quas totam
     nostrum rerum est autem sunt rem eveniet architecto
     */

    private int userId;
    private int id;
    private String title;
    private String body;

    @Override
    public String toString() {
        return "News{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

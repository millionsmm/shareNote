
package com.aoliao.notebook.utils.entity;

import java.util.List;

public class Write {
    private Integer type;//item类型
    private List<Content> contents;
    private String contentPart;
    public static class Content {
        private Integer type;//当前内容类型
        private String img;//图片
        private String text;//文字

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<Content> getContents() {
        return contents;
    }

    public void setContents(List<Content> contents) {
        this.contents = contents;
    }

    public String getContentPart() {
        return contentPart;
    }

    public void setContentPart(String contentPart) {
        this.contentPart = contentPart;
    }
}

package com.rainway.sachiel.messages;

public class File {

    private String path;
    private long fileSize;

    public File() {
    }

    public File(String path, long fileSize) {
        this.path = path;
        this.fileSize = fileSize;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return "File{" +
                "path='" + path + '\'' +
                ", fileSize=" + fileSize +
                '}';
    }
}

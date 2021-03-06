package com.dmytrobohdanov.testtaskfilemanager.Utils.Database;

import com.dmytrobohdanov.testtaskfilemanager.Utils.Constants;
import com.dmytrobohdanov.testtaskfilemanager.Utils.FileType;

import java.util.Date;

/**
 * Describes model of data we are using to keep DB and display
 */
public class DataModel {
    private int id;

    private String fileName;
    private FileType fileType;
    private Date modifiedDate;

    //id of folder keep this file
    private int folderId;

    private boolean isOrange;
    private boolean isBlue;

    private boolean isFolder;


    public DataModel(int id, String fileName, int folderId, boolean isFolder, Date modifiedDate, FileType fileType, boolean isOrange, boolean isBlue) {
        this.id = id;
        this.folderId = folderId;
        this.fileName = fileName;
        this.isFolder = isFolder;
        this.modifiedDate = modifiedDate;
        this.fileType = fileType;
        this.isOrange = isOrange;
        this.isBlue = isBlue;
    }

    /**
     * Constructor without id, to create dataModel instance to put in DB to get ID
     */
    public DataModel(String fileName, int folderId, boolean isFolder, Date modifiedDate, FileType fileType, boolean isOrange, boolean isBlue) {
        this.folderId = folderId;
        this.fileName = fileName;
        this.isFolder = isFolder;
        this.modifiedDate = modifiedDate;
        this.fileType = fileType;
        this.isOrange = isOrange;
        this.isBlue = isBlue;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public boolean isFolder() {
        return isFolder;
    }

    public void setFolder(boolean folder) {
        isFolder = folder;
    }

    /**
     * Setter to set data from database representation of bool
     *
     * @param isFolder int value, 0 is false, 1 is true
     */
    public void setFolder(int isFolder) {
        if (isFolder == Constants.INT_TRUE) {
            this.isFolder = true;
        } else if (isFolder == Constants.INT_FALSE) {
            this.isFolder = false;
        } else {
            throw new IllegalArgumentException("wrong argument passed to method");
        }
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(long time) {
        this.modifiedDate = new Date(time);
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    public boolean isOrange() {
        return isOrange;
    }

    /**
     * Setter to set data from database representation of bool
     *
     * @param isOrange int value, 0 is false, 1 is true
     */
    public void setOrange(int isOrange) {
        if (isOrange == Constants.INT_TRUE) {
            this.isOrange = true;
        } else if (isOrange == Constants.INT_FALSE) {
            this.isOrange = false;
        } else {
            throw new IllegalArgumentException("wrong argument passed to method");
        }
    }

    public void setOrange(boolean orange) {
        isOrange = orange;
    }

    public boolean isBlue() {
        return isBlue;
    }

    public void setBlue(boolean blue) {
        isBlue = blue;
    }

    /**
     * Setter to set data from database representation of bool
     *
     * @param isBlue int value, 0 is false, 1 is true
     */
    public void setBlue(int isBlue) {
        if (isBlue == Constants.INT_TRUE) {
            this.isBlue = true;
        } else if (isBlue == Constants.INT_FALSE) {
            this.isBlue = false;
        } else {
            throw new IllegalArgumentException("wrong argument passed to method");
        }
    }

    public String getModifiedDateString() {
        //todo get string from date
        return "January 1, 1970";
    }

    public int getFolderId() {
        return folderId;
    }

    public void setFolderId(int folderId) {
        this.folderId = folderId;
    }
}

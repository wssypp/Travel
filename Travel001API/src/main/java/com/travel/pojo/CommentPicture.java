package com.travel.pojo;

import java.io.Serializable;

public class CommentPicture implements Serializable {
    private Integer commentPictureId;

    private Integer scenicCommentId;

    private String commentPicturePath;

    private Integer commentPictureIntdescr;

    private String commentPictureVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getCommentPictureId() {
        return commentPictureId;
    }

    public void setCommentPictureId(Integer commentPictureId) {
        this.commentPictureId = commentPictureId;
    }

    public Integer getScenicCommentId() {
        return scenicCommentId;
    }

    public void setScenicCommentId(Integer scenicCommentId) {
        this.scenicCommentId = scenicCommentId;
    }

    public String getCommentPicturePath() {
        return commentPicturePath;
    }

    public void setCommentPicturePath(String commentPicturePath) {
        this.commentPicturePath = commentPicturePath == null ? null : commentPicturePath.trim();
    }

    public Integer getCommentPictureIntdescr() {
        return commentPictureIntdescr;
    }

    public void setCommentPictureIntdescr(Integer commentPictureIntdescr) {
        this.commentPictureIntdescr = commentPictureIntdescr;
    }

    public String getCommentPictureVardescr() {
        return commentPictureVardescr;
    }

    public void setCommentPictureVardescr(String commentPictureVardescr) {
        this.commentPictureVardescr = commentPictureVardescr == null ? null : commentPictureVardescr.trim();
    }
}
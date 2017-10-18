/**
 * Copyright 2017 aTool.org
 */
package com.liwenguang.service.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;
import java.util.List;

;

/**
 * Auto-generated: 2017-10-18 11:13:31
 *
 * @author aTool.org (i@aTool.org)
 * @website http://www.atool.org/json2javabean.php
 */
public class JianShuListBean {

    private String q;
    private int page;
    private String type;
    @JSONField(name = "total_count", serialize = false)
    private int totalCount;
    @JSONField(name = "per_page")
    private int perPage;
    @JSONField(name = "total_pages")
    private int totalPages;
    @JSONField(name = "order_by")
    private String orderBy;
    private List<Entries> entries;
    @JSONField(name = "related_users")
    private List<RelatedUsers> relatedUsers;
    @JSONField(name = "more_related_users")
    private boolean moreRelatedUsers;
    @JSONField(name = "related_collections")
    private List<RelatedCollections> relatedCollections;
    @JSONField(name = "more_related_collections")
    private boolean moreRelatedCollections;

    public void setQ(String q) {
        this.q = q;
    }

    public String getQ() {
        return q;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public int getPerPage() {
        return perPage;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setEntries(List<Entries> entries) {
        this.entries = entries;
    }

    public List<Entries> getEntries() {
        return entries;
    }

    public void setRelatedUsers(List<RelatedUsers> relatedUsers) {
        this.relatedUsers = relatedUsers;
    }

    public List<RelatedUsers> getRelatedUsers() {
        return relatedUsers;
    }

    public void setMoreRelatedUsers(boolean moreRelatedUsers) {
        this.moreRelatedUsers = moreRelatedUsers;
    }

    public boolean getMoreRelatedUsers() {
        return moreRelatedUsers;
    }

    public void setRelatedCollections(List<RelatedCollections> relatedCollections) {
        this.relatedCollections = relatedCollections;
    }

    public List<RelatedCollections> getRelatedCollections() {
        return relatedCollections;
    }

    public void setMoreRelatedCollections(boolean moreRelatedCollections) {
        this.moreRelatedCollections = moreRelatedCollections;
    }

    public boolean getMoreRelatedCollections() {
        return moreRelatedCollections;
    }

    public static class Entries {

        private int id;
        private String title;
        private String slug;
        private String content;
        private User user;
        private Notebook notebook;
        private boolean commentable;
        @JSONField(name = "public_comments_count")
        private int publicCommentsCount;
        @JSONField(name = "likes_count")
        private int likesCount;
        @JSONField(name = "views_count")
        private int viewsCount;
        @JSONField(name = "total_rewards_count")
        private int totalRewardsCount;
        @JSONField(name = "first_shared_at")
        private Date firstSharedAt;

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getSlug() {
            return slug;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public User getUser() {
            return user;
        }

        public void setNotebook(Notebook notebook) {
            this.notebook = notebook;
        }

        public Notebook getNotebook() {
            return notebook;
        }

        public void setCommentable(boolean commentable) {
            this.commentable = commentable;
        }

        public boolean getCommentable() {
            return commentable;
        }

        public void setPublicCommentsCount(int publicCommentsCount) {
            this.publicCommentsCount = publicCommentsCount;
        }

        public int getPublicCommentsCount() {
            return publicCommentsCount;
        }

        public void setLikesCount(int likesCount) {
            this.likesCount = likesCount;
        }

        public int getLikesCount() {
            return likesCount;
        }

        public void setViewsCount(int viewsCount) {
            this.viewsCount = viewsCount;
        }

        public int getViewsCount() {
            return viewsCount;
        }

        public void setTotalRewardsCount(int totalRewardsCount) {
            this.totalRewardsCount = totalRewardsCount;
        }

        public int getTotalRewardsCount() {
            return totalRewardsCount;
        }

        public void setFirstSharedAt(Date firstSharedAt) {
            this.firstSharedAt = firstSharedAt;
        }

        public Date getFirstSharedAt() {
            return firstSharedAt;
        }
    }

    public static class RelatedUsers {

        private int id;
        @JSONField(name = "avatar_url")
        private String avatarUrl;
        private String nickname;
        private String slug;
        @JSONField(name = "total_wordage")
        private int totalWordage;
        @JSONField(name = "total_likes_count")
        private int totalLikesCount;

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getNickname() {
            return nickname;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getSlug() {
            return slug;
        }

        public void setTotalWordage(int totalWordage) {
            this.totalWordage = totalWordage;
        }

        public int getTotalWordage() {
            return totalWordage;
        }

        public void setTotalLikesCount(int totalLikesCount) {
            this.totalLikesCount = totalLikesCount;
        }

        public int getTotalLikesCount() {
            return totalLikesCount;
        }
    }

    public static class RelatedCollections {

        private int id;
        private String title;
        private String slug;
        @JSONField(name = "image_url")
        private String imageUrl;
        @JSONField(name = "public_notes_count")
        private int publicNotesCount;
        @JSONField(name = "likes_count")
        private int likesCount;

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getSlug() {
            return slug;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setPublicNotesCount(int publicNotesCount) {
            this.publicNotesCount = publicNotesCount;
        }

        public int getPublicNotesCount() {
            return publicNotesCount;
        }

        public void setLikesCount(int likesCount) {
            this.likesCount = likesCount;
        }

        public int getLikesCount() {
            return likesCount;
        }
    }

    public static class Notebook {

        private int id;
        private String name;

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class User {

        private int id;
        private String nickname;
        private String slug;
        @JSONField(name = "avatar_url")
        private String avatarUrl;

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getNickname() {
            return nickname;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getSlug() {
            return slug;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

    }
}
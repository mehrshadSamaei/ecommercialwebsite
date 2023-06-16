package com.example.ecommercialwithservlet.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "review", schema = "bookstoredb")
public class ReviewEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "review_id")
    private int reviewId;
    @Basic
    @Column(name = "book_id")
    private int bookId;
    @Basic
    @Column(name = "customer_id")
    private int customerId;
    @Basic
    @Column(name = "rating")
    private int rating;
    @Basic
    @Column(name = "handling")
    private String handling;
    @Basic
    @Column(name = "comment")
    private String comment;
    @Basic
    @Column(name = "review_time")
    private Timestamp reviewTime;

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getHandling() {
        return handling;
    }

    public void setHandling(String handling) {
        this.handling = handling;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Timestamp getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Timestamp reviewTime) {
        this.reviewTime = reviewTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReviewEntity that = (ReviewEntity) o;

        if (reviewId != that.reviewId) return false;
        if (bookId != that.bookId) return false;
        if (customerId != that.customerId) return false;
        if (rating != that.rating) return false;
        if (handling != null ? !handling.equals(that.handling) : that.handling != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (reviewTime != null ? !reviewTime.equals(that.reviewTime) : that.reviewTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reviewId;
        result = 31 * result + bookId;
        result = 31 * result + customerId;
        result = 31 * result + rating;
        result = 31 * result + (handling != null ? handling.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (reviewTime != null ? reviewTime.hashCode() : 0);
        return result;
    }
}

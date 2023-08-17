package com.lcwd.rating.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user_ratings")
public class Rating {
    @Id
    @Column(name="ID")
    private String ratingId;
    @Column(name="USERID")
    private String userId;
    @Column(name="HOTELID")
    private String hotelId;
    @Column(name="RATING")
    private  int rating;
    @Column(name="FEEDBACK")
    private  String feedback;
}
package com.example.agileprojectbackend.model;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String synopsis;
    private String directedBy;
    private String rated;
    private Time runningTime;
    private String genre;
    private Date releaseDate;
    private String castAndCrews;
    private String poster;
    private String status;
    private Double criticsRating;
    private Double audienceRating;

    public Movie(Integer id, String name, String synopsis, String directedBy, String rated,
                 Time runningTime, String genre, Date releaseDate, String castAndCrews, String poster,
                 String status, Double criticsRating, Double audienceRating) {
        this.id = id;
        this.name = name;
        this.synopsis = synopsis;
        this.directedBy = directedBy;
        this.rated = rated;
        this.runningTime = runningTime;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.castAndCrews = castAndCrews;
        this.poster = poster;
        this.status = status;
        this.criticsRating = criticsRating;
        this.audienceRating = audienceRating;
    }
    public Movie() {
    }
    public Integer getMovieId() {
        return id;
    }
    public void setMovieId(Integer movieId) {
        this.id = movieId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSynopsis() {
        return synopsis;
    }
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    public String getDirectedBy() {
        return directedBy;
    }
    public void setDirectedBy(String directedBy) {
        this.directedBy = directedBy;
    }
    public String getRated() {
        return rated;
    }
    public void setRated(String rated) {
        this.rated = rated;
    }
    public Time getRunningTime() {
        return runningTime;
    }
    public void setRunningTime(Time runningTime) {
        this.runningTime = runningTime;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public Date getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
    public String getCastAndCrews() {
        return castAndCrews;
    }
    public void setCastAndCrews(String castAndCrews) {
        this.castAndCrews = castAndCrews;
    }
    public String getPoster() {
        return poster;
    }
    public void setPoster(String poster) {
        this.poster = poster;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Double getCriticsRating() {
        return criticsRating;
    }
    public void setCriticsRating(Double criticsRating) {
        this.criticsRating = criticsRating;
    }
    public Double getAudienceRating() {
        return audienceRating;
    }
    public void setAudienceRating(Double audienceRating) {
        this.audienceRating = audienceRating;
    }
}
package com.example.agileprojectbackend.dto;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

public class MovieResponse {

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

    public MovieResponse(Integer id, String name, String synopsis, String directedBy, String rated, Time runningTime, String genre, Date releaseDate, String castAndCrews, String poster) {
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
    }

    public MovieResponse() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}

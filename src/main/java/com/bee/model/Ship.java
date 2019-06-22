package com.bee.model;

public class Ship {
    private Long id;
    private String name;
    private String description;
    private String condition;
    private Integer depth;
    private Double latitude;
    private Double longitute;
    private Integer yearDiscovered;

    public Ship() {
    }

    public Ship(Long id, String name, String description, String condition, Integer depth, Double latitude, Double longitute, Integer yearDiscovered) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.condition = condition;
        this.depth = depth;
        this.latitude = latitude;
        this.longitute = longitute;
        this.yearDiscovered = yearDiscovered;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitute() {
        return longitute;
    }

    public void setLongitute(Double longitute) {
        this.longitute = longitute;
    }

    public Integer getYearDiscovered() {
        return yearDiscovered;
    }

    public void setYearDiscovered(Integer yearDiscovered) {
        this.yearDiscovered = yearDiscovered;
    }
}

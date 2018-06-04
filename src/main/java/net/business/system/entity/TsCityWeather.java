package net.business.system.entity;

import javax.persistence.*;

@Table(name = "TS_CITY_WEATHER")
public class TsCityWeather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT SCOPE_IDENTITY()")
    private String id;

    private String city;

    private String py;

    private String fpy;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * @return py
     */
    public String getPy() {
        return py;
    }

    /**
     * @param py
     */
    public void setPy(String py) {
        this.py = py == null ? null : py.trim();
    }

    /**
     * @return fpy
     */
    public String getFpy() {
        return fpy;
    }

    /**
     * @param fpy
     */
    public void setFpy(String fpy) {
        this.fpy = fpy == null ? null : fpy.trim();
    }
}
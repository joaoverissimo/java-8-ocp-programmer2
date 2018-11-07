package com.verissimo.aula000_dtos;

public class MyItemDTO implements Comparable<MyItemDTO> {

    private Long id;
    private String name;
    private Integer qntd;

    public MyItemDTO() {
    }

    public MyItemDTO(Long id, String name, Integer qntd) {
        this.id = id;
        this.name = name;
        this.qntd = qntd;
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

    public Integer getQntd() {
        return qntd;
    }

    public void setQntd(Integer qntd) {
        this.qntd = qntd;
    }

    @Override
    public String toString() {
        return "\n MyItemDTO{" + "id=" + id + ", name='" + name + '\'' + ", qntd=" + qntd + '}';
    }

    @Override
    public int compareTo(MyItemDTO o) {
        return name.compareTo(o.getName());
    }
}

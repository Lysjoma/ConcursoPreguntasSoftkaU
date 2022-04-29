package com.example.demo.dao.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "category", schema = "questions", catalog = "")
public class CategoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_category")
    private int idCategory;
    @Basic
    @Column(name = "category")
    private String category;
    @JsonIgnore
    @OneToMany(mappedBy = "categoryByIdCategory")
    private Collection<QuestionsEntity> questionsByIdCategory;
    @JsonIgnore
    @OneToMany(mappedBy = "categoryByIdCategory")
    private Collection<RoundEntity> roundsByIdCategory;

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryEntity that = (CategoryEntity) o;
        return idCategory == that.idCategory && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCategory, category);
    }

    public Collection<QuestionsEntity> getQuestionsByIdCategory() {
        return questionsByIdCategory;
    }

    public void setQuestionsByIdCategory(Collection<QuestionsEntity> questionsByIdCategory) {
        this.questionsByIdCategory = questionsByIdCategory;
    }

    public Collection<RoundEntity> getRoundsByIdCategory() {
        return roundsByIdCategory;
    }

    public void setRoundsByIdCategory(Collection<RoundEntity> roundsByIdCategory) {
        this.roundsByIdCategory = roundsByIdCategory;
    }
}

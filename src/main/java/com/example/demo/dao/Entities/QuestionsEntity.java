package com.example.demo.dao.Entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "questions", schema = "questions", catalog = "")
public class QuestionsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_question")
    private int idQuestion;
    @Basic
    @Column(name = "question")
    private String question;
    @Basic
    @Column(name = "id_category")
    private int idCategory;
    @OneToMany(mappedBy = "questionsByIdQuestion")
    private Collection<QuestionanswerEntity> questionanswersByIdQuestion;
    @ManyToOne
    @JoinColumn(name = "id_category", referencedColumnName = "id_category", nullable = false,insertable=false, updatable=false)
    private CategoryEntity categoryByIdCategory;
    @OneToMany(mappedBy = "questionsByIdQuestion")
    private Collection<RoundQuestionEntity> roundQuestionsByIdQuestion;

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionsEntity that = (QuestionsEntity) o;
        return idQuestion == that.idQuestion && idCategory == that.idCategory && Objects.equals(question, that.question);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idQuestion, question, idCategory);
    }

    public Collection<QuestionanswerEntity> getQuestionanswersByIdQuestion() {
        return questionanswersByIdQuestion;
    }

    public void setQuestionanswersByIdQuestion(Collection<QuestionanswerEntity> questionanswersByIdQuestion) {
        this.questionanswersByIdQuestion = questionanswersByIdQuestion;
    }

    public CategoryEntity getCategoryByIdCategory() {
        return categoryByIdCategory;
    }

    public void setCategoryByIdCategory(CategoryEntity categoryByIdCategory) {
        this.categoryByIdCategory = categoryByIdCategory;
    }

    public Collection<RoundQuestionEntity> getRoundQuestionsByIdQuestion() {
        return roundQuestionsByIdQuestion;
    }

    public void setRoundQuestionsByIdQuestion(Collection<RoundQuestionEntity> roundQuestionsByIdQuestion) {
        this.roundQuestionsByIdQuestion = roundQuestionsByIdQuestion;
    }
}

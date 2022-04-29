package com.example.demo.dao.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "answers", schema = "questions", catalog = "")
public class AnswersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_answer")
    private int idAnswer;
    @Basic
    @Column(name = "answer")
    private String answer;
    @Basic
    @Column(name = "is_correct")
    private int isCorrect;
    @JsonIgnore
    @OneToMany(mappedBy = "answersByIdAnswer")
    private Collection<QuestionanswerEntity> questionanswersByIdAnswer;

    public int getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(int idAnswer) {
        this.idAnswer = idAnswer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(int isCorrect) {
        this.isCorrect = isCorrect;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnswersEntity that = (AnswersEntity) o;
        return idAnswer == that.idAnswer && isCorrect == that.isCorrect && Objects.equals(answer, that.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAnswer, answer, isCorrect);
    }

    public Collection<QuestionanswerEntity> getQuestionanswersByIdAnswer() {
        return questionanswersByIdAnswer;
    }

    public void setQuestionanswersByIdAnswer(Collection<QuestionanswerEntity> questionanswersByIdAnswer) {
        this.questionanswersByIdAnswer = questionanswersByIdAnswer;
    }
}

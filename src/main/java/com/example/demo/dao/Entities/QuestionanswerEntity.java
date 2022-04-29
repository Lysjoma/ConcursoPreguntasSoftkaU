package com.example.demo.dao.Entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "questionanswer", schema = "questions", catalog = "")
@IdClass(QuestionanswerEntityPK.class)
public class QuestionanswerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_question")
    private int idQuestion;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_answer")
    private int idAnswer;
    @ManyToOne
    @JoinColumn(name = "id_question", referencedColumnName = "id_question", nullable = false, insertable=false, updatable=false)
    private QuestionsEntity questionsByIdQuestion;
    @ManyToOne
    @JoinColumn(name = "id_answer", referencedColumnName = "id_answer", nullable = false, insertable=false, updatable=false)
    private AnswersEntity answersByIdAnswer;

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public int getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(int idAnswer) {
        this.idAnswer = idAnswer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionanswerEntity that = (QuestionanswerEntity) o;
        return idQuestion == that.idQuestion && idAnswer == that.idAnswer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idQuestion, idAnswer);
    }

    public QuestionsEntity getQuestionsByIdQuestion() {
        return questionsByIdQuestion;
    }

    public void setQuestionsByIdQuestion(QuestionsEntity questionsByIdQuestion) {
        this.questionsByIdQuestion = questionsByIdQuestion;
    }

    public AnswersEntity getAnswersByIdAnswer() {
        return answersByIdAnswer;
    }

    public void setAnswersByIdAnswer(AnswersEntity answersByIdAnswer) {
        this.answersByIdAnswer = answersByIdAnswer;
    }
}

package com.example.demo.dao.Entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "round", schema = "questions", catalog = "")
public class RoundEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_round")
    private int idRound;
    @Basic
    @Column(name = "id_reward")
    private int idReward;
    @Basic
    @Column(name = "level")
    private int level;
    @Basic
    @Column(name = "id_category")
    private int idCategory;
    @OneToMany(mappedBy = "roundByIdRound")
    private Collection<GameroundEntity> gameroundsByIdRound;
    @ManyToOne
    @JoinColumn(name = "id_reward", referencedColumnName = "id_reward", nullable = false, insertable=false, updatable=false)
    private RewardEntity rewardByIdReward;
    @ManyToOne
    @JoinColumn(name = "id_category", referencedColumnName = "id_category", nullable = false, insertable=false, updatable=false)
    private CategoryEntity categoryByIdCategory;
    @OneToMany(mappedBy = "roundByIdRound")
    private Collection<RoundQuestionEntity> roundQuestionsByIdRound;

    public int getIdRound() {
        return idRound;
    }

    public void setIdRound(int idRound) {
        this.idRound = idRound;
    }

    public int getIdReward() {
        return idReward;
    }

    public void setIdReward(int idReward) {
        this.idReward = idReward;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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
        RoundEntity that = (RoundEntity) o;
        return idRound == that.idRound && idReward == that.idReward && level == that.level && idCategory == that.idCategory;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRound, idReward, level, idCategory);
    }

    public Collection<GameroundEntity> getGameroundsByIdRound() {
        return gameroundsByIdRound;
    }

    public void setGameroundsByIdRound(Collection<GameroundEntity> gameroundsByIdRound) {
        this.gameroundsByIdRound = gameroundsByIdRound;
    }

    public RewardEntity getRewardByIdReward() {
        return rewardByIdReward;
    }

    public void setRewardByIdReward(RewardEntity rewardByIdReward) {
        this.rewardByIdReward = rewardByIdReward;
    }

    public CategoryEntity getCategoryByIdCategory() {
        return categoryByIdCategory;
    }

    public void setCategoryByIdCategory(CategoryEntity categoryByIdCategory) {
        this.categoryByIdCategory = categoryByIdCategory;
    }

    public Collection<RoundQuestionEntity> getRoundQuestionsByIdRound() {
        return roundQuestionsByIdRound;
    }

    public void setRoundQuestionsByIdRound(Collection<RoundQuestionEntity> roundQuestionsByIdRound) {
        this.roundQuestionsByIdRound = roundQuestionsByIdRound;
    }
}

package com.example.demo.dao.Entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "reward", schema = "questions", catalog = "")
public class RewardEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_reward")
    private int idReward;
    @Basic
    @Column(name = "reward")
    private Integer reward;
    @OneToMany(mappedBy = "rewardByIdReward")
    private Collection<RoundEntity> roundsByIdReward;

    public int getIdReward() {
        return idReward;
    }

    public void setIdReward(int idReward) {
        this.idReward = idReward;
    }

    public Integer getReward() {
        return reward;
    }

    public void setReward(Integer reward) {
        this.reward = reward;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RewardEntity that = (RewardEntity) o;
        return idReward == that.idReward && Objects.equals(reward, that.reward);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idReward, reward);
    }

    public Collection<RoundEntity> getRoundsByIdReward() {
        return roundsByIdReward;
    }

    public void setRoundsByIdReward(Collection<RoundEntity> roundsByIdReward) {
        this.roundsByIdReward = roundsByIdReward;
    }
}

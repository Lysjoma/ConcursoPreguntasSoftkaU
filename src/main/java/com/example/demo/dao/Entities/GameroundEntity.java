package com.example.demo.dao.Entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "gameround", schema = "questions", catalog = "")
@IdClass(GameroundEntityPK.class)
public class GameroundEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_round")
    private int idRound;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_game")
    private int idGame;
    @ManyToOne
    @JoinColumn(name = "id_round", referencedColumnName = "id_round", nullable = false, insertable=false, updatable=false)
    private RoundEntity roundByIdRound;
    @ManyToOne
    @JoinColumn(name = "id_game", referencedColumnName = "id_game", nullable = false, insertable=false, updatable=false)
    private GameEntity gameByIdGame;

    public int getIdRound() {
        return idRound;
    }

    public void setIdRound(int idRound) {
        this.idRound = idRound;
    }

    public int getIdGame() {
        return idGame;
    }

    public void setIdGame(int idGame) {
        this.idGame = idGame;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameroundEntity that = (GameroundEntity) o;
        return idRound == that.idRound && idGame == that.idGame;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRound, idGame);
    }

    public RoundEntity getRoundByIdRound() {
        return roundByIdRound;
    }

    public void setRoundByIdRound(RoundEntity roundByIdRound) {
        this.roundByIdRound = roundByIdRound;
    }

    public GameEntity getGameByIdGame() {
        return gameByIdGame;
    }

    public void setGameByIdGame(GameEntity gameByIdGame) {
        this.gameByIdGame = gameByIdGame;
    }
}

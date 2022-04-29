package com.example.demo.dao.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "game", schema = "questions", catalog = "")
public class GameEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_game")
    private int idGame;
    @Basic
    @Column(name = "id_player")
    private int idPlayer;
    @Basic
    @Column(name = "status")
    private String status;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_player", referencedColumnName = "id", nullable = false, insertable=false, updatable=false)
    private PlayerEntity playerByIdPlayer;
    @JsonIgnore
    @OneToMany(mappedBy = "gameByIdGame")
    private Collection<GamehistoryEntity> gamehistoriesByIdGame;
    @JsonIgnore
    @OneToMany(mappedBy = "gameByIdGame")
    private Collection<GameroundEntity> gameroundsByIdGame;

    public int getIdGame() {
        return idGame;
    }

    public void setIdGame(int idGame) {
        this.idGame = idGame;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameEntity that = (GameEntity) o;
        return idGame == that.idGame && idPlayer == that.idPlayer && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGame, idPlayer, status);
    }

    public PlayerEntity getPlayerByIdPlayer() {
        return playerByIdPlayer;
    }

    public void setPlayerByIdPlayer(PlayerEntity playerByIdPlayer) {
        this.playerByIdPlayer = playerByIdPlayer;
    }

    public Collection<GamehistoryEntity> getGamehistoriesByIdGame() {
        return gamehistoriesByIdGame;
    }

    public void setGamehistoriesByIdGame(Collection<GamehistoryEntity> gamehistoriesByIdGame) {
        this.gamehistoriesByIdGame = gamehistoriesByIdGame;
    }

    public Collection<GameroundEntity> getGameroundsByIdGame() {
        return gameroundsByIdGame;
    }

    public void setGameroundsByIdGame(Collection<GameroundEntity> gameroundsByIdGame) {
        this.gameroundsByIdGame = gameroundsByIdGame;
    }
}

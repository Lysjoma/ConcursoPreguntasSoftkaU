package com.example.demo.dao.Entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "gamehistory", schema = "questions", catalog = "")
public class GamehistoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_history")
    private int idHistory;
    @Basic
    @Column(name = "id_game")
    private int idGame;
    @ManyToOne
    @JoinColumn(name = "id_game", referencedColumnName = "id_game", nullable = false, insertable=false, updatable=false)
    private GameEntity gameByIdGame;

    public int getIdHistory() {
        return idHistory;
    }

    public void setIdHistory(int idHistory) {
        this.idHistory = idHistory;
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
        GamehistoryEntity that = (GamehistoryEntity) o;
        return idHistory == that.idHistory && idGame == that.idGame;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHistory, idGame);
    }

    public GameEntity getGameByIdGame() {
        return gameByIdGame;
    }

    public void setGameByIdGame(GameEntity gameByIdGame) {
        this.gameByIdGame = gameByIdGame;
    }
}

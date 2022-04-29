package com.example.demo.dao.Entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class GameroundEntityPK implements Serializable {
    @Column(name = "id_round")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRound;
    @Column(name = "id_game")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGame;

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
        GameroundEntityPK that = (GameroundEntityPK) o;
        return idRound == that.idRound && idGame == that.idGame;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRound, idGame);
    }
}

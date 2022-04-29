package com.example.demo.controller;

import com.example.demo.dao.Entities.*;
import com.example.demo.dao.Reposirtory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api")
public class PlayerController {

    @Autowired
    PlayerEntityRepository playerEntityRepository;

    @Autowired
    GameEntityRepository gameEntityRepository;

    @Autowired
    AnswersEntityRepository answersEntityRepository;

    @Autowired
    QuestionsEntityRepository questionsEntityRepository;

    @Autowired
    CategoryEntityRepository categoryEntityRepository;

    @Autowired
    GameHistoryEntityRepository gameHistoryEntityRepository;

    @Autowired
    GameRoundEntityRepository gameRoundEntityRepository;

    @Autowired
    QuestionAnswerEntityRepository questionAnswerEntityRepository;

    @Autowired
    RewardEntityRepository rewardEntityRepository;

    @Autowired
    RoundEntityRepository roundEntityRepository;

    @Autowired
    RoundQuestionEntityRepository roundQuestionEntityRepository;

    @GetMapping("/player")
    public List<PlayerEntity> getAllPlayers() {
        return playerEntityRepository.findAll();
    }

    @GetMapping("/game")
    public List<GameEntity> getAllGames() {
        return gameEntityRepository.findAll();
    }

    @GetMapping("/answers")
    public List<AnswersEntity> getAllAnswers() {
        return answersEntityRepository.findAll();
    }

    @GetMapping("/questions")
    public List<QuestionsEntity> getAllQuestions() {
        return questionsEntityRepository.findAll();
    }

    @GetMapping("/categories")
    public List<CategoryEntity> getAllCategories() {
        return categoryEntityRepository.findAll();
    }

    @GetMapping("/gameHistories")
    public List<GamehistoryEntity> getAllGameHistories() {
        return gameHistoryEntityRepository.findAll();
    }

    @GetMapping("/gameRounds")
    public List<GameroundEntity> getAllGameRounds() { return gameRoundEntityRepository.findAll(); }

    @GetMapping("/questionAnswers")
    public List<QuestionanswerEntity> getAllQuestionAnswers() {
        return questionAnswerEntityRepository.findAll();
    }

    @GetMapping("/rewards")
    public List<RewardEntity> getAllRewards() {
        return rewardEntityRepository.findAll();
    }

    @GetMapping("/rounds")
    public List<RoundEntity> getAllRounds() {
        return roundEntityRepository.findAll();
    }

    @GetMapping("/roundQuestions")
    public List<RoundQuestionEntity> getAllRoundsQuestions() {
        return roundQuestionEntityRepository.findAll();
    }

}

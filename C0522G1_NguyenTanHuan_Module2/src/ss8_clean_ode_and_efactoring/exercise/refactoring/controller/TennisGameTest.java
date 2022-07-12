package ss8_clean_ode_and_efactoring.exercise.refactoring.controller;


import ss8_clean_ode_and_efactoring.exercise.refactoring.module.TennisGame;

public class TennisGameTest {
    public static void main(String[] args) {
        TennisGame tennisGame =new TennisGame();
        System.out.println(tennisGame.getScore(1,3));
        System.out.println(tennisGame);
    }


}

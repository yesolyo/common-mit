package Work.Masters;

import java.util.Scanner;

class Player {

    public boolean isStay() {
        return true;
    }

    public void hit(Object pick) {

    }

    public void showCards() {

    }

    public void stay() {
    }

    public Object getCards() {
        return "dd";
    }
}

class Deck {

    public Object pick() {
        return "dd";
    }
}

class Rule {

    public static void judge(Player dealer, Player gamer) {

    }

    public static boolean getScore(Object cards) {
        return false;
    }
}

public class BlackJack {
    public static void main(String[] args) {
        System.out.println("== 블랙잭 ==");
        Scanner input = new Scanner(System.in);
        Player dealer = new Player(); // 딜러 생성
        Player gamer = new Player(); // 게이머 생성
        Deck deck = new Deck(); // 덱 생성
        init(deck, dealer, gamer); // 첫 카드 돌림
        while (!(dealer.isStay() && gamer.isStay())) { // 게임 진행
            playing(input, deck, dealer, gamer);
        }
        Rule.judge(dealer, gamer); // 최종결과 판단
    }

    public static void init(Deck deck, Player dealer, Player gamer) {
        System.out.println("게이머가 2장의 카드를 받습니다.");
        gamer.hit(deck.pick());
        gamer.hit(deck.pick());
        System.out.println("딜러가 2장의 카드를 받습니다.");
        dealer.hit(deck.pick());
        dealer.hit(deck.pick());
        System.out.println("게이머의 카드는 다음과 같습니다.");
        gamer.showCards();
        System.out.println("딜러의 카드는 다음과 같습니다.");
        dealer.showCards();
    }

    public static void playing(Scanner input, Deck deck, Player dealer, Player gamer) {
        System.out.println("카드를 더 받으려면 1 아니면 0을 입력: ");
        int choice = input.nextInt();
        if (choice == 1)
            gamer.hit(deck.pick());
        else
            gamer.stay();
        if (Rule.getScore(dealer.getCards()))
            dealer.hit(deck.pick());
        else
            dealer.stay();
        System.out.println("게이머의 카드는 다음과 같습니다.");
        gamer.showCards();
        System.out.println("딜러의 카드는 다음과 같습니다.");
        dealer.showCards();
    }
}

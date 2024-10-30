public class Gameval {
    public static void main(String[] args) {
        game LOL = new game("LOL", "aos", "riot", "11.12.04");
        game overwatch = new game("overwatch", "fps", "blizzard", "16.05.24");
        game valorant = new game("valorant", "fps", "riot", "20.05.05");

        game[] games = {LOL, overwatch, valorant};

        System.out.println("게임 목록:");
        for(int i = 0; i < games.length; i++){
            System.out.println(games[i].name + " " + games[i].type + " " + games[i].maker + " " + games[i].date);
        }

        for (int i = 0; i < games.length; i++) {
            games[i].Gamestart();
        }

        // 사용량 계산 예제
        LOL.calculateUsage(5);
        LOL.calculateUsage(2, 3);
    }
}

class game {
    String name;
    String type;
    String maker;
    String date;
    boolean isGameon = false;
    int totalPlayTime = 0;
    int playCount = 0;

    game(String name, String type, String maker, String date) {
        this.name = name;
        this.type = type;
        this.maker = maker;
        this.date = date;
    }

    void Gamestart() {
        if (!isGameon) {
            isGameon = true;
            System.out.println(name + " 게임이 시작되었습니다.");
        } else {
            System.out.println(name + " 게임은 이미 시작되었습니다.");
        }
    }

    //플레이 시간(시간 단위)
    void calculateUsage(int hours) {
        totalPlayTime += hours;
        System.out.println(name + "의 총 플레이 시간: " + totalPlayTime + "시간");
    }

    //플레이 횟수와 플레이 시간
    void calculateUsage(int playCount, int hours) {
        this.playCount += playCount;
        totalPlayTime += hours;
        System.out.println(name + "의 총 플레이 횟수: " + this.playCount + "회, 총 플레이 시간: " + totalPlayTime + "시간");
    }
}
package praktikum07;

public class RainbowSix implements BasicGame, Character{


    @Override
    public String skill() {
        return "Bom";
    }

    @Override
    public int hp() {
        return 1000;
    }

    @Override
    public int exp() {
        return 5000;
    }

    @Override
    public String karakterPertama() {
        return "Agent 001";
    }

    @Override
    public String karakterKedua() {
        return "Agent 007";
    }

    @Override
    public String karakterKetiga() {
        return "Agent 010";
    }

    public void skillHp(){
        BasicGame.super.skillHp();
    }
}

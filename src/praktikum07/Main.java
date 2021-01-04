package praktikum07;

public class Main {

    public static void main(String[] args){
        RainbowSix r6s = new RainbowSix();
        System.out.println("Skill dari r6s : " + r6s.skill());
        System.out.println("Hp dari r6s : " + r6s.hp());
        System.out.println("Exp dari r6s : " + r6s.exp());
        System.out.println("Agent ke-1 dari r6s : " + r6s.karakterPertama());
        System.out.println("Agent ke-2 dari r6s : " + r6s.karakterKedua());
        System.out.println("Agent ke-3 dari r6s : " + r6s.karakterKetiga());
        r6s.skillHp();
    }
}

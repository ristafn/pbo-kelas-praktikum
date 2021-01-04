package praktikum07;

public interface BasicGame {
//    final static int expHp = 1000; --> tidak bisa dirubah
    public String skill();
    public int hp();
    public int exp();

    default void skillHp(){
        int damage = 150;
        System.out.println("Damage 150");
    }
}

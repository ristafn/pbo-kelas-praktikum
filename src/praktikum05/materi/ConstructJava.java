package praktikum05.materi;

public class ConstructJava {
    public int angkaPertama;
    public int angkaKedua;

    public ConstructJava(int nilaiPertama, int nilaiKedua){
        this.angkaPertama = nilaiPertama;
        this.angkaKedua = nilaiKedua;
    }

    public int pertambahan(){
        return angkaPertama + angkaKedua;
    }

    public int pengurangan(){
        return angkaPertama - angkaKedua;
    }
}

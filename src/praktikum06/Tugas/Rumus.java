package praktikum06.Tugas;

public class Rumus {
    int a,b;

    public Rumus(int a, int b){
        this.a = a;
        this.b = b;
    }

    //    Rumus dasar
    int penjumlahan(){
        return a + b;
    }

    int pengurangan(){
        return a - b;
    }

    int kali(){
        return a * b;
    }

    int pangkat(){
        return (int) Math.pow(a ,b);
    }

    int bagi(){
        return a / b;
    }

    int sisaBagi(){
        return a % b;
    }

}

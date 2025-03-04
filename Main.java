// Kelas Induk (Super Class)
abstract class Cangkir {
    abstract void isiMinuman(); // Method abstrak yang akan dioverride
}

// Kelas Turunan untuk Cangkir Kopi
class CangkirKopi extends Cangkir {
    @Override
    void isiMinuman() {
        System.out.println("☕ Cangkir berisi kopi hitam yang harum!");
    }
}

// Kelas Turunan untuk Cangkir Teh
class CangkirTeh extends Cangkir {
    @Override
    void isiMinuman() {
        System.out.println("🍵 Cangkir berisi teh hijau yang menenangkan!");
    }
}

// Kelas Turunan untuk Cangkir Susu
class CangkirSusu extends Cangkir {
    @Override
    void isiMinuman() {
        System.out.println("🥛 Cangkir berisi susu hangat yang menyehatkan!");
    }
}

// Kelas Utama untuk Menjalankan Program
public class Main {
    public static void main(String[] args) {
        // Polymorphism: Semua objek bertipe Cangkir
        Cangkir kopi = new CangkirKopi();
        Cangkir teh = new CangkirTeh();
        Cangkir susu = new CangkirSusu();

        // Memanggil method isiMinuman() dari masing-masing objek
        kopi.isiMinuman();
        teh.isiMinuman();
        susu.isiMinuman();
    }
}

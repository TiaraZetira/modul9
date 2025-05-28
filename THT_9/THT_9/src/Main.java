class Transportasi {
    private String nama;
    private int jumlahKursi;
    private String tujuan;

    public Transportasi(String nama, int jumlahKursi, String tujuan) {
        this.nama = nama;
        this.jumlahKursi = jumlahKursi;
        this.tujuan = tujuan;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public double hitungHargaTiket() {
        return 100000;
    }
}

class Bus extends Transportasi {
    public Bus(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.10;
    }

    public double hitungHargaTiket(String kelasLayanan) {
        double hargaDasar = hitungHargaTiket();
        switch (kelasLayanan.toLowerCase()) {
            case "bisnis":
                return hargaDasar * 1.25;
            case "vip":
                return hargaDasar * 1.5;
            default:
                return hargaDasar;
        }
    }
}

class Kereta extends Transportasi {
    public Kereta(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.20;
    }

    public double hitungHargaTiket(String kelasLayanan) {
        double hargaDasar = hitungHargaTiket();
        switch (kelasLayanan.toLowerCase()) {
            case "bisnis":
                return hargaDasar * 1.25;
            case "vip":
                return hargaDasar * 1.5;
            default:
                return hargaDasar;
        }
    }
}

class Pesawat extends Transportasi {
    public Pesawat(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.50;
    }

    public double hitungHargaTiket(String kelasLayanan) {
        double hargaDasar = hitungHargaTiket();
        switch (kelasLayanan.toLowerCase()) {
            case "bisnis":
                return hargaDasar * 1.25;
            case "vip":
                return hargaDasar * 1.5;
            default:
                return hargaDasar;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Transportasi[] transportasiList = new Transportasi[3];
        transportasiList[0] = new Bus("Bus", 40, "Bandung");
        transportasiList[1] = new Kereta("Kereta", 200, "Surabaya");
        transportasiList[2] = new Pesawat("Pesawat", 150, "Medan");

        for (Transportasi t : transportasiList) {
            String jenis = t.getNama();
            String tujuan = t.getTujuan();

            System.out.println(jenis + " ke " + tujuan + " - Harga tiket (default): " + t.hitungHargaTiket());

            if (t instanceof Bus) {
                Bus b = (Bus) t;
                System.out.println(jenis + " ke " + tujuan + " - Harga tiket (Bisnis): " + b.hitungHargaTiket("Bisnis"));
            } else if (t instanceof Kereta) {
                Kereta k = (Kereta) t;
                System.out.println(jenis + " ke " + tujuan + " - Harga tiket (VIP): " + k.hitungHargaTiket("VIP"));
            } else if (t instanceof Pesawat) {
                Pesawat p = (Pesawat) t;
                System.out.println(jenis + " ke " + tujuan + " - Harga tiket (Ekonomi): " + p.hitungHargaTiket("Ekonomi"));
            }

            System.out.println(); 
        }
    }
}

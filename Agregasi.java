package mainclass;

class Alamat
{
    String AlmTinggal;
    String KabKota;
    String KodePos;
    String Provinsi;
    Alamat(String alm, String kab, String kode, String prov)
    {
        this.AlmTinggal = alm;
        this.KabKota = kab;
        this.KodePos = kode;
        this.Provinsi = prov;
    }
}
class Penduduk
{
    String NIK;
    String Nama;
    String Pekerjaan;
    Alamat almt;
    Penduduk(String NK, String Nm, String pkj, Alamat al) {
        this.NIK = NK;
        this.Nama = Nm;
        this.almt = al;
    }
}

class Agregasi {
    public static void main(String[] args) {
        Alamat pkp = new Alamat("Jln. Jendral Sudirman","Pangkalpinang","33117","Kepulauan Bangka Belitung");
        Penduduk ani = new Penduduk("12345","Ani Rhoma","Karyawan Swasta",pkp);
    
        System.out.println(" DATA PENDUDUK ");
        System.out.println("==============");
        System.out.println(" NIK      : "+ani.NIK);
        System.out.println(" Nama     : "+ani.Nama);
        System.out.println(" Alamat   : "+ani.almt.AlmTinggal);
        System.out.println(" Kota     : "+ani.almt.KabKota);
        System.out.println(" Provinsi : "+ani.almt.Provinsi);
    }
}

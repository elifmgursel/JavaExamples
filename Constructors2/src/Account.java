
public class Account {
	private String hesapNo;
	private double bakiye;
	private String isim;
	private String email;
	private String telefon;

	
	public Account() {
		
	this("bilgi yok",0.0,"bilgi yok","bilgi yok", "bilgi yok");
		
	}
	
	public Account (String isim, String email, String telefon) {
		
		/*this.isim = isim;
		this.email = email;
		this.telefon = telefon;
		this.bakiye = 0.0;
		this.hesapNo = "Bilgi yok";
		*/
		
		this("Bilgi yok", 0.0, isim,email,telefon);
	}
	public Account(String hesapNo,double bakiye,String isim,String email,String telefon) {
		this.bakiye = bakiye;
		this.hesapNo = hesapNo;
		this.isim = isim;
		this.email = email;
		this.telefon = telefon;
		
			}
	
	public void paraYatir (double miktar) {
		
		bakiye +=miktar;
	
		System.out.println("Yeni Bakiye: " +bakiye);
	}
	
	public void bilgilerigoster() {
		
		System.out.println("Hesap No: " +this.hesapNo);
		System.out.println("Bakiye: " +this.bakiye);
		System.out.println("isim: " +this.isim);
		System.out.println("Email: " +this.email);
		System.out.println("Telefon: " +this.telefon);
		
	}
	
	
	public void paraCekme (double miktar) {
		
		if (miktar > 1500 ) {
			
		
			System.out.println("Bir g?nde 1500den fazla para cekemezsiniz!");
		}
	
		if (bakiye - miktar <0  ) {
			
			System.out.println("Yeterli bakiyeniz yok! " +bakiye);
		}
		else {
			bakiye -=miktar;
			System.out.println("Yeni bakiyeniz: " +bakiye);
		}
	}
	
	
	public String getHesapNo() {
		return hesapNo;
	}

	public void setHesapNo(String hesapNo) {
		this.hesapNo = hesapNo;
	}

	public double getBakiye() {
		return bakiye;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
		
	
	}

public class AccountData {
	private String hesapNo;
	private double bakiye;
	private String isim;
	private String email;
	private String telefon;

	
	public AccountData() {
		
		System.out.println("Kendi yazdigim const..");
	}
	
	public AccountData(String hesapNo,double bakiye,String isim,String email,String telefon) {
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
	
	public void paraCekme (double miktar) {
		
		if (miktar > 1500 ) {
			
		
			System.out.println("Bir günde 1500den fazla para cekemezsiniz!");
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
package Buoi16_OOP;


public class Server extends ATM {

	@Override
	public void nap_tien() {
		System.out.println("Bạn đang nạp tiền");
	}

	@Override
	public void rut_tien() {
		System.out.println("Bạn đang rút tiền");
	}
	
	@Override
	public void xem_thong_tin() {
		System.out.println("Bạn đang xem thông tin");
	}

}

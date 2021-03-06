package spring.biz.orderinfo.vo;

public class OrderdetailVO {
	private String orderid;
	private String prodid;
	private String prodnm;
	private int prodprice;
	private int ordercnt;
	private String imgpath;
	
	public OrderdetailVO() {
		super();
	}

	public OrderdetailVO(String orderid, String prodid, String prodnm, int prodprice, int ordercnt, String imgpath) {
		super();
		this.orderid = orderid;
		this.prodid = prodid;
		this.prodnm = prodnm;
		this.prodprice = prodprice;
		this.ordercnt = ordercnt;
		this.imgpath = imgpath;
	}


	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getProdid() {
		return prodid;
	}

	public void setProdid(String prodid) {
		this.prodid = prodid;
	}

	public String getProdnm() {
		return prodnm;
	}

	public void setProdnm(String prodnm) {
		this.prodnm = prodnm;
	}

	public int getProdprice() {
		return prodprice;
	}

	public void setProdprice(int prodprice) {
		this.prodprice = prodprice;
	}

	public int getOrdercnt() {
		return ordercnt;
	}

	public void setOrdercnt(int ordercnt) {
		this.ordercnt = ordercnt;
	}

	public String getImgpath() {
		return imgpath;
	}

	public void setImgpath(String imgpath) {
		this.imgpath = imgpath;
	}

	@Override
	public String toString() {
		return "OrderdetailVO [orderid=" + orderid + ", prodid=" + prodid + ", prodnm=" + prodnm + ", prodprice="
				+ prodprice + ", ordercnt=" + ordercnt + ", imgpath=" + imgpath + "]";
	}

	
	
}

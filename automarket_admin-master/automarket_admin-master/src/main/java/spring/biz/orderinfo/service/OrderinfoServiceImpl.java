package spring.biz.orderinfo.service;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import spring.biz.orderinfo.dao.OrderinfoDAO;
import spring.biz.orderinfo.vo.OrderdetailVO;
import spring.biz.orderinfo.vo.OrderinfoVO;

@Service("orderinfoservice")
public class OrderinfoServiceImpl implements OrderinfoService {

	@Resource(name = "orderinfomybatis")
	OrderinfoDAO dao;

	@Autowired
	ApplicationContext context;

	public OrderinfoServiceImpl() {
	}

	public OrderinfoServiceImpl(OrderinfoDAO dao) {
		super();
		this.dao = dao;
	}

	public OrderinfoDAO getDao() {
		return dao;
	}

	public void setDao(OrderinfoDAO dao) {
		this.dao = dao;
	}

	public int addOrder(OrderinfoVO order) {
		return dao.addOrder(order);
	}
	

	public int adddetailOrder(OrderdetailVO order) {
		return dao.adddetailOrder(order);
	}
	
	public List<OrderdetailVO> detailOrder(String orderid) {
		return dao.detailOrder(orderid);
	}

//	public  OrderinfoVO orderinfo(String receiptkey) {
//		return dao.orderinfo(receiptkey);
//	}
	
	public List<OrderinfoVO> orderinfolist(String userid) {
		return dao.orderinfolist(userid);
	}

	public OrderinfoVO orderinforkey(String receiptkey) {
		return dao.orderinforkey(receiptkey);
	}

	public OrderinfoVO orderinfoid(String orderid) {
		return dao.orderinfoid(orderid);
	}

	
	
}

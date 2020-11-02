/**
 * 
 */
package com.cg.ovs.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ovs.bean.Item;
import com.cg.ovs.bean.OrderDetails;
import com.cg.ovs.service.ItemService;
import com.cg.ovs.service.OrderService;

/**
 * @author sohel
 *
 */
@RestController
public class OrderModuleController {
	@Autowired
	private OrderService orderService;
	@Autowired
	ItemService itemService;
	@GetMapping(path = "/cart/cartid/{cartId}")
	public List<Item> getCartByCartId(@PathVariable int cartId) {
		return itemService.getCartById(cartId);
	}

	@PostMapping(path = "/cart/additemtocart/customerId/{customerId}/cartid/{cartId}/vegetableid/{vegetableId}/quantity/{quantity}")
	public Item addCart(@PathVariable int customerId,@PathVariable int cartId,@PathVariable int vegetableId, @PathVariable int quantity) {
		return itemService.addItem(customerId,cartId,vegetableId,quantity);
	}

	/*
	 * @PutMapping(path =
	 * "cart/updatequantity/cartid/{cartId}/vegetableid/{vegetableId}/quantity/{quantity}")
	 * public Item updateCart(@PathVariable int cartId,@PathVariable int
	 * vegetableId, @PathVariable int quantity) { return
	 * itemService.updateItem(cartId,vegetableId,quantity); }
	 */
	@DeleteMapping(path = "/cart/deleteCart/cartid/{cartId}")
	public boolean deleteCart(@PathVariable int cartId) {
		return itemService.deleteCartByCartId(cartId);
	}
	@PostMapping(path = "/order/addorder")
	public OrderDetails addOrder(@RequestBody OrderDetails order) {
		return orderService.addOrder(order);
	}

	@GetMapping(path = "/order/getorder/orderid/{orderId}")
	public OrderDetails getOrderByOrderId(@PathVariable int orderId) {
		return orderService.getOrderByOrderId(orderId);
	}

	@PutMapping(path = "/order/updateorder")
	public OrderDetails updateOrder(@RequestBody OrderDetails order) {
		return orderService.addOrder(order);
	}
}
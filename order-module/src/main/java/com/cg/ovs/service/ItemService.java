/**
 * 
 */
package com.cg.ovs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.ovs.bean.Item;

/**
 * @author sohel
 *
 */
@Service
public interface ItemService {

	public List<Item> getCartById(int cartId);

	public Item addItem(int customerId,int cartId, int vegetableId, int quantity);

	//public Item updateItem(int cartId, int vegetableId, int quantity);
	
	public boolean deleteCartByCartId(int cartId);

}

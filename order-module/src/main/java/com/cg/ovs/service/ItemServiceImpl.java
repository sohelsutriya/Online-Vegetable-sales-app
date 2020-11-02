/**
 * 
 */
package com.cg.ovs.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ovs.bean.Item;
import com.cg.ovs.repository.ItemRepository;

/**
 * @author sohel
 *
 */
@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	ItemRepository repos;
	@Override
	public List<Item> getCartById(int cartId) {
		return repos.findAll().stream().filter(x -> (cartId==x.getCartId())).collect(Collectors.toList());
	}

	@Override
	public Item addItem(int customerId,int cartId, int vegetableId, int quantity) {
		List<Item> cart = getCartById(cartId);
		for(Item item:cart) {
			if(item.getVegetableId()==vegetableId) {
				item.setQuantity(item.getQuantity()+quantity);
				repos.deleteById(item.getItemId());
				repos.save(item);
				return item;
			}
		}
		return repos.save(new Item(0, vegetableId, cartId, quantity, customerId));
	}

	@Override
	public boolean deleteCartByCartId(int cartId) {
		List<Item> cart = getCartById(cartId);
		if(cart==null)
		return false;
		else {
			for(Item item:cart) {
				repos.deleteById(item.getItemId());
			}
			return true;
		}
	}

	/*
	 * @Override public Item updateItem(int cartId, int vegetableId, int quantity) {
	 * List<Item> cart = getCartById(cartId); for(Item item:cart) {
	 * if(item.getVegetableId()==vegetableId) {
	 * item.setQuantity(item.getQuantity()+quantity);
	 * repos.deleteById(item.getItemId()); repos.save(item); return item; } }
	 * 
	 * }
	 */
	

}

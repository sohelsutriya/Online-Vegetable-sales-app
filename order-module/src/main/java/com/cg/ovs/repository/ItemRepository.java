/**
 * 
 */
package com.cg.ovs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ovs.bean.Item;

/**
 * @author sohel
 *
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{

}

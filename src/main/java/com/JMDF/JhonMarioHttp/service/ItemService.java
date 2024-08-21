package com.JMDF.JhonMarioHttp.service;


import com.JMDF.JhonMarioHttp.model.GroceryItem;
import com.JMDF.JhonMarioHttp.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<GroceryItem> getAll() {
        return (List<GroceryItem>) itemRepository.findAll();
    }

    public GroceryItem insert(GroceryItem groceryItem) {
        return itemRepository.save(groceryItem);
    }

    public GroceryItem update(GroceryItem groceryItem) {
        if (itemRepository.existsById(groceryItem.getId())) {
            return itemRepository.save(groceryItem);
        } else {
            return null;  // o manejar el caso de no encontrar el item
        }
    }

    public String delete(String id) {
        if (itemRepository.existsById(id)) {
            itemRepository.deleteById(id);
            return "Item eliminado";
        } else {
            return "Item no encontrado";
        }
    }

    public GroceryItem updateData(String id, GroceryItem groceryItem) {
        return itemRepository.findById(id).map(item -> {
            if (groceryItem.getName() != null) item.setName(groceryItem.getName());
            if (groceryItem.getQuantity() != 0) item.setQuantity(groceryItem.getQuantity());
            if (groceryItem.getCategory() != null) item.setCategory(groceryItem.getCategory());
            return itemRepository.save(item);
        }).orElse(null); // manejar el caso de no encontrar el item
    }


}
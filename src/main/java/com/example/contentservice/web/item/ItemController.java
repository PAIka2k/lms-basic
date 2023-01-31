package com.example.contentservice.web.item;

import com.example.contentservice.domain.item.Item;
import com.example.contentservice.domain.item.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;

    @GetMapping
    public String items(Model model) {
        List<Item> items = itemRepository.findAll();
        model.addAttribute("items", items);
        return "/items/items";
    }

    @GetMapping("/{itemId}")
    public String item(@PathVariable long itemId, Model model) {
        Item item = itemRepository.findById(itemId);
        model.addAttribute("item", item);
        return "/items/item";
    }

    @GetMapping("/add")
    public String addForm() {
        return "/items/addForm";
    }


    @PostMapping("/add") // 위와 같은 Url이지만, 다른 http method로 기능 구분
    public String addItemV5(@ModelAttribute Item item, RedirectAttributes redirectAttributes) { // @ModelAttribute도 생략 가능

        Item savedItem = itemRepository.save(item);// class 명 첫 글자를 소문자를 바꾼 값이 model Attribute에 담김
//        model.addAttribute("item", item); // 자동으로 추가되므로 생략이 가능함
        redirectAttributes.addAttribute("itemId", savedItem.getId());
        redirectAttributes.addAttribute("status", true);

        return "redirect:/items/{itemId}";
    }

    @GetMapping("/{itemId}/edit")
    public String editForm(@PathVariable Long itemId, Model model) {
        Item item = itemRepository.findById(itemId);
        model.addAttribute("item", item);
        return "/items/editForm";
    }

    @PostMapping("/{itemId}/edit")
    public String edit(@PathVariable Long itemId, @ModelAttribute Item item) {
        itemRepository.update(itemId, item);
        return "redirect:/items/{itemId}";
    }
}

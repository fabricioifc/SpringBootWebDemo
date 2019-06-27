/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.postgresdemo.services;

import com.example.postgresdemo.model.Post;
import com.example.postgresdemo.repository.PostRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service //Define a classe como um bean do Spring
public class PostService {

    @Autowired
    private PostRepository repository; //Injeta o repositório

    //Retorna uma lista com todos posts inseridos
    public List<Post> findAll() {
        return repository.findAll();
    }

    //Retorno um post a partir do ID
    public Post findOne(Long id) {
        return repository.getOne(id);
    }

    //Salva ou atualiza um post
    public Post save(Post post) {
        return repository.saveAndFlush(post);
    }

    //Exclui um post
    public void delete(Long id) {
        repository.deleteById(id);
    }

}

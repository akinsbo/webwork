/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laveolu.webwork;

import com.laveolu.webwork.model.Video;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Olaolu Akinsete
 */
// This will be AUTO IMPLEMENTED by Spring into a Bean called videoRepository
public interface VideoRepository extends CrudRepository<Video, Long>{
    
    
}

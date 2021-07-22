package com.clientui.proxies;

import com.clientui.beans.CommentBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "microservice-comment-service", url = "localhost:9002")
public interface CommentServiceProxy {

    @GetMapping(value = "/comments/{id_Deal}")
    List<CommentBean> getByIdDeal(@PathVariable String id_Deal);

    @PostMapping(value = "/comments")
    CommentBean addComment(@RequestBody CommentBean comment);

}

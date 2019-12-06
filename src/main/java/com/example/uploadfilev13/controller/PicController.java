package com.example.uploadfilev13.controller;

import com.example.uploadfilev13.form.picForm;
import com.example.uploadfilev13.model.pic;
import com.example.uploadfilev13.service.PicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;

@Controller
public class PicController {
    @Autowired
    private PicService picService;
    @Autowired
    Environment env;
    @GetMapping("/newPic")
    public ModelAndView getNewPicForm(){
        return new ModelAndView("create","picForm",new picForm());
    }

    @PostMapping("/newPic")
    @ResponseBody
    public ResponseEntity<?> saveFile(@ModelAttribute picForm picForm){
        pic pic = new pic();
        pic.setName(picForm.getName());
        doUpload(pic,picForm);
        return new ResponseEntity<pic>(pic,HttpStatus.OK);
    }

    private void doUpload(pic pic,picForm picForm){
        MultipartFile multipartFile = picForm.getImage();
        String fileUpload = env.getProperty("uploadPath").toString();
        String fileName = multipartFile.getOriginalFilename();
        if(!fileName.equals("")){
            try {
                FileCopyUtils.copy(multipartFile.getBytes(), new File(fileUpload + fileName));
            }catch (Exception e){
                e.printStackTrace();
            }
            pic.setImage(fileName);
        }
        picService.save(pic);
    }
}


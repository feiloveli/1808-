package com.jk.controller;

import com.jk.pojo.GameBean;
import com.jk.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GameController {

    @Autowired
    private GameService gameService;


    //游戏开发新增
    @PostMapping("saveGame")
    @ResponseBody
    public Boolean saveGame(@RequestBody GameBean gameBean) {
        if(gameBean.getId() == null) {
            try {
                //如果有id则修改，没有则新增
                gameService.saveGame(gameBean);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    //查询游戏开发
    @PostMapping("queryGameList")
    @ResponseBody
    public List<GameBean> queryGameBean(GameBean gameBean){
        List<GameBean> queryGameBean = gameService.queryGameList(gameBean);
        return queryGameBean;
    }


}

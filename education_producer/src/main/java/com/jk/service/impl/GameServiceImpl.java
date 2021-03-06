package com.jk.service.impl;

import com.jk.mapper.GameMapper;
import com.jk.pojo.GameBean;
import com.jk.pojo.GameBeanMongod;
import com.jk.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameMapper gameMapper;

    //游戏开发新增
    @Override
    public void saveGame(GameBean gameBean) {
        gameMapper.saveGame(gameBean);

    }

    //查询游戏开发
    @Override
    public List<GameBean> queryGameList(GameBean gameBean) {
        return gameMapper.queryGameList(gameBean);
    }

    @Override
    public List<GameBean> findVideo() {

        return gameMapper.findVideo();
    }

    @Override
    public GameBeanMongod queryMedicine(String id) {
        return gameMapper.queryMedicine(id);
    }


}

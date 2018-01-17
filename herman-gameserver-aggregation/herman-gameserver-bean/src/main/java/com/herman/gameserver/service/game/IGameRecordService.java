package com.herman.gameserver.service.game;

import com.herman.gameserver.entity.game.GameRecord;

/**
 * Created by herman on 2018/1/1.
 */
public interface IGameRecordService {

    /**
     * 查询游戏记录
     * @param gameId
     * @param dgAccount
     * @return
     */
    public GameRecord getGameRecord(Long gameId, String dgAccount);

}

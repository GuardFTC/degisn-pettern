package com.ftc.designpattern.behavior.iterator;

/**
 * @author: 冯铁城 [fengtiecheng@pwrd.com]
 * @date: 2025-05-09 10:12:59
 * @describe: 歌曲集合
 */
public interface SongCollection {

    /**
     * 获取歌曲迭代器
     *
     * @return 歌曲迭代器
     */
    SongIterator getSongIterator();
}

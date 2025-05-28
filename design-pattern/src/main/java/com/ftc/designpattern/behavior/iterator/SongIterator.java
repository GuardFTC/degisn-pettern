package com.ftc.designpattern.behavior.iterator;

/**
 * @author: 冯铁城 [fengtiecheng@pwrd.com]
 * @date: 2025-05-09 10:11:27
 * @describe: 歌曲迭代器
 */
public interface SongIterator {

    /**
     * 判断是否存在下一个歌曲
     *
     * @return 是否存在下一个歌曲
     */
    boolean hasNext();

    /**
     * 获取下一个歌曲
     *
     * @return 下一个歌曲
     */
    Song next();
}

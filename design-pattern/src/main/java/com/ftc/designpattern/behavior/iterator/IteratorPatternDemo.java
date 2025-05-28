package com.ftc.designpattern.behavior.iterator;

import cn.hutool.core.collection.CollUtil;

import java.util.List;

/**
 * @author: 冯铁城 [fengtiecheng@pwrd.com]
 * @date: 2025-05-27 20:30:01
 * @describe: 迭代器模式测试类
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {

        //1.创建歌曲
        Song song1 = new Song("东风破");
        Song song2 = new Song("夜曲");
        Song song3 = new Song("蒲公英的约定");

        //2.创建歌曲集合
        List<Song> songs = CollUtil.newArrayList(song1, song2, song3);

        //3.创建顺序歌单
        AscSongCollection ascSongCollection = new AscSongCollection(songs);

        //4.创建迭代器
        SongIterator ascSongIterator = ascSongCollection.getSongIterator();

        //5.进行迭代
        System.out.println("顺序播放歌单:-----------------------------------------------");
        while (ascSongIterator.hasNext()) {
            Song song = ascSongIterator.next();
            song.play();
        }

        //6.创建倒序歌单
        DescSongCollection descSongCollection = new DescSongCollection(songs);

        //7.创建迭代器
        SongIterator descSongIterator = descSongCollection.getSongIterator();

        //8.进行迭代
        System.out.println("倒序播放歌单:-----------------------------------------------");
        while (descSongIterator.hasNext()) {
            Song song = descSongIterator.next();
            song.play();
        }
    }
}

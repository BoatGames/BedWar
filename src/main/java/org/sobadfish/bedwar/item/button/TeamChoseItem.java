package org.sobadfish.bedwar.item.button;

import cn.nukkit.Player;
import cn.nukkit.item.Item;
import cn.nukkit.nbt.tag.CompoundTag;
import cn.nukkit.utils.TextFormat;

import java.util.ArrayList;

/**
 * @author SoBadFish
 * 2022/1/3
 */
public class TeamChoseItem {

    public static ArrayList<Player> clickAgain = new ArrayList<>();

    public static int getIndex(){
        return 4;
    }

    public static Item get(){
        Item item = Item.get(450);
        item.setCustomName(TextFormat.colorize('&',"&r&7[使用]&l&e选择队伍"));
        CompoundTag tag = item.getNamedTag();
        tag.putBoolean("choseTeam",true);
        item.setNamedTag(tag);
        return item;
    }
}

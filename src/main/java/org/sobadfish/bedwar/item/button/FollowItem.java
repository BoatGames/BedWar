package org.sobadfish.bedwar.item.button;

import cn.nukkit.Player;
import cn.nukkit.item.Item;
import cn.nukkit.item.enchantment.Enchantment;
import cn.nukkit.nbt.tag.CompoundTag;
import cn.nukkit.utils.TextFormat;

import java.util.ArrayList;

/**
 * 跟随玩家
 *
 * @author SoBadFish
 * 2022/8/10
 */
public class FollowItem {



    public static int getIndex(){
        return 0;
    }

    public static Item get(){
        Item item = Item.get(345);
        item.addEnchantment(Enchantment.get(9));
        CompoundTag tag = item.getNamedTag();
        tag.putBoolean("follow",true);
        item.setNamedTag(tag);
        item.setCustomName(TextFormat.colorize('&',"&r&l&b传送玩家 &r&7[再次手持]"));
        return item;

    }
}

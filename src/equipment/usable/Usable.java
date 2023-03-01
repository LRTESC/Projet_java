package equipment.usable;

import character.Player;
import equipment.Item;

public abstract class Usable extends Item{
        @Override
        public void equip(Player player) {
                player.setUsable(this);
        }

        }

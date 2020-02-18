package net.runelite.client.plugins.cerberus;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.NPC;

@Slf4j
class Cerberus
{
    enum Attack
    {
        DEFAULT,
        TRIPLE,
        GHOSTS,
        LAVA
    }

    @Getter
    @Setter
    private NPC npc;

    @Getter
    @Setter
    private Attack nextAttack;

    @Getter
    @Setter
    private Attack currentAttack;

    @Getter
    @Setter
    private int attackCount;

    Cerberus(NPC npc)
    {
        this.npc = npc;
        this.attackCount = 0;
    }
}

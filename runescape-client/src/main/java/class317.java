import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
public class class317 {
	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2047832354"
	)
	static final void method6527(int var0, int var1) {
		if (Client.hintArrowType == 2) { // L: 4903
			class374.worldToScreen((Client.field653 - WorldMapData_0.baseX * 64 << 7) + Client.field765 * 4096, Client.field704 * 64 + (Client.field511 - GameObject.baseY * 64 << 7), Client.field546 * 4); // L: 4904
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 4905
				KitDefinition.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}

		}
	} // L: 4906
}

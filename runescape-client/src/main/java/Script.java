import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lbw;"
	)
	@Export("pcmPlayerProvider")
	public static class50 pcmPlayerProvider;
	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	static Widget field975;
	@ObfuscatedName("al")
	String field965;
	@ObfuscatedName("ac")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("ab")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("an")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -643585665
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1479313491
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 208680291
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 492927757
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Lrz;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128); // L: 12
	}

	Script() {
	} // L: 23

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)[Lrz;",
		garbageValue = "-2130489863"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1]; // L: 123
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "([Lmy;IIIZI)V",
		garbageValue = "-1823735571"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 10557
			Widget var6 = var0[var5]; // L: 10558
			if (var6 != null && var6.parentId == var1) { // L: 10559 10560
				PcmPlayer.alignWidgetSize(var6, var2, var3, var4); // L: 10561
				Tiles.alignWidgetPosition(var6, var2, var3); // L: 10562
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 10563
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 10564
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) { // L: 10565
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) { // L: 10566
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 10567
					class278.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 10569
}

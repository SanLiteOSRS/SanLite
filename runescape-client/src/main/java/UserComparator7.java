import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("qj")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = 2052906641
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("nh")
	@ObfuscatedGetter(
		intValue = -455733963
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lly;Lly;B)I",
		garbageValue = "8"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1200768882"
	)
	public static void method2539() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
	}
}

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rk")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	static final DefaultsGroup field4691;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1512204877
	)
	@Export("group")
	final int group;

	static {
		field4691 = new DefaultsGroup(3); // L: 4
	}

	DefaultsGroup(int var1) {
		this.group = var1; // L: 8
	} // L: 9

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "2"
	)
	public static int method8138(int var0) {
		return 255 - (var0 & 255); // L: 118
	}
}

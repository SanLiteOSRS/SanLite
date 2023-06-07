import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qd")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	static final DefaultsGroup field4651;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -11882949
	)
	@Export("group")
	final int group;

	static {
		field4651 = new DefaultsGroup(3); // L: 4
	}

	DefaultsGroup(int var1) {
		this.group = var1; // L: 8
	} // L: 9
}

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lla;"
	)
	static final DefaultsGroup field3828;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -116036803
	)
	@Export("group")
	final int group;

	static {
		field3828 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}
}

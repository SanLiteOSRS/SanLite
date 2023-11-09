import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	static final PrivateChatMode field4825;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	public static final PrivateChatMode field4823;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	static final PrivateChatMode field4826;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -582494507
	)
	public final int field4824;

	static {
		field4825 = new PrivateChatMode(0); // L: 5
		field4823 = new PrivateChatMode(1); // L: 6
		field4826 = new PrivateChatMode(2);
	} // L: 7

	PrivateChatMode(int var1) {
		this.field4824 = var1; // L: 11
	} // L: 12
}

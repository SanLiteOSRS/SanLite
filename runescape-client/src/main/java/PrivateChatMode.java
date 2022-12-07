import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	static final PrivateChatMode field5052;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	public static final PrivateChatMode field5047;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	static final PrivateChatMode field5048;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1749548549
	)
	public final int field5050;

	static {
		field5052 = new PrivateChatMode(0); // L: 5
		field5047 = new PrivateChatMode(1); // L: 6
		field5048 = new PrivateChatMode(2);
	} // L: 7

	PrivateChatMode(int var1) {
		this.field5050 = var1; // L: 11
	} // L: 12
}

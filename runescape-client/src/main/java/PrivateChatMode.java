import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ra")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	static final PrivateChatMode field5074;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	public static final PrivateChatMode field5072;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	static final PrivateChatMode field5073;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1898684141
	)
	public final int field5071;

	static {
		field5074 = new PrivateChatMode(0); // L: 5
		field5072 = new PrivateChatMode(1); // L: 6
		field5073 = new PrivateChatMode(2);
	} // L: 7

	PrivateChatMode(int var1) {
		this.field5071 = var1; // L: 15
	} // L: 16
}

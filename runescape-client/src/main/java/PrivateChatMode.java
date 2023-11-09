import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uv")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	static final PrivateChatMode field5205;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	public static final PrivateChatMode field5204;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	static final PrivateChatMode field5207;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -616894957
	)
	public final int field5203;

	static {
		field5205 = new PrivateChatMode(0); // L: 5
		field5204 = new PrivateChatMode(1); // L: 6
		field5207 = new PrivateChatMode(2);
	} // L: 7

	PrivateChatMode(int var1) {
		this.field5203 = var1; // L: 11
	} // L: 12
}

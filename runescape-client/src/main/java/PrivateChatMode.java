import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tz")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	static final PrivateChatMode field5155;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	public static final PrivateChatMode field5154;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	static final PrivateChatMode field5153;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2111673399
	)
	public final int field5156;

	static {
		field5155 = new PrivateChatMode(0); // L: 5
		field5154 = new PrivateChatMode(1); // L: 6
		field5153 = new PrivateChatMode(2);
	} // L: 7

	PrivateChatMode(int var1) {
		this.field5156 = var1; // L: 15
	} // L: 16
}

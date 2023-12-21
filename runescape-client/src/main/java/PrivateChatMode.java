import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("un")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	static final PrivateChatMode field5278;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	public static final PrivateChatMode field5280;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	static final PrivateChatMode field5277;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1957988793
	)
	public final int field5279;

	static {
		field5278 = new PrivateChatMode(0); // L: 5
		field5280 = new PrivateChatMode(1); // L: 6
		field5277 = new PrivateChatMode(2);
	} // L: 7

	PrivateChatMode(int var1) {
		this.field5279 = var1; // L: 15
	} // L: 16
}

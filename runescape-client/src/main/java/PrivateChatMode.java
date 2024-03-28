import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vc")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	static final PrivateChatMode field5371;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	public static final PrivateChatMode field5372;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	static final PrivateChatMode field5373;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2090138805
	)
	public final int field5374;

	static {
		field5371 = new PrivateChatMode(0); // L: 5
		field5372 = new PrivateChatMode(1); // L: 6
		field5373 = new PrivateChatMode(2);
	} // L: 7

	PrivateChatMode(int var1) {
		this.field5374 = var1; // L: 15
	} // L: 16
}

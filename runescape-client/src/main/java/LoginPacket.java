import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
@Implements("LoginPacket")
public class LoginPacket implements class307 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final LoginPacket field3387;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	static final LoginPacket field3385;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final LoginPacket field3386;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final LoginPacket field3391;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final LoginPacket field3388;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	static final LoginPacket field3389;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lmi;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 800355475
	)
	@Export("id")
	public final int id;

	static {
		field3387 = new LoginPacket(14, 0); // L: 5
		field3385 = new LoginPacket(15, 4); // L: 6
		field3386 = new LoginPacket(16, -2); // L: 7
		field3391 = new LoginPacket(18, -2); // L: 8
		field3388 = new LoginPacket(19, -2); // L: 9
		field3389 = new LoginPacket(27, 0); // L: 10
		LoginPacket_indexedValues = new LoginPacket[32]; // L: 12
		LoginPacket[] var0 = FloorOverlayDefinition.method4147(); // L: 15

		for (int var1 = 0; var1 < var0.length; ++var1) { // L: 16
			LoginPacket_indexedValues[var0[var1].id] = var0[var1]; // L: 17
		}

	} // L: 19

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1; // L: 26
	} // L: 27
}

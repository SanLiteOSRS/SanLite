import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
@Implements("LoginPacket")
public class LoginPacket implements class271 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final LoginPacket field3247;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	static final LoginPacket field3245;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final LoginPacket field3251;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final LoginPacket field3246;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	public static final LoginPacket field3248;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	static final LoginPacket field3249;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "[Lja;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -781023195
	)
	@Export("id")
	public final int id;

	static {
		field3247 = new LoginPacket(14, 0); // L: 5
		field3245 = new LoginPacket(15, 4); // L: 6
		field3251 = new LoginPacket(16, -2); // L: 7
		field3246 = new LoginPacket(18, -2); // L: 8
		field3248 = new LoginPacket(19, -2); // L: 9
		field3249 = new LoginPacket(27, 0); // L: 10
		LoginPacket_indexedValues = new LoginPacket[32]; // L: 12
		LoginPacket[] var0 = new LoginPacket[]{field3246, field3251, field3248, field3249, field3245, field3247}; // L: 17
		LoginPacket[] var1 = var0; // L: 19

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 20
			LoginPacket_indexedValues[var1[var2].id] = var1[var2]; // L: 21
		}

	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1; // L: 26
	} // L: 27
}

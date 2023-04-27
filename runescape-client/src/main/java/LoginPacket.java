import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("LoginPacket")
public class LoginPacket implements class285 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final LoginPacket field3344;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	static final LoginPacket field3339;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final LoginPacket field3342;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final LoginPacket field3341;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static final LoginPacket field3338;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	static final LoginPacket field3343;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Llf;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 537668749
	)
	@Export("id")
	public final int id;

	static {
		field3344 = new LoginPacket(14, 0); // L: 5
		field3339 = new LoginPacket(15, 4); // L: 6
		field3342 = new LoginPacket(16, -2); // L: 7
		field3341 = new LoginPacket(18, -2); // L: 8
		field3338 = new LoginPacket(19, -2); // L: 9
		field3343 = new LoginPacket(27, 0); // L: 10
		LoginPacket_indexedValues = new LoginPacket[32]; // L: 12
		LoginPacket[] var0 = class33.method504(); // L: 15

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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-496978963"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 73
		if (var0 < 0 || var0 >= 65536) { // L: 74
			var0 >>>= 16; // L: 75
			var1 += 16; // L: 76
		}

		if (var0 >= 256) { // L: 78
			var0 >>>= 8; // L: 79
			var1 += 8; // L: 80
		}

		if (var0 >= 16) { // L: 82
			var0 >>>= 4; // L: 83
			var1 += 4; // L: 84
		}

		if (var0 >= 4) { // L: 86
			var0 >>>= 2; // L: 87
			var1 += 2; // L: 88
		}

		if (var0 >= 1) { // L: 90
			var0 >>>= 1; // L: 91
			++var1; // L: 92
		}

		return var0 + var1; // L: 94
	}
}

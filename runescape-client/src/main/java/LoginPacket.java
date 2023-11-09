import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
@Implements("LoginPacket")
public class LoginPacket implements class278 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final LoginPacket field3317;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	static final LoginPacket field3311;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final LoginPacket field3310;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final LoginPacket field3309;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final LoginPacket field3312;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	static final LoginPacket field3316;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Ljw;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 360020071
	)
	@Export("id")
	public final int id;

	static {
		field3317 = new LoginPacket(14, 0); // L: 5
		field3311 = new LoginPacket(15, 4); // L: 6
		field3310 = new LoginPacket(16, -2); // L: 7
		field3309 = new LoginPacket(18, -2); // L: 8
		field3312 = new LoginPacket(19, -2); // L: 9
		field3316 = new LoginPacket(27, 0); // L: 10
		LoginPacket_indexedValues = new LoginPacket[32]; // L: 12
		LoginPacket[] var0 = Canvas.method325(); // L: 15

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

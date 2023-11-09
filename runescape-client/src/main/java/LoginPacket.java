import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("LoginPacket")
public class LoginPacket implements class261 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final LoginPacket field3149;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	static final LoginPacket field3145;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final LoginPacket field3146;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final LoginPacket field3150;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final LoginPacket field3153;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	static final LoginPacket field3147;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Ljk;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 925150301
	)
	@Export("id")
	public final int id;

	static {
		field3149 = new LoginPacket(14, 0); // L: 5
		field3145 = new LoginPacket(15, 4); // L: 6
		field3146 = new LoginPacket(16, -2); // L: 7
		field3150 = new LoginPacket(18, -2); // L: 8
		field3153 = new LoginPacket(19, -2); // L: 9
		field3147 = new LoginPacket(27, 0); // L: 10
		LoginPacket_indexedValues = new LoginPacket[32]; // L: 12
		LoginPacket[] var0 = new LoginPacket[]{field3147, field3149, field3150, field3145, field3153, field3146}; // L: 17
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1600768433"
	)
	public static void method5207() {
		class273.midiPcmStream.clear(); // L: 47
		class273.musicPlayerStatus = 1; // L: 48
		class149.musicTrackArchive = null; // L: 49
	} // L: 50
}

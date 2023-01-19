import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
@Implements("LoginPacket")
public class LoginPacket implements class274 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	public static final LoginPacket field3300;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	static final LoginPacket field3305;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	public static final LoginPacket field3301;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	public static final LoginPacket field3303;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	public static final LoginPacket field3304;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	static final LoginPacket field3308;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "[Ljh;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 367370965
	)
	@Export("cacheGamebuild")
	public static int cacheGamebuild;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	static StudioGame field3302;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 580881537
	)
	@Export("id")
	public final int id;

	static {
		field3300 = new LoginPacket(14, 0); // L: 5
		field3305 = new LoginPacket(15, 4); // L: 6
		field3301 = new LoginPacket(16, -2); // L: 7
		field3303 = new LoginPacket(18, -2); // L: 8
		field3304 = new LoginPacket(19, -2); // L: 9
		field3308 = new LoginPacket(27, 0); // L: 10
		LoginPacket_indexedValues = new LoginPacket[32]; // L: 12
		LoginPacket[] var0 = GrandExchangeOfferOwnWorldComparator.method1224(); // L: 15

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

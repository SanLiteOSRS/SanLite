import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
@Implements("LoginPacket")
public class LoginPacket implements class190 {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	public static final LoginPacket field2360;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	static final LoginPacket field2350;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	public static final LoginPacket field2351;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	public static final LoginPacket field2352;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	public static final LoginPacket field2353;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	static final LoginPacket field2354;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "[Lgc;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		signature = "Llp;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -176591909
	)
	@Export("id")
	public final int id;

	static {
		field2360 = new LoginPacket(14, 0);
		field2350 = new LoginPacket(15, 4);
		field2351 = new LoginPacket(16, -2);
		field2352 = new LoginPacket(18, -2);
		field2353 = new LoginPacket(19, -2);
		field2354 = new LoginPacket(27, 0);
		LoginPacket_indexedValues = new LoginPacket[32];
		LoginPacket[] var0 = new LoginPacket[]{field2353, field2352, field2360, field2354, field2351, field2350};
		LoginPacket[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			LoginPacket_indexedValues[var1[var2].id] = var1[var2];
		}

	}

	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1;
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "1633158926"
	)
	static boolean method3707() {
		return (Client.drawPlayerNames & 4) != 0;
	}
}

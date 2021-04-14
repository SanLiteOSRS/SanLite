import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
@Implements("LoginPacket")
public class LoginPacket implements class201 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	public static final LoginPacket field2456;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	static final LoginPacket field2454;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	public static final LoginPacket field2451;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	public static final LoginPacket field2452;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	public static final LoginPacket field2450;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	static final LoginPacket field2449;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "[Lgc;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 819348427
	)
	@Export("id")
	public final int id;

	static {
		field2456 = new LoginPacket(14, 0);
		field2454 = new LoginPacket(15, 4);
		field2451 = new LoginPacket(16, -2);
		field2452 = new LoginPacket(18, -2);
		field2450 = new LoginPacket(19, -2);
		field2449 = new LoginPacket(27, 0);
		LoginPacket_indexedValues = new LoginPacket[32];
		LoginPacket[] var0 = PacketWriter.method2386();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			LoginPacket_indexedValues[var0[var1].id] = var0[var1];
		}

	}

	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II)Lka;",
		garbageValue = "1973214574"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructDefinition StructDefinition_getStructDefinition(int var0) {
		StructDefinition var1 = (StructDefinition)StructDefinition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructDefinition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructDefinition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}

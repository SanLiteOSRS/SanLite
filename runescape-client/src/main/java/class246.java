import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
public enum class246 implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Liy;"
	)
	field3215(-1),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Liy;"
	)
	field3214(0),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Liy;"
	)
	field3216(1),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Liy;"
	)
	field3217(2);

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive18")
	static Archive archive18;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1212234029
	)
	final int field3218;

	class246(int var3) {
		this.field3218 = var3;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3218;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(ZB)V",
		garbageValue = "-34"
	)
	public static void method4409(boolean var0) {
		if (class303.NetCache_socket != null) {
			try {
				Buffer var1 = new Buffer(4);
				var1.writeByte(var0 ? 2 : 3);
				var1.writeMedium(0);
				class303.NetCache_socket.write(var1.array, 0, 4);
			} catch (IOException var4) {
				try {
					class303.NetCache_socket.close();
				} catch (Exception var3) {
				}

				++NetCache.NetCache_ioExceptions;
				class303.NetCache_socket = null;
			}

		}
	}
}

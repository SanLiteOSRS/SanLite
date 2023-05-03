import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
public abstract class class177 {
	@ObfuscatedName("ac")
	String field1889;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	final class166 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgy;Ljava/lang/String;)V"
	)
	class177(class166 var1, String var2) {
		this.this$0 = var1; // L: 371
		this.field1889 = var2; // L: 372
	} // L: 373

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-41"
	)
	public abstract int vmethod3607();

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "88"
	)
	public String vmethod3616() {
		return null; // L: 382
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "421671702"
	)
	public int vmethod3608() {
		return -1; // L: 386
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "89"
	)
	public String method3606() {
		return this.field1889; // L: 376
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1787184956"
	)
	public static void method3617(boolean var0) {
		if (NetCache.NetCache_socket != null) { // L: 204
			try {
				Buffer var1 = new Buffer(4); // L: 206
				var1.writeByte(var0 ? 2 : 3); // L: 207
				var1.writeMedium(0); // L: 208
				NetCache.NetCache_socket.write(var1.array, 0, 4); // L: 209
			} catch (IOException var4) {
				try {
					NetCache.NetCache_socket.close(); // L: 213
				} catch (Exception var3) { // L: 215
				}

				++NetCache.NetCache_ioExceptions; // L: 216
				NetCache.NetCache_socket = null; // L: 217
			}

		}
	} // L: 219
}

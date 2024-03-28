import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("ax")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = 1515401243
	)
	static int field60;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lai;)V"
	)
	class13(class12 var1) {
		this.this$1 = var1; // L: 285
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions(); // L: 288
		if (var1 == null) { // L: 289
			var1 = new Hashtable(); // L: 290
		}

		byte[] var2 = this.this$1.val$host.getBytes(); // L: 292
		ByteArrayOutputStream var3 = new ByteArrayOutputStream(); // L: 293
		DataOutputStream var4 = new DataOutputStream(var3); // L: 294
		var4.writeShort(var2.length + 3); // L: 295
		var4.writeByte(0); // L: 296
		var4.writeShort(var2.length); // L: 297
		var4.write(var2); // L: 298
		var4.close(); // L: 299
		var1.put(0, var3.toByteArray()); // L: 300
		return var1; // L: 301
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this); // L: 306
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "258076310"
	)
	static void method170(int var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = Client.groundItems[var0][var1][var2]; // L: 8395
		if (var6 != null) { // L: 8396
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) { // L: 8397 8398 8403
				if ((var3 & 32767) == var7.id && var4 == var7.quantity) { // L: 8399
					var7.quantity = var5; // L: 8400
					break;
				}
			}

			class477.method8529(var0, var1, var2); // L: 8405
		}

	} // L: 8407
}

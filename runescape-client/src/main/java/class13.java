import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("an")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Luk;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lal;)V"
	)
	class13(class12 var1) {
		this.this$1 = var1; // L: 292
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this);
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions(); // L: 295
		if (var1 == null) { // L: 296
			var1 = new Hashtable(); // L: 297
		}

		byte[] var2 = this.this$1.val$host.getBytes(); // L: 299
		ByteArrayOutputStream var3 = new ByteArrayOutputStream(); // L: 300
		DataOutputStream var4 = new DataOutputStream(var3); // L: 301
		var4.writeShort(var2.length + 3); // L: 302
		var4.writeByte(0); // L: 303
		var4.writeShort(var2.length); // L: 304
		var4.write(var2); // L: 305
		var4.close();
		var1.put(0, var3.toByteArray()); // L: 307
		return var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltm;II)V",
		garbageValue = "1477731180"
	)
	public static void method160(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) { // L: 306
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 308
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 309
			} catch (Exception var3) { // L: 311
			}
		}

	} // L: 313
}

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("ax")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	static ClanChannel field54;
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "[Luc;"
	)
	static SpritePixels[] field52;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lad;)V"
	)
	class13(class12 var1) {
		this.this$1 = var1; // L: 292
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this); // L: 313
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
		var4.close(); // L: 306
		var1.put(0, var3.toByteArray()); // L: 307
		return var1; // L: 308
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;Low;I)V",
		garbageValue = "1347219538"
	)
	public static void method171(AbstractArchive var0, AbstractArchive var1) {
		NPCComposition.NpcDefinition_archive = var0; // L: 67
		NPCComposition.field1947 = var1; // L: 68
	} // L: 69

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1839649993"
	)
	static final void method176() {
		Client.field704 = Client.cycleCntr; // L: 12467
	} // L: 12468
}

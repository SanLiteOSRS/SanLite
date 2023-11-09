import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("m")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	static Archive field70;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lb;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lb;)V"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[Llo;",
		garbageValue = "1319883394"
	)
	public static class330[] method179() {
		return new class330[]{class330.field4164, class330.field4167, class330.field4162, class330.field4163}; // L: 15
	}
}

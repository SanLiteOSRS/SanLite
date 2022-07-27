import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("g")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("friendsChatManager")
	static FriendsChatManager friendsChatManager;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lx;)V"
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lfs;",
		garbageValue = "1615716454"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0); // L: 37
		if (var1 != null) { // L: 38
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0); // L: 39
			var1 = new SpotAnimationDefinition(); // L: 40
			var1.id = var0; // L: 41
			if (var2 != null) { // L: 42
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 43
			return var1; // L: 44
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2040602993"
	)
	public static int method174(int var0) {
		return var0 >>> 4 & class439.field4694; // L: 22
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-301016750"
	)
	static void method173() {
		if (class28.localPlayer.x >> 7 == Client.destinationX && class28.localPlayer.y >> 7 == Client.destinationY) { // L: 5008
			Client.destinationX = 0; // L: 5009
		}

	} // L: 5011
}

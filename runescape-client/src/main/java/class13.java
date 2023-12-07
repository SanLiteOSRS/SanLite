import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("as")
class class13 extends DefaultTlsClient {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lax;)V"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnv;",
		garbageValue = "173861677"
	)
	public static GameBuild[] method173() {
		return new GameBuild[]{GameBuild.BUILDLIVE, GameBuild.LIVE, GameBuild.RC, GameBuild.WIP}; // L: 13
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
	)
	static final void method177() {
		Client.packetWriter.close(); // L: 2866
		ObjectSound.method1980(); // L: 2867
		class36.scene.clear(); // L: 2868

		for (int var0 = 0; var0 < 4; ++var0) { // L: 2869
			Client.collisionMaps[var0].clear();
		}

		Client.field725.method4281(); // L: 2870
		System.gc(); // L: 2871
		WorldMapManager.method4769(0, 0); // L: 2872
		class472.method8564(); // L: 2873
		Client.playingJingle = false; // L: 2874
		WorldMapSectionType.method4888(); // L: 2875
		WorldMapSection2.method4516(10); // L: 2876
	} // L: 2877
}

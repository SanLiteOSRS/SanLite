import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("at")
class class11 implements TlsAuthentication {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	static IndexedSprite field63;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = 2026827067
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("gb")
	static String field65;
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lax;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1; // L: 306
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509"); // L: 310
			LinkedList var3 = new LinkedList(); // L: 311
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList(); // L: 313

			for (int var5 = 0; var5 < var4.length; ++var5) { // L: 314
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5]; // L: 315
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded()))); // L: 317
			}

			this.this$2.this$1.field67 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0])); // L: 321
		} catch (CertificateException var7) { // L: 323
			throw new IOException(var7); // L: 324
		}
	} // L: 326

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null; // L: 330
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1328974540"
	)
	static final void method105() {
		if (!ViewportMouse.ViewportMouse_false0) { // L: 78
			int var0 = Scene.Scene_cameraPitchSine; // L: 79
			int var1 = Scene.Scene_cameraPitchCosine; // L: 80
			int var2 = Scene.Scene_cameraYawSine; // L: 81
			int var3 = Scene.Scene_cameraYawCosine; // L: 82
			byte var4 = 50; // L: 83
			short var5 = 3500; // L: 84
			int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method4408()) * var4 / Rasterizer3D.method4414(); // L: 85
			int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method4409()) * var4 / Rasterizer3D.method4414(); // L: 86
			int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method4408()) * var5 / Rasterizer3D.method4414(); // L: 87
			int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method4409()) * var5 / Rasterizer3D.method4414(); // L: 88
			int var11 = var7 * var1 + var0 * var4 >> 16; // L: 92
			int var12 = var4 * var1 - var7 * var0 >> 16; // L: 97
			int var13 = var1 * var9 + var5 * var0 >> 16; // L: 103
			int var14 = var5 * var1 - var9 * var0 >> 16; // L: 108
			int var15 = var6 * var3 - var2 * var12 >> 16; // L: 114
			int var16 = var2 * var6 + var3 * var12 >> 16; // L: 119
			int var17 = var8 * var3 - var14 * var2 >> 16; // L: 125
			int var18 = var14 * var3 + var8 * var2 >> 16; // L: 130
			ViewportMouse.field2754 = (var15 + var17) / 2; // L: 134
			ViewportMouse.field2755 = (var13 + var11) / 2; // L: 135
			class151.field1693 = (var18 + var16) / 2; // L: 136
			class538.field5228 = (var17 - var15) / 2; // L: 137
			ViewportMouse.field2756 = (var13 - var11) / 2; // L: 138
			class133.field1593 = (var18 - var16) / 2; // L: 139
			class90.field1109 = Math.abs(class538.field5228); // L: 140
			class136.field1606 = Math.abs(ViewportMouse.field2756); // L: 141
			class387.field4437 = Math.abs(class133.field1593); // L: 142
		}
	} // L: 143

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Ldz;I)V",
		garbageValue = "-423842521"
	)
	static final void method112(PendingSpawn var0) {
		long var1 = 0L; // L: 8467
		int var3 = -1; // L: 8468
		int var4 = 0; // L: 8469
		int var5 = 0; // L: 8470
		if (var0.type == 0) { // L: 8471
			var1 = UserComparator5.scene.getWallObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 8472
			var1 = UserComparator5.scene.getDecorativeObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 8473
			var1 = UserComparator5.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) { // L: 8474
			var1 = UserComparator5.scene.getGroundObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var1 != 0L) { // L: 8475
			int var6 = UserComparator5.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 8476
			var3 = class458.Entity_unpackID(var1); // L: 8477
			var4 = var6 & 31; // L: 8478
			var5 = var6 >> 6 & 3; // L: 8479
		}

		var0.objectId = var3; // L: 8481
		var0.field1169 = var4; // L: 8482
		var0.field1168 = var5; // L: 8483
	} // L: 8484

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "47"
	)
	static void method113(int var0) {
		SequenceDefinition var1 = class135.SequenceDefinition_get(var0); // L: 12929
		if (var1.isCachedModelIdSet()) { // L: 12930
			if (class273.method5525(var1.SequenceDefinition_cachedModelId) == 2) { // L: 12933
				Client.field654.add(var1.SequenceDefinition_cachedModelId); // L: 12934
			}

		}
	} // L: 12931 12936
}

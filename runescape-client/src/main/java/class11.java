import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("ah")
class class11 implements TlsAuthentication {
	@ObfuscatedName("ar")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("uo")
	@ObfuscatedGetter(
		intValue = -89060736
	)
	static int field46;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Laf;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1; // L: 313
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509"); // L: 317
			LinkedList var3 = new LinkedList(); // L: 318
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList(); // L: 320

			for (int var5 = 0; var5 < var4.length; ++var5) { // L: 321
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5]; // L: 322
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded()))); // L: 324
			}

			this.this$2.this$1.field55 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0])); // L: 328
		} catch (CertificateException var7) { // L: 330
			throw new IOException(var7); // L: 331
		}
	} // L: 333

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null; // L: 337
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-133285941"
	)
	static int method106(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1863
			var3 = ArchiveLoader.field1070.method6431(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1864
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId; // L: 1865
			return 1; // L: 1866
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1868
			var3 = ArchiveLoader.field1070.method6431(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1869
			if (var3.itemId != -1) { // L: 1870
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1871
			}

			return 1; // L: 1872
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1874
			int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1875
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5); // L: 1876
			if (var4 != null) { // L: 1877
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1878
			}

			return 1; // L: 1879
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1881
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1882
			return 1; // L: 1883
		} else if (var0 == 2707) { // L: 1885
			var3 = ArchiveLoader.field1070.method6431(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1886
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method6895() ? 1 : 0; // L: 1887
			return 1; // L: 1888
		} else if (var0 == 2708) { // L: 1890
			var3 = ArchiveLoader.field1070.method6431(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1891
			return class19.method258(var3); // L: 1892
		} else if (var0 == 2709) { // L: 1894
			var3 = ArchiveLoader.field1070.method6431(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1895
			return class371.method7024(var3); // L: 1896
		} else {
			return 2; // L: 1898
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-2113853015"
	)
	static int method100(int var0, Script var1, boolean var2) {
		if (var0 == 7463) { // L: 5161
			boolean var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 5162
			class157.method3399(var3); // L: 5163
			return 1; // L: 5164
		} else {
			return 2; // L: 5166
		}
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(IIIILvd;Lmc;I)V",
		garbageValue = "-864065387"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 12677
			int var6 = Client.camAngleY & 2047; // L: 12678
			int var7 = var3 * var3 + var2 * var2; // L: 12679
			if (var7 <= 6400) { // L: 12680
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 12681
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 12682
				int var10 = var9 * var2 + var3 * var8 >> 16; // L: 12683
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12684
				if (var7 > 2500) {
					var4.method9926(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 12685
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 12686
				}

			}
		}
	} // L: 12687
}

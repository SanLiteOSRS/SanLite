import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aq")
public class class10 {
	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("aw")
	final HttpsURLConnection field49;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	final class420 field55;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	final class9 field48;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	class462 field50;
	@ObfuscatedName("as")
	boolean field51;
	@ObfuscatedName("aj")
	boolean field47;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2018066835
	)
	int field53;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lap;Lqb;Z)V"
	)
	public class10(URL var1, class9 var2, class420 var3, boolean var4) throws IOException {
		this.field51 = false; // L: 17
		this.field47 = false; // L: 18
		this.field53 = 300000; // L: 19
		if (!var2.method69()) { // L: 26
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method73()); // L: 27
		} else {
			this.field49 = (HttpsURLConnection)var1.openConnection(); // L: 29
			if (!var4) {
				HttpsURLConnection var5 = this.field49;
				if (class15.field83 == null) {
					class15.field83 = new class15();
				}

				class15 var6 = class15.field83; // L: 37
				var5.setSSLSocketFactory(var6);
			}

			this.field48 = var2; // L: 41
			this.field55 = var3 != null ? var3 : new class420(); // L: 42
		}
	} // L: 43

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lap;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this(var1, var2, new class420(), var3); // L: 22
	} // L: 23

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lqb;",
		garbageValue = "1781094058"
	)
	public class420 method85() {
		return this.field55; // L: 46
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lrq;I)V",
		garbageValue = "446743890"
	)
	public void method86(class462 var1) {
		if (!this.field51) { // L: 50
			if (var1 == null) { // L: 51
				this.field55.method7762("Content-Type"); // L: 52
				this.field50 = null; // L: 53
			} else {
				this.field50 = var1; // L: 56
				if (this.field50.vmethod8417() != null) { // L: 57
					this.field55.method7766(this.field50.vmethod8417()); // L: 58
				} else {
					this.field55.method7767(); // L: 61
				}

			}
		}
	} // L: 54 63

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "188935179"
	)
	void method102() throws ProtocolException {
		if (!this.field51) { // L: 66
			this.field49.setRequestMethod(this.field48.method73()); // L: 67
			this.field55.method7759(this.field49); // L: 68
			if (this.field48.method71() && this.field50 != null) { // L: 69
				this.field49.setDoOutput(true); // L: 70
				ByteArrayOutputStream var1 = new ByteArrayOutputStream(); // L: 71

				try {
					var1.write(this.field50.vmethod8412()); // L: 73
					var1.writeTo(this.field49.getOutputStream()); // L: 74
				} catch (IOException var11) { // L: 76
					var11.printStackTrace(); // L: 77
				} finally {
					try {
						var1.close(); // L: 81
					} catch (IOException var10) { // L: 83
						var10.printStackTrace(); // L: 84
					}

				}
			}

			this.field49.setConnectTimeout(this.field53); // L: 88
			this.field49.setInstanceFollowRedirects(this.field47); // L: 89
			this.field51 = true; // L: 90
		}
	} // L: 91

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1249212417"
	)
	boolean method88() throws IOException {
		if (!this.field51) { // L: 94
			this.method102();
		}

		this.field49.connect(); // L: 95
		return this.field49.getResponseCode() == -1; // L: 96
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lac;",
		garbageValue = "-1318308721"
	)
	class20 method89() {
		try {
			if (!this.field51 || this.field49.getResponseCode() == -1) { // L: 101
				return new class20("No REST response has been received yet.");
			}
		} catch (IOException var10) { // L: 103
			this.field49.disconnect(); // L: 104
			return new class20("Error decoding REST response code: " + var10.getMessage()); // L: 105
		}

		class20 var3;
		try {
			class20 var1 = new class20(this.field49); // L: 109
			return var1; // L: 117
		} catch (IOException var8) { // L: 111
			var3 = new class20("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field49.disconnect(); // L: 115
		}

		return var3; // L: 112
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lty;[II)[Ljava/lang/Object;",
		garbageValue = "-1294646917"
	)
	static Object[] method103(Buffer var0, int[] var1) {
		int var2 = var0.readUShortSmart(); // L: 30
		Object[] var3 = new Object[var1.length * var2]; // L: 31

		for (int var4 = 0; var4 < var2; ++var4) { // L: 32
			for (int var5 = 0; var5 < var1.length; ++var5) { // L: 33
				int var6 = var1.length * var4 + var5; // L: 34
				class503 var7 = class395.method7456(var1[var5]); // L: 35
				var3[var6] = var7.method8938(var0); // L: 36
			}
		}

		return var3; // L: 39
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-1321398026"
	)
	static int method84(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class36.scriptDotWidget : class351.field3896; // L: 1327
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1328
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1329
			return 1; // L: 1330
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1332
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1333
			return 1; // L: 1334
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1336
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1337
			return 1; // L: 1338
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1340
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1341
			return 1; // L: 1342
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1344
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1345
			return 1; // L: 1346
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1348
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1349
			return 1; // L: 1350
		} else {
			return 2; // L: 1352
		}
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1708450572"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Login.loadInterface(var0)) { // L: 11449
			ClanChannelMember.updateInterface(ArchiveLoader.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6); // L: 11450
		}
	} // L: 11451

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-517461757"
	)
	static void method100(boolean var0) {
		Client.field659 = var0; // L: 12904
	} // L: 12905
}

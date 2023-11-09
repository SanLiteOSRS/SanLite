import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eh")
public class class113 extends UrlRequester {
	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	static TextureProvider field1431;
	@ObfuscatedName("as")
	final boolean field1433;

	public class113(boolean var1, int var2) {
		super(var2); // L: 13
		this.field1433 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lei;I)V",
		garbageValue = "-1617729938"
	)
	void vmethod2826(UrlRequest var1) throws IOException {
		URLConnection var2 = null;
		boolean var9 = false;

		HttpURLConnection var12;
		label136: {
			label128: {
				try {
					label131: {
						var9 = true; // L: 21
						String var3 = var1.field1436.getProtocol(); // L: 22
						if (var3.equals("http")) {
							var2 = this.method2827(var1); // L: 23
						} else {
							if (!var3.equals("https")) { // L: 25
								var1.field1437 = UrlRequest.field1441; // L: 29
								var9 = false;
								break label131;
							}

							var2 = this.method2828(var1); // L: 26
						}

						this.method2807(var2, var1); // L: 32
						var9 = false;
						break label136;
					}
				} catch (IOException var10) { // L: 34
					var1.field1437 = UrlRequest.field1441; // L: 35
					var9 = false;
					break label128;
				} finally {
					if (var9) {
						if (var2 != null && var2 instanceof HttpURLConnection) {
							HttpURLConnection var6 = (HttpURLConnection)var2;
							var6.disconnect();
						}

					}
				}

				if (var2 != null && var2 instanceof HttpURLConnection) { // L: 39
					HttpURLConnection var4 = (HttpURLConnection)var2; // L: 40
					var4.disconnect(); // L: 41
				}

				return; // L: 30
			}

			if (var2 != null && var2 instanceof HttpURLConnection) { // L: 38
				var12 = (HttpURLConnection)var2;
				var12.disconnect();
			}

			return; // L: 45
		}

		if (var2 != null && var2 instanceof HttpURLConnection) {
			var12 = (HttpURLConnection)var2;
			var12.disconnect();
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lei;I)Ljava/net/URLConnection;",
		garbageValue = "1537364324"
	)
	URLConnection method2827(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1436.openConnection(); // L: 48
		this.method2806(var2); // L: 49
		return var2; // L: 50
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lei;I)Ljava/net/URLConnection;",
		garbageValue = "-1919857679"
	)
	URLConnection method2828(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1436.openConnection(); // L: 54
		if (!this.field1433) { // L: 55
			if (class15.field83 == null) { // L: 59
				class15.field83 = new class15(); // L: 60
			}

			class15 var4 = class15.field83; // L: 62
			var2.setSSLSocketFactory(var4); // L: 64
		}

		this.method2806(var2); // L: 66
		return var2; // L: 67
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "2076508859"
	)
	public static final synchronized long method2835() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class302.field3368) { // L: 15
			class302.field3369 += class302.field3368 - var0; // L: 16
		}

		class302.field3368 = var0; // L: 18
		return class302.field3369 + var0; // L: 19
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "35871473"
	)
	static int method2836(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 4344
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Huffman.getWindowedMode(); // L: 4345
			return 1; // L: 4346
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 4348
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4349
				if (var3 == 1 || var3 == 2) { // L: 4350
					RouteStrategy.setWindowedMode(var3);
				}

				return 1; // L: 4351
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 4353
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class150.clientPreferences.method2487(); // L: 4354
				return 1; // L: 4355
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 4357
				if (var0 == 5310) { // L: 4364
					--Interpreter.Interpreter_intStackSize; // L: 4365
					return 1; // L: 4366
				} else {
					return 2; // L: 4368
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4358
				if (var3 == 1 || var3 == 2) { // L: 4359
					class150.clientPreferences.method2572(var3); // L: 4360
				}

				return 1; // L: 4362
			}
		}
	}
}

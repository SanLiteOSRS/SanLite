import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
public class class101 extends UrlRequester {
	@ObfuscatedName("j")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("c")
	final boolean field1350;

	public class101(boolean var1, int var2) {
		super(var2); // L: 13
		this.field1350 = var1; // L: 14
	} // L: 15

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lcv;B)V",
		garbageValue = "38"
	)
	void vmethod2504(UrlRequest var1) throws IOException {
		URLConnection var2 = null; // L: 19

		try {
			String var3 = var1.url.getProtocol(); // L: 21
			if (var3.equals("http")) { // L: 22
				var2 = this.method2503(var1); // L: 23
			} else {
				if (!var3.equals("https")) {
					var1.isDone0 = true;
					return;
				}

				var2 = this.method2508(var1);
			}

			this.method2484(var2, var1); // L: 32
		} catch (IOException var7) {
		} finally {
			var1.isDone0 = true; // L: 36
			if (var2 != null) { // L: 37
				if (var2 instanceof HttpURLConnection) { // L: 38
					((HttpURLConnection)var2).disconnect(); // L: 39
				} else if (var2 instanceof HttpsURLConnection) { // L: 41
					((HttpsURLConnection)var2).disconnect(); // L: 42
				}
			}

		}

	} // L: 46

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lcv;I)Ljava/net/URLConnection;",
		garbageValue = "-1350563776"
	)
	URLConnection method2503(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.url.openConnection(); // L: 49
		this.method2483(var2); // L: 50
		return var2; // L: 51
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lcv;I)Ljava/net/URLConnection;",
		garbageValue = "448128952"
	)
	URLConnection method2508(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.url.openConnection(); // L: 55
		if (!this.field1350) { // L: 56
			var2.setSSLSocketFactory(class15.method185()); // L: 57
		}

		this.method2483(var2);
		return var2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Lpr;",
		garbageValue = "-41"
	)
	public static class438 method2516(int var0) {
		class438 var1 = (class438)class438.DBRowType_cache.get((long)var0); // L: 24
		if (var1 != null) { // L: 25
			return var1;
		} else {
			byte[] var2 = class438.field4678.takeFile(38, var0); // L: 26
			var1 = new class438(); // L: 27
			if (var2 != null) { // L: 28
				var1.method7542(new Buffer(var2));
			}

			var1.method7549(); // L: 29
			class438.DBRowType_cache.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1809132353"
	)
	public static void method2502() {
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 59
	} // L: 60

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "8"
	)
	static int method2514(int var0, Script var1, boolean var2) {
		if (var0 != 6700 && var0 != 6702 && var0 != 6704 && var0 != 6706 && var0 != 6708) { // L: 4502
			if (var0 != 6701 && var0 != 6703 && var0 != 6705 && var0 != 6707 && var0 != 6709) { // L: 4507
				if (var0 == 6750) { // L: 4511
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 4512
					return 1; // L: 4513
				} else if (var0 != 6751 && var0 != 6752 && var0 != 6753) { // L: 4515
					if (var0 == 6754) { // L: 4519
						int var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4520
						NPCComposition var4 = class119.getNpcDefinition(var3); // L: 4521
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 4522
						return 1; // L: 4523
					} else {
						return 2; // L: 4525
					}
				} else {
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4516
					return 1; // L: 4517
				}
			} else {
				--Nameable.Interpreter_intStackSize; // L: 4508
				return 1; // L: 4509
			}
		} else {
			Nameable.Interpreter_intStackSize -= 2; // L: 4503
			--UserComparator8.Interpreter_stringStackSize; // L: 4504
			return 1; // L: 4505
		}
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2027845935"
	)
	static void method2515(int var0, int var1) {
		int var2 = WorldMapSection2.fontBold12.stringWidth("Choose Option"); // L: 8361

		int var3;
		int var4;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) { // L: 8362
			var4 = WorldMapSection2.fontBold12.stringWidth(ScriptFrame.method1034(var3)); // L: 8363
			if (var4 > var2) { // L: 8364
				var2 = var4;
			}
		}

		var2 += 8; // L: 8366
		var3 = Client.menuOptionsCount * 15 + 22; // L: 8367
		var4 = var0 - var2 / 2; // L: 8368
		if (var4 + var2 > class7.canvasWidth) { // L: 8369
			var4 = class7.canvasWidth - var2;
		}

		if (var4 < 0) { // L: 8370
			var4 = 0;
		}

		int var5 = var1; // L: 8371
		if (var3 + var1 > DecorativeObject.canvasHeight) { // L: 8372
			var5 = DecorativeObject.canvasHeight - var3;
		}

		if (var5 < 0) { // L: 8373
			var5 = 0;
		}

		MilliClock.menuX = var4; // L: 8374
		class1.menuY = var5; // L: 8375
		class132.menuWidth = var2; // L: 8376
		WorldMapData_0.menuHeight = Client.menuOptionsCount * 15 + 22; // L: 8377
	} // L: 8378
}

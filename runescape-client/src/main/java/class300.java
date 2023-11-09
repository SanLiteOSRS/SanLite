import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
public class class300 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	UrlRequest field3461;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	SpritePixels field3460;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ldl;)V"
	)
	class300(String var1, UrlRequester var2) {
		try {
			this.field3461 = var2.request(new URL(var1)); // L: 16
		} catch (MalformedURLException var4) {
			this.field3461 = null; // L: 19
		}

	} // L: 21

	@ObfuscatedSignature(
		descriptor = "(Ldm;)V"
	)
	class300(UrlRequest var1) {
		this.field3461 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Lrx;",
		garbageValue = "-1221653843"
	)
	SpritePixels method5840() {
		if (this.field3460 == null && this.field3461 != null && this.field3461.isDone()) { // L: 28
			if (this.field3461.getResponse() != null) { // L: 29
				this.field3460 = Language.method6693(this.field3461.getResponse()); // L: 30
			}

			this.field3461 = null; // L: 32
		}

		return this.field3460; // L: 34
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-32"
	)
	public static int method5847(int var0) {
		return var0 >>> 12; // L: 18
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lln;II)V",
		garbageValue = "1706135077"
	)
	static void method5845(Archive var0, int var1) {
		if (var0.field4191) { // L: 204
			if (var1 <= NetCache.field4236) { // L: 205
				throw new RuntimeException(""); // L: 206
			}

			if (var1 < NetCache.field4217) { // L: 208
				NetCache.field4217 = var1; // L: 209
			}
		} else {
			if (var1 >= NetCache.field4217) { // L: 213
				throw new RuntimeException(""); // L: 214
			}

			if (var1 > NetCache.field4236) { // L: 216
				NetCache.field4236 = var1; // L: 217
			}
		}

		if (class169.field1878 != null) { // L: 220
			class169.field1878.offset = var1 * 8 + 5; // L: 222
			if (class169.field1878.offset >= class169.field1878.array.length) { // L: 223
				if (!var0.field4191) { // L: 224
					throw new RuntimeException(""); // L: 228
				}

				var0.method6419(); // L: 225
			} else {
				int var2 = class169.field1878.readInt(); // L: 230
				int var3 = class169.field1878.readInt(); // L: 231
				var0.loadIndex(var2, var3); // L: 232
			}

		} else {
			VarpDefinition.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true); // L: 236
			NetCache.NetCache_archives[var1] = var0; // L: 237
		}
	} // L: 234 238

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqx;I)V",
		garbageValue = "-2117327604"
	)
	static final void method5841(PacketBuffer var0) {
		for (int var1 = 0; var1 < Players.Players_pendingUpdateCount; ++var1) { // L: 445
			int var2 = Players.Players_pendingUpdateIndices[var1]; // L: 446
			Player var3 = Client.players[var2]; // L: 447
			int var4 = var0.readUnsignedByte(); // L: 448
			if ((var4 & 64) != 0) { // L: 449
				var4 += var0.readUnsignedByte() << 8;
			}

			HorizontalAlignment.method3660(var0, var2, var3, var4); // L: 450
		}

	} // L: 452

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkd;I)I",
		garbageValue = "1828008662"
	)
	static int method5846(Widget var0) {
		if (var0.type != 11) { // L: 1518
			--Interpreter.Interpreter_stringStackSize; // L: 1519
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 1520
			return 1; // L: 1521
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1523
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var0.method6173(var1); // L: 1524
			return 1; // L: 1525
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZB)I",
		garbageValue = "7"
	)
	static int method5844(int var0, Script var1, boolean var2) {
		return 2; // L: 4898
	}
}
